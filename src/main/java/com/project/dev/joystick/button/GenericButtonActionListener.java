/*
 * @fileoverview    {GenericButtonActionListener} se encarga de realizar tareas específicas.
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
package com.project.dev.joystick.button;

import com.project.dev.joystick.GenericComponent;

/**
 * FIXME: Definición de {@code GenericButtonActionListener}. Contiene las acciones que realiza un
 * botón genérico cuando cambia de estado.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public abstract class GenericButtonActionListener implements GenericComponent {

    /**
     * FIXME: Definición de {@code onTyped}. Realiza una acción luego de que el botón es presionado.
     */
    public abstract void onTyped();

    /**
     * FIXME: Definición de {@code onPressed}. Realiza una acción luego de que el botón se mantiene
     * presionado.
     */
    public abstract void onPressed();

    /**
     * FIXME: Definición de {@code onReleased}. Realiza una acción luego de que el botón es soltado.
     */
    public abstract void onReleased();

    /**
     * FIXME: Definición de {@code onUnpressed}. Realiza una acción luego de que el botón se
     * mantiene no presionado.
     */
    public abstract void onUnpressed();
}
