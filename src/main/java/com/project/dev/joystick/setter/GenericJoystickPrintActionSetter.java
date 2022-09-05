/*
 * @fileoverview {FileName} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {FileName} fue realizada el 31/07/2022.
 * @Dev - La primera version de {FileName} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.setter;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.button.GenericButtonActionListener;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Definición de {@code GenericJoystickPrintActionSetter}. Se usa para asignar acciones de
 * imprimir en pantalla a cada boton de un joystick de cualquier tipo y nombre.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class GenericJoystickPrintActionSetter implements GenericComponent {

    /**
     * FIXME: Definición de {@code addButtonPrintActions}. Agrega acciones de imprimir en pantalla a
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
