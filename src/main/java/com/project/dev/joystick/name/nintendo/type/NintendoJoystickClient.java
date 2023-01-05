/*
 * @fileoverview    {NintendoJoystickClient} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
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
