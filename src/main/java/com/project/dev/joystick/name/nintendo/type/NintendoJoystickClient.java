/*
 * @overview        {NintendoJoystickClient}
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

import com.project.dev.joystick.name.generic.type.GenericJoystickClient;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;

/**
 * FIXME: Description of {@code NintendoJoystickClient}. Contiene las definiciones y operaciones para
 * un joystick de nombre nintendo que envía peticiones através de la web usando la biblioteca
 * GenericUdp.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class NintendoJoystickClient extends GenericJoystickClient implements NintendoJoystick {

    /**
     * TODO: Description of method {@code NintendoJoystickClient}.
     *
     * @throws java.lang.Exception
     */
    public NintendoJoystickClient() throws Exception {
        super(JOYSTICK_NAME);
    }
}
