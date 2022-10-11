/*
 * @fileoverview {NintendoJoystickButtonSetter} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {NintendoJoystickButtonSetter} fue realizada el 31/07/2022.
 * @Dev - La primera version de {NintendoJoystickButtonSetter} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.name.nintendo.setter;

import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;

/**
 * FIXME: Definición de {@code NintendoJoystickButtonSetter}. Contiene las operaciones generales
 * para un joystick de cualquier tipo (excepto tipo cliente) y de nombre nintendo, para asignarle
 * los botones.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class NintendoJoystickButtonSetter extends GenericJoystickButtonSetter {

    protected NintendoJoystick nintendoJoystick;

    /**
     * FIXME: Definición de {@code setGenericJoystickButtons}. Agrega los botones al joystick
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
