/*
 * @fileoverview    {JoystickNotFoundException}
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
 * FIXME: Definición de {@code JoystickNotFoundException}. Exception que ocurre cuando al usar la
 * fábrica de joystick el joystick con el nombre indicado no es encontrado en el classpath.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class JoystickNotFoundException extends Exception {

    /**
     * TODO: Definición de {@code JoystickNotFoundException}.
     *
     * @param message es el mensaje que mostrará la exception.
     */
    public JoystickNotFoundException(String message) {
        super(message);
    }
}
