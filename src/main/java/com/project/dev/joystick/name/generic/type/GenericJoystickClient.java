/*
 * @overview        {GenericJoystickClient}
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
package com.project.dev.joystick.name.generic.type;

import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.listener.JoystickClientListener;
import com.project.dev.joystick.name.generic.GenericRemoteJoystick;
import com.project.dev.udp.generic.GenericUdpClient;
import lombok.Data;

/**
 * FIXME: Description of {@code GenericJoystickClient}. Contiene las definiciones y operaciones para
 * un joystick que se comunica con otro através de la web y para uno que unicamente recibe las
 * peticiones.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public class GenericJoystickClient extends GenericRemoteJoystick {

    public static int DEFAUL_TIMEOUT_TEST_REQUEST = 3000;                               // Valor por defecto del timeOut de una petición de probar conexión.
    public static int DEFAUL_TIMEOUT_CONNECTION_REQUEST = 3000;                         // Valor por defecto del timeOut de una petición de conexión.
    public static int DEFAUL_TIMEOUT_UPDATE_BUTTONS_REQUEST = 3000;                     // Valor por defecto del timeOut de una petición de actualizar botones.
    public static int DEFAUL_TIMEOUT_DISCONNECTION_REQUEST = 3000;                      // Valor por defecto del timeOut de una petición de desconexión.

    protected int timeOutTestRequest = DEFAUL_TIMEOUT_CONNECTION_REQUEST;               // Tiempo máximo de espera para un intento de prueba de conexión con ae servidor.
    protected int timeOutConnectionRequest = DEFAUL_TIMEOUT_CONNECTION_REQUEST;         // Tiempo máximo de espera para un intento de conexión al servidor.
    protected int timeOutUpdateButtonsRequest = DEFAUL_TIMEOUT_UPDATE_BUTTONS_REQUEST;  // Tiempo máximo de espera para un intento de actualizar los estados de los botones del servidor.
    protected int timeOutDisconnectionRequest = DEFAUL_TIMEOUT_DISCONNECTION_REQUEST;   // Tiempo máximo de espera para un intento de desconexión al servidor.

    protected final GenericUdpClient udpClient;                                         // Cliente udp del joystick.
    protected JoystickClientListener onJoystickClientListener = null;                   // Listener al joystick cliente.

    /**
     * TODO: Description of method {@code GenericJoystickClient}.
     *
     * @throws java.lang.Exception
     */
    public GenericJoystickClient() throws Exception {
        super(GenericRemoteJoystick.JOYSTICK_TYPE_CLIENT);
        this.udpClient = new GenericUdpClient();
    }

    /**
     * TODO: Description of method {@code GenericJoystickClient}.
     *
     * @param name es el nombre del joystick.
     * @throws java.lang.Exception
     */
    public GenericJoystickClient(String name) throws Exception {
        this();
        this.name = name;
    }

    /**
     * TODO: Description of method {@code GenericJoystickClient}.
     *
     * @param serverIpAddress es la dirección ip del servidor.
     * @param serverPort      Es el puerto del servidor.
     * @throws java.lang.Exception
     */
    public GenericJoystickClient(String serverIpAddress, int serverPort) throws Exception {
        this();
        this.serverIpAddress = serverIpAddress;                                         // Almacena la dirección ip del servidor.
        this.serverPort = serverPort;                                                   // Almacena el pueto de conexión del servidor.
        this.udpClient.setServerIpAddress(serverIpAddress);                             // Asigna dirección al cliente udp.
        this.udpClient.setServerPort(serverPort);                                       // Asigna puerto al cliente udp.
    }

    /**
     * TODO: Description of method {@code isConnectedToJoystickServer}.
     *
     * @return
     */
    public final boolean isConnectedToJoystickServer() {
        return udpClient.isConnectedToServer();
    }

    /**
     * TODO: Description of method {@code setServerIpAddress}.
     *
     */
    @Override
    public final void setServerIpAddress(String serverIpAddress) throws Exception {
        this.serverIpAddress = serverIpAddress;
        this.udpClient.setServerIpAddress(serverIpAddress);
    }

    /**
     * TODO: Description of method {@code setServerPort}.
     *
     * @param serverPort
     * @throws java.lang.Exception
     */
    @Override
    public final void setServerPort(int serverPort) throws Exception {
        this.serverPort = serverPort;
        this.udpClient.setServerPort(serverPort);
    }

    /**
     * TODO: Description of method {@code setButtons}.
     *
     * @param joystickButtons
     * @throws java.lang.Exception
     */
    @Override
    public final void setButtons(GenericButton[] joystickButtons) throws Exception {
        throw new UnsupportedOperationException("Cannot set buttons for joystick from type = '" + this.getType() + "'");
    }

    /**
     * TODO: Description of method {@code setName}.
     *
     * @param name
     */
    @Override
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * FIXME: Description of method {@code onButtonStateChanged}. Invocado cuando se cambia el estado del
     * componente gráfico de un botón.
     *
     * @param buttonNumber   es el número del botón que cambió.
     * @param newButtonState es el nuevo estado del botón.
     * @return Si fue posible cambiar el estado del botón.
     */
    @Override
    public final boolean onButtonStateChanged(int buttonNumber, byte newButtonState) {
        this.prevButtonsStates[buttonNumber] = this.currentButtonsStates[buttonNumber];
        this.currentButtonsStates[buttonNumber] = newButtonState;
        //System.out.println(getJoystickType() + ": " + new String(getCurrentButtonsStates()));
        if (!this.udpClient.sendGenericRequest(timeOutUpdateButtonsRequest, currentButtonsStates, false)) {
            this.currentButtonsStates[buttonNumber] = this.prevButtonsStates[buttonNumber];
            if (onJoystickClientListener != null)
                onJoystickClientListener.onUpdateButtonsStatesTimeOut();
            return false;
        }
        return true;
    }

    /**
     * FIXME: Description of method {@code testServerConnection}. Prueba la conexión a un servidor con un
     * joystick.
     *
     * @return si se pudo establecer la conexión con el servidor.
     */
    public final boolean testServerConnection() {
        return udpClient.sendTestConnectionRequest(timeOutTestRequest);
    }

    /**
     * FIXME: Description of method {@code connectToServer}. Se conecta a un servidor con un joystick.
     *
     * @return si se pudo conectar el servidor.
     */
    public final boolean connectToServer() {
        if (udpClient.sendConnectRequest(timeOutConnectionRequest)) {               // Si es posible conectarse al servidor.
            udpClient.sendGenericRequest(1000, GET_BUTTON_QUANTITY_REQUEST, true);  // Obtiene la cantidad de botones sel servidor.
            buttonQuantity = Integer.parseInt(udpClient.getStringResponse());

            udpClient.sendGenericRequest(1000, GET_JOYSTICK_NAME_REQUEST, true);    // Obtiene el nombre del joystick sel servidor.
            setName(udpClient.getStringResponse());                                 // Asigna al joystick el mismo nombre que el servidor.

            buttons = new GenericButton[buttonQuantity];
            currentButtonsStates = new byte[buttonQuantity];                        // Estados de cada botón.
            prevButtonsStates = new byte[buttonQuantity];                           // Estados anteriores de cada botón.
            String buttonName;                                                      // Nombre de cada botón a crear.

            for (int i = 0; i < buttons.length; i++) {
                currentButtonsStates[i] = GenericJoystickClient.BUTTON_UNPRESSED;
                udpClient.sendGenericRequest(1000, GET_BUTTON_NAME_REQUEST + i, true);
                buttonName = udpClient.getStringResponse();
                buttons[i] = new GenericButton(buttonName);                         // Crea un nuevo botón.
                //System.out.println(buttonName);
                buttons[i].setId(i);                                                // Asigna número al botón.
                buttons[i].setJoystick(this);                                       // Asocia el joystick actual con el botón.
            }
            return udpClient.sendConfirmRequest(1000);                              // Devuelve indicando si pudo enviar al servidor petición de confirmación.
        } else                                                                      // Si no es posible conectarse al servidor.
            return false;                                                           // Devuelve indicando operación no exitosa.
    }

    /**
     * FIXME: Description of method {@code disconnectToServer}. Se desconecta de de un servidor con un
     * joystick.
     *
     * @return si se pudo desconectar del servidor.
     */
    public final boolean disconnectToServer() {
        return udpClient.sendDisconnectRequest(timeOutDisconnectionRequest);    // Devuelve si es posible conectarse al servidor.
    }
}
