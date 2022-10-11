/*
 * @fileoverview {JoystickServerListener} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {JoystickServerListener} fue realizada el 31/07/2022.
 * @Dev - La primera version de {JoystickServerListener} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.listener;

/**
 * FIXME: Definición de {@code JoystickServerListener}. Contiene las acciones que ejecuta un
 * joystick servidor en algún momento específico.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public interface JoystickServerListener {

    /**
     * FIXME: Definición de {@code onClientConnected}. Realiza una acción luego de que se obtenga
     * una petición de conección al joystick genérico.
     */
    public abstract void onClientConnected();

    /**
     * FIXME: Definición de {@code onClientDisconnected}. Realiza una acción luego de que se obtenga
     * una petición de desconexión al joystick genérico.
     */
    public abstract void onClientDisconnected();
}
