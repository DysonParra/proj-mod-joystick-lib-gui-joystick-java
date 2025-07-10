/*
 * @overview        {GenericComponent}
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
package com.project.dev.joystick;

import java.io.Serializable;

/**
 * FIXME: Description of {@code GenericComponent}. Se usa para tipar todos los objetos de la
 * biblioteca, y que además contiene los estados de los botones de un GenericButton para que todas
 * las clases sepan cuales son.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public interface GenericComponent extends Serializable {

    public static final byte BUTTON_PRESSED = 'P';                              // Botón genérico en el estado presionado.
    public static final byte BUTTON_UNPRESSED = 'U';                            // Botón genérico en el estado no presionado.
    public static final byte BUTTON_RELEASED = 'R';                             // Botón genérico en el estado soltado.
    public static final byte BUTTON_TYPED = 'T';                                // Botón genérico en el estado acabado de presionar.
}
