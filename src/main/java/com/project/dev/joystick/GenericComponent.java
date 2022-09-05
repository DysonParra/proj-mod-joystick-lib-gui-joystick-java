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
