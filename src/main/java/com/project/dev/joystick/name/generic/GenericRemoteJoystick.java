/*
 * @overview        {GenericRemoteJoystick}
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
package com.project.dev.joystick.name.generic;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * FIXME: Description of {@code GenericRemoteJoystick}. Contiene las operaciones y definiciones
 * generales que contiene un joystick de cualquier tipo y nombre, y además definiciones específicas
 * para un joystick que se comunica con otro através de la web haciendo uso de la biblioteca
 * GenericUdp.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public abstract class GenericRemoteJoystick extends GenericJoystick {

    protected static final String GET_BUTTON_QUANTITY_REQUEST = "get_btn_quant";            // Petición para obtener la cantidad de botones de un joystick servidor.
    protected static final String GET_JOYSTICK_NAME_REQUEST = "get_joyst_name";             // Petición para obtener el nombre del joystick servidor.
    protected static final String GET_BUTTON_NAME_REQUEST = "get_btn_name:";                // Petición para obtener el nombre de un botón de un joystick servidor.
    protected static final String GET_BUTTON_NAME_REQUEST_REGEX = "get_btn_name:[0-9]+";    // Petición para obtener el nombre de un botón de un joystick servidor.
    @Setter(AccessLevel.NONE)
    protected String serverIpAddress;                                                       // Dirección ip del servidor ya sea a la que está conectado si es un cliente, o la direción actual si es un servidor.
    @Setter(AccessLevel.NONE)
    protected int serverPort;                                                               // Puerto de conexión del servidor ya sea al que está conectado si es un cliente, o el puerto actual si es un servidor.

    /**
     * TODO: Description of method {@code GenericRemoteJoystick}.
     *
     * @param type es el tipo de joystick que será.
     * @param name es el nombre del joystick.
     * @throws java.lang.Exception
     */
    public GenericRemoteJoystick(String type, String name) throws Exception {
        super(type, name);
        this.serverIpAddress = null;                                            // Inicializa la dirección ip del servidor.
        this.serverPort = 0;                                                    // Inicializa la el puerto de conexión del servidor.
    }

    /**
     * TODO: Description of method {@code GenericRemoteJoystick}.
     *
     * @param type es el tipo de joystick que será.
     * @throws java.lang.Exception
     */
    public GenericRemoteJoystick(String type) throws Exception {
        this(type, GenericJoystick.JOYSTICK_NAME_GENERIC);
    }

    /**
     * Get the current {@code Object} as {@code String}.
     *
     * @return {@code String} representing this {@code Object}.
     */
    @Override
    public String toString() {
        return super.toString() + ",GenericRemoteJoystick{" + "serverIpAddress=" + serverIpAddress + ", serverPort=" + serverPort + '}';
    }

    /**
     * FIXME: Description of method {@code setServerIpAddress}. Agrega dirección ip del servidor donde se va
     * aconectar a un joystick remoto.
     *
     * @param serverIpAddress Es la dirección ip del servidor.
     * @throws Exception
     */
    protected abstract void setServerIpAddress(String serverIpAddress) throws Exception;

    /**
     * FIXME: Description of method {@code setServerPort}. Escoge el puerto de conexión ya sea del servidor
     * o donde se conectará el cliente.
     *
     * @param serverPort Es el puerto d econexión del servidor.
     * @throws Exception
     */
    protected abstract void setServerPort(int serverPort) throws Exception;
}
