/*
 * @fileoverview    {JoystickClientListener}
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
