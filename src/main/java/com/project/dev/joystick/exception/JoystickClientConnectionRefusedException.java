/*
 * @fileoverview    {JoystickClientConnectionRefusedException}
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
package com.project.dev.joystick.exception;

/**
 * FIXME: Definición de {@code JoystickClientConnectionRefusedException}. Exception que ocurre
 * cuando al usar la fábrica de joystick el cliente especificado no puede conectarse con el
 * servidor.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class JoystickClientConnectionRefusedException extends Exception {

    /**
     * TODO: Definición de {@code JoystickClientConnectionRefusedException}.
     *
     * @param message es el mensaje que mostrará la exception.
     */
    public JoystickClientConnectionRefusedException(String message) {
        super(message);
    }
}
