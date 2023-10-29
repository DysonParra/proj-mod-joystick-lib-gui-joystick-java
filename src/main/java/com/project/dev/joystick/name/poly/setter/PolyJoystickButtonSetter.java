/*
 * @fileoverview    {PolyJoystickButtonSetter}
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
package com.project.dev.joystick.name.poly.setter;

import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.poly.PolyJoystick;

/**
 * FIXME: Definición de {@code PolyJoystickButtonSetter}. Contiene las operaciones generales para un
 * joystick de cualquier tipo (excepto tipo cliente) y de nombre poly, para asignarle los botones.
 *
 * @author Dyson Parra
 * @since 11
 */
public class PolyJoystickButtonSetter extends GenericJoystickButtonSetter {

    protected PolyJoystick polyJoystick;

    /**
     * FIXME: Definición de {@code setGenericJoystickButtons}. Agrega los botones al joystick
     * genérico.
     *
     * @param genericJoystick es el joystick genérico.
     * @throws java.lang.Exception Si no fue posible asignar los botones al joystick.
     */
    @Override
    public final void setGenericJoystickButtons(GenericJoystick genericJoystick) throws Exception {
        polyJoystick = (PolyJoystick) genericJoystick;
        genericJoystick.setButtons(new GenericButton[]{
            new GenericButton(PolyJoystick.BUTTON_LEFT_NAME),
            new GenericButton(PolyJoystick.BUTTON_RIGHT_NAME),
            new GenericButton(PolyJoystick.BUTTON_UP_NAME),
            new GenericButton(PolyJoystick.BUTTON_DOWN_NAME),
            new GenericButton(PolyJoystick.BUTTON_START_NAME),
            new GenericButton(PolyJoystick.BUTTON_SELECT_NAME),
            new GenericButton(PolyJoystick.BUTTON_SQUARE_NAME),
            new GenericButton(PolyJoystick.BUTTON_TRIANGLE_NAME),
            new GenericButton(PolyJoystick.BUTTON_CIRCLE_NAME),
            new GenericButton(PolyJoystick.BUTTON_EKS_NAME)
        });
    }
}
