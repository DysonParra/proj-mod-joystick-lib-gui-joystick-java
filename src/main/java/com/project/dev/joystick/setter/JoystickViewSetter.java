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
package com.project.dev.joystick.setter;

import com.project.dev.joystick.graphic.GraphicJoystick;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickGraphicSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FIXME: Definición de {@code T}. Se usa para asignar la parte gráfica a un joystick de cualquier
 * tipo y nombre.
 *
 * @author Dyson Parra
 * @since 1.8
 * @param <T> Es el tipo de dato de donde se asignará el joystick (JFrame o ViewGroup por ejemplo).
 */
@AllArgsConstructor
//@Builder
@Data
@NoArgsConstructor
public abstract class JoystickViewSetter<T> {

    /* Vista donde se asignará el joystick (JFrame o ViewGroup por ejemplo) */
    protected T view;

    /**
     * FIXME: Definición de {@code addJoystickToView}. Asigna un joystick con su respectivo
     * asignador gráfico a la vista.
     *
     * @param joystick      es el joystick.
     * @param graphicSetter es el asignador de gráficos del joystick.
     * @return el joystick gráfico.
     * @throws java.lang.Exception Si ocurre un error.
     */
    public abstract GraphicJoystick addJoystickToView(GenericJoystick joystick, GenericJoystickGraphicSetter graphicSetter) throws Exception;
}
