/*
 * @fileoverview    {NintendoJoystickGraphicSetter}
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
package com.project.dev.joystick.name.nintendo.setter;

import com.project.dev.joystick.factory.GenericImageAbstractFactory;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickGraphicSetter;
import com.project.dev.joystick.name.nintendo.NintendoJoystick;
import java.awt.event.KeyEvent;

/**
 * FIXME: Definición de {@code NintendoJoystickGraphicSetter}. Contiene las operaciones generales
 * para un joystick de cualquier tipo y de nombre nintendo, para asignarle las imágenes genéricas
 * que representan la parte gráfica del joystick.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class NintendoJoystickGraphicSetter extends GenericJoystickGraphicSetter implements NintendoJoystickGraphicConstant {

    /**
     * FIXME: Definición de {@code setGenericJoystickGraphics}. Asigna los componnetes gráficos a un
     * joystick y sus botones.
     *
     * @param joystick es el joystick.
     * @throws Exception Si algún array es null o los arrays tienen diferentes dimensiones.
     */
    @Override
    public final void setGenericJoystickGraphics(GenericImageAbstractFactory imageFactory, GenericJoystick joystick) throws Exception {

        String buttonNames[] = {
            NintendoJoystick.BUTTON_LEFT_NAME,
            NintendoJoystick.BUTTON_RIGHT_NAME,
            NintendoJoystick.BUTTON_UP_NAME,
            NintendoJoystick.BUTTON_DOWN_NAME,
            NintendoJoystick.BUTTON_MEDIUM_NAME,
            NintendoJoystick.BUTTON_START_NAME,
            NintendoJoystick.BUTTON_SELECT_NAME,
            NintendoJoystick.BUTTON_Y_NAME,
            NintendoJoystick.BUTTON_X_NAME,
            NintendoJoystick.BUTTON_B_NAME,
            NintendoJoystick.BUTTON_A_NAME
        };

        String unTouchedImagesPaths[] = {
            BUTTON_LEFT_RES_PATH,
            BUTTON_RIGHT_RES_PATH,
            BUTTON_UP_RES_PATH,
            BUTTON_DOWN_RES_PATH,
            BUTTON_MEDIUM_RES_PATH,
            BUTTON_START_RES_PATH,
            BUTTON_SELECT_RES_PATH,
            BUTTON_Y_RES_PATH,
            BUTTON_X_RES_PATH,
            BUTTON_A_RES_PATH,
            BUTTON_B_RES_PATH
        };

        String touchedImagesPaths[] = {
            BUTTON_LEFT_TOUCH_RES_PATH,
            BUTTON_RIGHT_TOUCH_RES_PATH,
            BUTTON_UP_TOUCH_RES_PATH,
            BUTTON_DOWN_TOUCH_RES_PATH,
            BUTTON_MEDIUM_TOUCH_RES_PATH,
            BUTTON_START_TOUCH_RES_PATH,
            BUTTON_SELECT_TOUCH_RES_PATH,
            BUTTON_Y_TOUCH_RES_PATH,
            BUTTON_X_TOUCH_RES_PATH,
            BUTTON_A_TOUCH_RES_PATH,
            BUTTON_B_TOUCH_RES_PATH
        };

        int buttonLocations[][] = new int[][]{
            {98, 160},
            {193, 160},
            {143, 115},
            {143, 210},
            {143, 160},
            {290, 180},
            {377, 180},
            {521, 154},
            {597, 95},
            {597, 213},
            {673, 154}
        };

        int buttonKeyEvents[] = new int[]{
            KeyEvent.VK_LEFT,
            KeyEvent.VK_RIGHT,
            KeyEvent.VK_UP,
            KeyEvent.VK_DOWN,
            KeyEvent.VK_NUMPAD0,
            KeyEvent.VK_ENTER,
            KeyEvent.VK_DELETE,
            KeyEvent.VK_A,
            KeyEvent.VK_S,
            KeyEvent.VK_Z,
            KeyEvent.VK_X
        };

        this.setGenericJoystickGraphics(
                imageFactory,
                joystick,
                ICON_RES_PATH,
                BACKGROUND_RES_PATH,
                buttonNames,
                unTouchedImagesPaths,
                touchedImagesPaths,
                buttonLocations,
                buttonKeyEvents
        );
    }
}
