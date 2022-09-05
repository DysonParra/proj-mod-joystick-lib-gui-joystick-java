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
package com.project.dev.joystick.name.nintendo.type;

import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.generic.type.GenericJoystickLocal;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;
import com.project.dev.joystick.name.nintendo.setter.NintendoJoystickButtonSetter;

/**
 * FIXME: Definición de {@code NintendoJoystickLocal}. Contiene las definiciones y operaciones para
 * un joystick de nombre nintendo que funciona localmente.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class NintendoJoystickLocal extends GenericJoystickLocal implements NintendoJoystick {

    /**
     * TODO: Definición de {@code NintendoJoystickLocal}.
     *
     * @throws java.lang.Exception
     */
    public NintendoJoystickLocal() throws Exception {
        super(JOYSTICK_NAME);
        GenericJoystickButtonSetter buttonSetter = new NintendoJoystickButtonSetter();
        buttonSetter.setGenericJoystickButtons(this);
    }
}
