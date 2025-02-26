/*
 * @fileoverview    {UnknownJoystickTypeException}
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
 * FIXME: Description of {@code UnknownJoystickTypeException}. Exception que ocurre cuando al usar la
 * fábrica de joystick el tipo de joystick especificado no existe.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class UnknownJoystickTypeException extends Exception {

    /**
     * TODO: Description of method {@code UnknownJoystickTypeException}.
     *
     * @param message es el mensaje que mostrará la exception.
     */
    public UnknownJoystickTypeException(String message) {
        super(message);
    }
}
