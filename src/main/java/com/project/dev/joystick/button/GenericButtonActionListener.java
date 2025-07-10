/*
 * @overview        {GenericButtonActionListener}
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
package com.project.dev.joystick.button;

import com.project.dev.joystick.GenericComponent;

/**
 * FIXME: Description of {@code GenericButtonActionListener}. Contiene las acciones que realiza un
 * botón genérico cuando cambia de estado.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public abstract class GenericButtonActionListener implements GenericComponent {

    /**
     * FIXME: Description of method {@code onTyped}. Realiza una acción luego de que el botón es presionado.
     *
     */
    public abstract void onTyped();

    /**
     * FIXME: Description of method {@code onPressed}. Realiza una acción luego de que el botón se mantiene
     * presionado.
     *
     */
    public abstract void onPressed();

    /**
     * FIXME: Description of method {@code onReleased}. Realiza una acción luego de que el botón es soltado.
     *
     */
    public abstract void onReleased();

    /**
     * FIXME: Description of method {@code onUnpressed}. Realiza una acción luego de que el botón se
     * mantiene no presionado.
     *
     */
    public abstract void onUnpressed();
}
