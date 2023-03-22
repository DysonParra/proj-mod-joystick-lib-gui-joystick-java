/*
 * @fileoverview    {PolyJoystickLocal}
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
package com.project.dev.joystick.name.poly.type;

import com.project.dev.joystick.name.generic.setter.GenericJoystickButtonSetter;
import com.project.dev.joystick.name.generic.type.GenericJoystickLocal;
import com.project.dev.joystick.name.poly.PolyJoystick;
import com.project.dev.joystick.name.poly.setter.PolyJoystickButtonSetter;

/**
 * FIXME: Definición de {@code PolyJoystickLocal}. Contiene las definiciones y operaciones para un
 * joystick de nombre poly que funciona localmente.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class PolyJoystickLocal extends GenericJoystickLocal implements PolyJoystick {

    /**
     * TODO: Definición de {@code PolyJoystickLocal}.
     *
     * @throws java.lang.Exception
     */
    public PolyJoystickLocal() throws Exception {
        super(JOYSTICK_NAME);
        GenericJoystickButtonSetter buttonSetter = new PolyJoystickButtonSetter();
        buttonSetter.setGenericJoystickButtons(this);
    }
}
