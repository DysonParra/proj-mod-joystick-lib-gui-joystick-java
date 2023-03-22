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
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.joystick.exception;

/**
 * FIXME: Definición de {@code UnknownJoystickTypeException}. Exception que ocurre cuando al usar la
 * fábrica de joystick el tipo de joystick especificado no existe.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class UnknownJoystickTypeException extends Exception {

    /**
     * TODO: Definición de {@code UnknownJoystickTypeException}.
     *
     * @param message es el mensaje que mostrará la exception.
     */
    public UnknownJoystickTypeException(String message) {
        super(message);
    }
}
