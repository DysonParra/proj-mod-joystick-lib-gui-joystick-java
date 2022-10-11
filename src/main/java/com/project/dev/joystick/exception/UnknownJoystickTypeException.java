/*
 * @fileoverview {UnknownJoystickTypeException} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {UnknownJoystickTypeException} fue realizada el 31/07/2022.
 * @Dev - La primera version de {UnknownJoystickTypeException} fue escrita por Dyson A. Parra T.
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
