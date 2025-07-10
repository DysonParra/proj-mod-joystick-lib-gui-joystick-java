/*
 * @overview        {NintendoJoystickButtonSetter}
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
package com.project.dev.joystick.name.nintendo.setter;

import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;

/**
 * FIXME: Description of {@code NintendoJoystickButtonSetter}. Contiene las operaciones generales
 * para un joystick de cualquier tipo (excepto tipo cliente) y de nombre nintendo, para asignarle
 * los botones.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class NintendoJoystickButtonSetter extends GenericJoystickButtonSetter {

    protected NintendoJoystick nintendoJoystick;

    /**
     * FIXME: Description of method {@code setGenericJoystickButtons}. Agrega los botones al joystick
     * genérico.
     *
     * @param genericJoystick es el joystick genérico.
     * @throws java.lang.Exception Si no fue posible asignar los botones al joystick.
     */
    @Override
    public final void setGenericJoystickButtons(GenericJoystick genericJoystick) throws Exception {
        nintendoJoystick = (NintendoJoystick) genericJoystick;
        genericJoystick.setButtons(new GenericButton[]{
            new GenericButton(NintendoJoystick.BUTTON_LEFT_NAME),
            new GenericButton(NintendoJoystick.BUTTON_RIGHT_NAME),
            new GenericButton(NintendoJoystick.BUTTON_UP_NAME),
            new GenericButton(NintendoJoystick.BUTTON_DOWN_NAME),
            new GenericButton(NintendoJoystick.BUTTON_MEDIUM_NAME),
            new GenericButton(NintendoJoystick.BUTTON_START_NAME),
            new GenericButton(NintendoJoystick.BUTTON_SELECT_NAME),
            new GenericButton(NintendoJoystick.BUTTON_Y_NAME),
            new GenericButton(NintendoJoystick.BUTTON_X_NAME),
            new GenericButton(NintendoJoystick.BUTTON_B_NAME),
            new GenericButton(NintendoJoystick.BUTTON_A_NAME)
        });
    }
}
