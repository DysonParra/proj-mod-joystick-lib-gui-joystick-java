/*
 * @fileoverview    {NintendoJoystickServer}
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
