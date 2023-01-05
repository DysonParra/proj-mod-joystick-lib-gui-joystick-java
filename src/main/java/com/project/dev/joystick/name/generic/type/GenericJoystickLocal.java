/*
 * @fileoverview    {GenericJoystickLocal} se encarga de realizar tareas específicas.
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
package com.project.dev.joystick.name.generic.type;

import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Definición de {@code GenericJoystickLocal}. Contiene las operaciones y definiciones
 * generales que contiene un joystick de cualquier tipo y nombre, y además definiciones específicas
 * para un joystick que no se comunica con otros joystick.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class GenericJoystickLocal extends GenericJoystick {

    /**
     * TODO: Definición de {@code GenericJoystickLocal}.
     *
     * @throws java.lang.Exception
     */
    public GenericJoystickLocal() throws Exception {
        super(GenericJoystick.JOYSTICK_TYPE_LOCAL, GenericJoystick.JOYSTICK_NAME_GENERIC);
    }

    /**
     * TODO: Definición de {@code GenericJoystickLocal}.
     *
     * @param name es el nombre del joystick.
     * @throws java.lang.Exception
     */
    public GenericJoystickLocal(String name) throws Exception {
        super(GenericJoystick.JOYSTICK_TYPE_LOCAL, name);
    }

    /**
     * FIXME: Definición de {@code setButtons}. Asigna botones al joystick.
     *
     * @param newButtons son los botones que se asignarán como los botones del joystick.
     * @throws java.lang.Exception
     */
    @Override
    public void setButtons(GenericButton[] newButtons) throws Exception {
        try {
            this.buttons = newButtons;                                          // Almacena los botones indicados como parametro.
            this.buttonQuantity = newButtons.length;                            // Almacena la cantidad de botones del joystick.
            this.prevButtonsStates = new byte[buttonQuantity];
            this.actualButtonsStates = new byte[buttonQuantity];
            for (int i = 0; i < actualButtonsStates.length; i++) {
                actualButtonsStates[i] = BUTTON_UNPRESSED;
                prevButtonsStates[i] = BUTTON_UNPRESSED;
            }
        } catch (Exception e) {
            throw new Exception("Invalid buttons");
        }
    }

    /**
     * FIXME: Definición de {@code onButtonStateChanged}. Invocado cuando se cambia el estado del
     * componenet genérico.
     *
     * @param buttonNumber   es el número del botón que cambió.
     * @param newButtonState es el nuevo estado del botón.
     * @return Si fue posible cambiar el estado del botón.
     */
    @Override
    public boolean onButtonStateChanged(int buttonNumber, byte newButtonState) {
        System.out.println("Button state updated");
        return true;
    }
}
