/*
 * @overview        {GenericJoystickButtonSetter}
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
package com.project.dev.joystick.name.generic.setter;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Description of {@code GenericJoystickButtonSetter}. Especifica el comportamiento general
 * para un joystick de cualquier nombre y tipo (excepto tipo cliente), para asignarle los botones.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public abstract class GenericJoystickButtonSetter implements GenericComponent {

    /**
     * FIXME: Description of method {@code setGenericJoystickButtons}. Agrega los botones al joystick
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
     * FIXME: Description of method {@code setGenericJoystickButtons}. Agrega los botones al joystick
     * genérico.
     *
     * @param genericJoystick es el joystick genérico.
     * @throws java.lang.Exception Si no fue posible asignar los botones al joystick.
     */
    public abstract void setGenericJoystickButtons(GenericJoystick genericJoystick) throws Exception;
}
