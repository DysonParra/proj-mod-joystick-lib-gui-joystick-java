/*
 * @fileoverview    {GenericButtonGraphicListener}
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
import com.project.dev.joystick.graphic.GenericImage;

/**
 * FIXME: Description of {@code GenericButtonGraphicListener}. Contiene la acción que realiza un componente
 * asociado a un botón genérico para cambiar de imagen genérica cuando el botón cambia de estado.
 *
 * @param <T> Es el tipo de dato de donde se asignará la parte gráfica del botón (JLabel o ImageView
 *            por ejemplo).
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public abstract class GenericButtonGraphicListener<T> implements GenericComponent {

    protected T view;

    /**
     * TODO: Description of {@code GenericButtonGraphicListener}.
     *
     * @param view es la vista donde se asignará la parte gráfica del botón (JLabel o ImageView por
     *             ejemplo).
     */
    public GenericButtonGraphicListener(T view) {
        this.view = view;
    }

    /**
     * TODO: Description of {@code getView}.
     *
     * @return
     */
    public T getView() {
        return view;
    }

    /**
     * TODO: Description of {@code setView}.
     *
     * @param view
     */
    public void setView(T view) {
        this.view = view;
    }

    /**
     * FIXME: Description of {@code onButtonStateChanged}. Realiza una acción luego de que el botón
     * al que pertenece cambia de estado.
     *
     * @param newState es el nuevo estado del botón.
     * @param newImage es la nueva imagen del botón.
     */
    public abstract void onButtonStateChanged(byte newState, GenericImage newImage);
}
