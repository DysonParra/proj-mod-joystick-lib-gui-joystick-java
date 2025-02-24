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
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.joystick.listener;

/**
 * FIXME: Description of {@code JoystickServerListener}. Contiene las acciones que ejecuta un
 * joystick servidor en algún momento específico.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public interface JoystickServerListener {

    /**
     * FIXME: Description of {@code onClientConnected}. Realiza una acción luego de que se obtenga
     * una petición de conección al joystick genérico.
     */
    public abstract void onClientConnected();

    /**
     * FIXME: Description of {@code onClientDisconnected}. Realiza una acción luego de que se obtenga
     * una petición de desconexión al joystick genérico.
     */
    public abstract void onClientDisconnected();
}
