/*
 * @fileoverview {NintendoJoystickClient} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {NintendoJoystickClient} fue realizada el 31/07/2022.
 * @Dev - La primera version de {NintendoJoystickClient} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.name.nintendo.type;

import com.project.dev.joystick.name.generic.type.GenericJoystickClient;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;

/**
 * FIXME: Definición de {@code NintendoJoystickClient}. Contiene las definiciones y operaciones para
 * un joystick de nombre nintendo que envía peticiones através de la web usando la biblioteca
 * GenericUdp.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class NintendoJoystickClient extends GenericJoystickClient implements NintendoJoystick {

    /**
     * TODO: Definición de {@code NintendoJoystickClient}.
     *
     * @throws java.lang.Exception
     */
    public NintendoJoystickClient() throws Exception {
        super(JOYSTICK_NAME);
    }
}
