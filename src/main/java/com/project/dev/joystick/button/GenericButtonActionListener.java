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
