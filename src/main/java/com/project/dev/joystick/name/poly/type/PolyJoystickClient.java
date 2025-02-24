/*
 * @fileoverview    {PolyJoystickClient}
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

import com.project.dev.joystick.name.generic.type.GenericJoystickClient;
import com.project.dev.joystick.name.poly.PolyJoystick;

/**
 * FIXME: Description of {@code PolyJoystickClient}. Contiene las definiciones y operaciones para un
 * joystick de nombre poly que envía peticiones através de la web usando la biblioteca GenericUdp.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class PolyJoystickClient extends GenericJoystickClient implements PolyJoystick {

    /**
     * TODO: Description of {@code PolyJoystickClient}.
     *
     * @throws java.lang.Exception
     */
    public PolyJoystickClient() throws Exception {
        super(JOYSTICK_NAME);
    }
}
