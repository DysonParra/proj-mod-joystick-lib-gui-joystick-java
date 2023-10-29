/*
 * @fileoverview    {JoystickFactory}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.joystick.factory;

import com.project.dev.joystick.exception.JoystickClientConnectionRefusedException;
import com.project.dev.joystick.exception.JoystickNotFoundException;
import com.project.dev.joystick.exception.UnknownJoystickTypeException;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.type.GenericJoystickClient;
import com.project.dev.joystick.name.generic.type.GenericJoystickServer;
import java.lang.reflect.Constructor;

import static com.project.dev.joystick.name.generic.GenericJoystick.JOYSTICK_TYPE_CLIENT;
import static com.project.dev.joystick.name.generic.GenericJoystick.JOYSTICK_TYPE_LOCAL;
import static com.project.dev.joystick.name.generic.GenericJoystick.JOYSTICK_TYPE_SERVER;

/**
 * FIXME: Definición de {@code JoystickFactory}. Se usa para fabricar joystick, buscando el nombre
 * del joystick en el classpath.
 *
 * @author Dyson Parra
 * @since 11
 */
public class JoystickFactory {

    /**
     * FIXME: Definición de {@code makeJoystick}. Crea un joystick con la información indicada.
     *
     * @param type       es el tipo de joystick que se creará (Local, cliente o servidor). Usar los
     *                   tipos especificado en "GenericJoystick.JOYSTICK_TYPE_????".
     * @param name       es el nombre del joystick que se creará, buscandolo en el classpath en
     *                   "com.project.dev.joystick.name.{@code name}".
     * @param ipAddress  Es la dirección ip donde se conectará el joystick cliente en caso de ser de
     *                   este tipo, caso contario usar cualquier valor.
     * @param serverPort Es el puerto de conexión donde se conectará el joystick cliente en caso de
     *                   ser de este tipo, caso contario usar cualquier valor.
     * @return un joystick.
     * @throws JoystickClientConnectionRefusedException
     * @throws JoystickNotFoundException
     * @throws UnknownJoystickTypeException
     * @throws java.lang.Exception
     */
    public static GenericJoystick makeJoystick(String type, String name, String ipAddress, int serverPort) throws JoystickNotFoundException, JoystickClientConnectionRefusedException, UnknownJoystickTypeException, Exception {
        String joystickPackage;                                                                             // Nombre del paquete donde está el joystick.
        String typePackage;                                                                                 // Nombre del paquete donde está el tipo de joystick.

        GenericJoystick joystick = null;                                                                    // Crea un joystick genérico.
        Class<?> joystickClass;                                                                             // Clase del joystick dependiendo del tipo y nombre del joystick indicado.
        Constructor joystickConstructor;                                                                    // Constructor del joystick.

        switch (type) {                                                                                     // Evalúa el tipo de joystick a crear.
            case JOYSTICK_TYPE_CLIENT:                                                                      // Si se indicó crear un joystick cliente.

                GenericJoystickClient client = null;                                                        // Crea un joystick cliente.
                try {
                    client = new GenericJoystickClient();                                                   // Inicializa el joystick cliente.
                    client.setServerIpAddress(ipAddress);                                                   // Asigna ip al cliente.
                    client.setServerPort(serverPort);                                                       // Asigna puerto al cliente.
                } catch (Exception e) {                                                                     // Si ocurre un problema iniciando el cliente.
                    throw e;                                                                                // Lanza la exception obtenida.
                }
                client.connectToServer();                                                                   // Intenta conectarse con el servidor.
                joystick = client;
                if (!client.isConnectedToJoystickServer()) {                                                // Si no fue posible conectarse al servidor.
                    throw new JoystickClientConnectionRefusedException("Could not connect with the especified server.");    // Crea exception indicando conexión no exitosa.
                }
                break;                                                                                      // Sale del case.

            case JOYSTICK_TYPE_SERVER:                                                                      // Si se indicó crear un joystick servidor.
                joystickPackage = "com.project.dev.joystick.name." + name.toLowerCase();                    // Obtiene el nombre del paquete donde está el joystick.
                typePackage = joystickPackage + ".type.";                                                   // Obtiene el nombre del paquete donde está el tipo de joystick.
                try {
                    joystickClass = Class.forName(typePackage + name + "JoystickServer");                   // Obtiene la clase del joystick servidor con nombre indicado.
                    joystickConstructor = joystickClass.getConstructor();                                   // Obtiene el constructor del joystick con nombre indicado.
                    joystick = (GenericJoystick) joystickConstructor.newInstance();                         // Crea nueva instancia del joystick con el nombre indicado.
                    ((GenericJoystickServer) joystick).startServer();                                       // Inicializa el servidor.
                } catch (ClassNotFoundException e) {                                                        // Si no encuentra la clase.
                    throw new JoystickNotFoundException("Cannot get joystick in : " + typePackage + name + "JoystickServer");
                } catch (Exception e) {                                                                     // Si no encuentra el constuctor.
                    throw new JoystickNotFoundException("Error invoicing deafult constructor from joystick in : "
                            + typePackage + name + "JoystickServer");
                }
                break;                                                                                      // Sale del case.

            case JOYSTICK_TYPE_LOCAL:                                                                       // Si se indicó crear un joystick local.
                joystickPackage = "com.project.dev.joystick.name." + name.toLowerCase();                    // Obtiene el nombre del paquete donde está el joystick.
                typePackage = joystickPackage + ".type.";                                                   // Obtiene el nombre del paquete donde está el tipo de joystick.
                try {
                    joystickClass = Class.forName(typePackage + name + "JoystickLocal");                    // Obtiene la clase del joystick local con nombre indicado.
                    joystickConstructor = joystickClass.getConstructor();                                   // Obtiene el constructor del joystick con nombre indicado.
                    joystick = (GenericJoystick) joystickConstructor.newInstance();                         // Crea nueva instancia del joystick con el nombre indicado.
                } catch (ClassNotFoundException e) {                                                        // Si no encuentra la clase.
                    throw new JoystickNotFoundException("Cannot get joystick in : " + typePackage + name + "JoystickLocal");
                } catch (Exception e) {                                                                     // Si no encuentra el constuctor.
                    throw new JoystickNotFoundException("Error invoicing deafult constructor from joystick in : "
                            + typePackage + name + "JoystickLocal");
                }
                break;                                                                                      // Sale del case.

            default:                                                                                        // Si no es ningún tipo conocido.
                throw new UnknownJoystickTypeException("Unknown joystick type: " + type);                   // Crea exception indicando tipo no válido.
        }

        return joystick;
    }
}
