/*
 * @fileoverview    {GenericJoystickPrintActionSetter}
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
package com.project.dev.joystick.setter;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.button.GenericButtonActionListener;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Description of {@code GenericJoystickPrintActionSetter}. Se usa para asignar acciones de
 * imprimir en pantalla a cada boton de un joystick de cualquier tipo y nombre.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class GenericJoystickPrintActionSetter implements GenericComponent {

    /**
     * FIXME: Description of method {@code addButtonPrintActions}. Agrega acciones de imprimir en pantalla a
     * cada botón del joystick.
     *
     * @param genericJoystick es el joystick genérico.
     */
    public final void addButtonPrintActions(GenericJoystick genericJoystick) {
        GenericButton[] buttons = genericJoystick.getButtons();
        for (final GenericButton button : buttons) {
            button.setOnActionListener(new GenericButtonActionListener() {
                String name = button.getName();

                @Override
                public void onReleased() {
                    System.out.println(name + " Released");
                }

                @Override
                public void onTyped() {
                    System.out.println(name + " Typed");
                }

                @Override
                public void onPressed() {
                    System.out.println(name + " Pressed");
                }

                @Override
                public void onUnpressed() {
                    System.out.println(name + " Unpressed");
                }
            });
        }
    }
}
