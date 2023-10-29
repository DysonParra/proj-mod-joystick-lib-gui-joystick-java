/*
 * @fileoverview    {JoystickViewSetter}
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
package com.project.dev.joystick.setter;

import com.project.dev.joystick.graphic.GraphicJoystick;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickGraphicSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FIXME: Description of {@code JoystickViewSetter}. Se usa para asignar la parte gráfica a un joystick de cualquier
 * tipo y nombre.
 *
 * @param <T> Es el tipo de dato de donde se asignará el joystick (JFrame o ViewGroup por ejemplo).
 *
 * @author Dyson Parra
 * @since 11
 */
@AllArgsConstructor
//@Builder
@Data
@NoArgsConstructor
public abstract class JoystickViewSetter<T> {

    /* Vista donde se asignará el joystick (JFrame o ViewGroup por ejemplo) */
    protected T view;

    /**
     * FIXME: Description of {@code addJoystickToView}. Asigna un joystick con su respectivo
     * asignador gráfico a la vista.
     *
     * @param joystick      es el joystick.
     * @param graphicSetter es el asignador de gráficos del joystick.
     * @return el joystick gráfico.
     * @throws java.lang.Exception Si ocurre un error.
     */
    public abstract GraphicJoystick addJoystickToView(GenericJoystick joystick, GenericJoystickGraphicSetter graphicSetter) throws Exception;
}
