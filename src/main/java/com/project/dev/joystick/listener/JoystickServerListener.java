/*
 * @fileoverview    {JoystickServerListener}
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
