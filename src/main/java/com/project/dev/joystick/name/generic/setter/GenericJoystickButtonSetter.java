/*
 * @fileoverview    {GenericJoystickButtonSetter}
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
package com.project.dev.joystick.name.generic.setter;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Definición de {@code GenericJoystickButtonSetter}. Especifica el comportamiento general
 * para un joystick de cualquier nombre y tipo (excepto tipo cliente), para asignarle los botones.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public abstract class GenericJoystickButtonSetter implements GenericComponent {

    /**
     * FIXME: Definición de {@code setGenericJoystickButtons}. Agrega los botones al joystick
     * genérico.
     *
     * @param genericJoystick es el joystick genérico.
     * @param buttons         son los botones que se agregarán al joystick.
     * @throws java.lang.Exception Si no fue posible asignar los botones al joystick.
     */
    public final void setGenericJoystickButtons(GenericJoystick genericJoystick, GenericButton[] buttons) throws Exception {
        genericJoystick.setButtons(buttons);
    }

    /**
     * FIXME: Definición de {@code setGenericJoystickButtons}. Agrega los botones al joystick
     * genérico.
     *
     * @param genericJoystick es el joystick genérico.
     * @throws java.lang.Exception Si no fue posible asignar los botones al joystick.
     */
    public abstract void setGenericJoystickButtons(GenericJoystick genericJoystick) throws Exception;
}
