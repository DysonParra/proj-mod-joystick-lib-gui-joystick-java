/*
 * @fileoverview {FileName} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {FileName} fue realizada el 31/07/2022.
 * @Dev - La primera version de {FileName} fue escrita por Dyson A. Parra T.
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
