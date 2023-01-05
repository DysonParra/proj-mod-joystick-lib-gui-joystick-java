/*
 * @fileoverview    {GenericComponent} se encarga de realizar tareas específicas.
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
package com.project.dev.joystick;

import java.io.Serializable;

/**
 * FIXME: Definición de {@code GenericComponent}. Se usa para tipar todos los objetos de la
 * biblioteca, y que además contiene los estados de los botones de un GenericButton para que todas
 * las clases sepan cuales son.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public interface GenericComponent extends Serializable {

    public static final byte BUTTON_PRESSED = 'P';                              // Botón genérico en el estado presionado.
    public static final byte BUTTON_UNPRESSED = 'U';                            // Botón genérico en el estado no presionado.
    public static final byte BUTTON_RELEASED = 'R';                             // Botón genérico en el estado soltado.
    public static final byte BUTTON_TYPED = 'T';                                // Botón genérico en el estado acabado de presionar.
}
