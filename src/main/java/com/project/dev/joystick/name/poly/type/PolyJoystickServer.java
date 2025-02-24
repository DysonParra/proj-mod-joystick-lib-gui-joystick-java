/*
 * @fileoverview    {PolyJoystickServer}
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
package com.project.dev.joystick.name.poly.type;

import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.generic.type.GenericJoystickServer;
import com.project.dev.joystick.name.poly.PolyJoystick;
import com.project.dev.joystick.name.poly.setter.PolyJoystickButtonSetter;

/**
 * FIXME: Description of {@code PolyJoystickServer}. Contiene las definiciones y operaciones para un
 * joystick de nombre poly que recibe peticiones através de la web usando la biblioteca GenericUdp.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class PolyJoystickServer extends GenericJoystickServer implements PolyJoystick {

    /**
     * TODO: Description of {@code PolyJoystickServer}.
     *
     * @throws java.lang.Exception
     */
    public PolyJoystickServer() throws Exception {
        super(JOYSTICK_NAME);
        GenericJoystickButtonSetter buttonSetter = new PolyJoystickButtonSetter();
        buttonSetter.setGenericJoystickButtons(this);
    }
}
