/*
 * @fileoverview {NintendoJoystickServer} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {NintendoJoystickServer} fue realizada el 31/07/2022.
 * @Dev - La primera version de {NintendoJoystickServer} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.name.nintendo.type;

import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.generic.type.GenericJoystickServer;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;
import com.project.dev.joystick.name.nintendo.setter.NintendoJoystickButtonSetter;

/**
 * FIXME: Definición de {@code NintendoJoystickServer}. Contiene las definiciones y operaciones para
 * un joystick de nombre nintendo que recibe peticiones através de la web usando la biblioteca
 * GenericUdp.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class NintendoJoystickServer extends GenericJoystickServer implements NintendoJoystick {

    /**
     * TODO: Definición de {@code NintendoJoystickServer}.
     *
     * @throws java.lang.Exception
     */
    public NintendoJoystickServer() throws Exception {
        super(JOYSTICK_NAME);
        GenericJoystickButtonSetter buttonSetter = new NintendoJoystickButtonSetter();
        buttonSetter.setGenericJoystickButtons(this);
    }
}
