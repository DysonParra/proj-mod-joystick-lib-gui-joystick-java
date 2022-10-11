/*
 * @fileoverview {PolyJoystickClient} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {PolyJoystickClient} fue realizada el 31/07/2022.
 * @Dev - La primera version de {PolyJoystickClient} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.name.poly.type;

import com.project.dev.joystick.name.generic.type.GenericJoystickClient;
import com.project.dev.joystick.name.poly.PolyJoystick;

/**
 * FIXME: Definición de {@code PolyJoystickClient}. Contiene las definiciones y operaciones para un
 * joystick de nombre poly que envía peticiones através de la web usando la biblioteca GenericUdp.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class PolyJoystickClient extends GenericJoystickClient implements PolyJoystick {

    /**
     * TODO: Definición de {@code PolyJoystickClient}.
     *
     * @throws java.lang.Exception
     */
    public PolyJoystickClient() throws Exception {
        super(JOYSTICK_NAME);
    }
}
