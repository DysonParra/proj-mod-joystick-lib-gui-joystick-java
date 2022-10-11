/*
 * @fileoverview {JoystickClientListener} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {JoystickClientListener} fue realizada el 31/07/2022.
 * @Dev - La primera version de {JoystickClientListener} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.listener;

/**
 * FIXME: Definición de {@code JoystickClientListener}. Contiene las acciones que ejecuta un
 * joystick cliente en algún momento específico.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public interface JoystickClientListener {

    /**
     * FIXME: Definición de {@code onUpdateButtonsStatesTimeOut}. Realiza una acción luego de no sea
     * posible actualizar el estado de los botones del joystick servidor.
     */
    public abstract void onUpdateButtonsStatesTimeOut();
}
