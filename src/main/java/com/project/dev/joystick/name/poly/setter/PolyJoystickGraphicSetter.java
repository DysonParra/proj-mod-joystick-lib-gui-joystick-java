/*
 * @overview        {PolyJoystickGraphicSetter}
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
package com.project.dev.joystick.name.poly.setter;

import com.project.dev.joystick.factory.GenericImageAbstractFactory;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickGraphicSetter;
import com.project.dev.joystick.name.poly.PolyJoystick;
import java.awt.event.KeyEvent;

/**
 * FIXME: Description of {@code PolyJoystickGraphicSetter}. Contiene las operaciones generales para
 * un joystick de cualquier tipo y de nombre poly, para asignarle las imágenes genéricas que
 * representan la parte gráfica del joystick.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class PolyJoystickGraphicSetter extends GenericJoystickGraphicSetter implements PolyJoystickGraphicConstant {

    /**
     * FIXME: Description of method {@code setGenericJoystickGraphics}. Asigna los componnetes gráficos a un
     * joystick y sus botones.
     *
     * @param joystick es el joystick.
     * @throws Exception Si algún array es null o los arrays tienen diferentes dimensiones.
     */
    @Override
    public final void setGenericJoystickGraphics(GenericImageAbstractFactory imageFactory, GenericJoystick joystick) throws Exception {

        String buttonNames[] = {
            PolyJoystick.BUTTON_LEFT_NAME,
            PolyJoystick.BUTTON_UP_NAME,
            PolyJoystick.BUTTON_DOWN_NAME,
            PolyJoystick.BUTTON_RIGHT_NAME,
            PolyJoystick.BUTTON_SELECT_NAME,
            PolyJoystick.BUTTON_START_NAME,
            PolyJoystick.BUTTON_SQUARE_NAME,
            PolyJoystick.BUTTON_TRIANGLE_NAME,
            PolyJoystick.BUTTON_EKS_NAME,
            PolyJoystick.BUTTON_CIRCLE_NAME
        };

        String unTouchedImagesPaths[] = {
            BUTTON_LEFT_RES_PATH,
            BUTTON_UP_RES_PATH,
            BUTTON_DOWN_RES_PATH,
            BUTTON_RIGHT_RES_PATH,
            BUTTON_SELECT_RES_PATH,
            BUTTON_START_RES_PATH,
            BUTTON_SQUARE_RES_PATH,
            BUTTON_TRIANGLE_RES_PATH,
            BUTTON_EKS_RES_PATH,
            BUTTON_CIRCLE_RES_PATH
        };

        String touchedImagesPaths[] = {
            BUTTON_LEFT_TOUCH_RES_PATH,
            BUTTON_UP_TOUCH_RES_PATH,
            BUTTON_DOWN_TOUCH_RES_PATH,
            BUTTON_RIGHT_TOUCH_RES_PATH,
            BUTTON_SELECT_TOUCH_RES_PATH,
            BUTTON_START_TOUCH_RES_PATH,
            BUTTON_SQUARE_TOUCH_RES_PATH,
            BUTTON_TRIANGLE_TOUCH_RES_PATH,
            BUTTON_EKS_TOUCH_RES_PATH,
            BUTTON_CIRCLE_TOUCH_RES_PATH
        };

        int buttonLocations[][] = new int[][]{
            {226, 360},
            {315, 270},
            {315, 417},
            {394, 360},
            {684, 485},
            {879, 481},
            {1078, 347},
            {1217, 219},
            {1217, 475},
            {1356, 347}
        };

        int buttonKeyEvents[] = new int[]{
            KeyEvent.VK_LEFT,
            KeyEvent.VK_UP,
            KeyEvent.VK_DOWN,
            KeyEvent.VK_RIGHT,
            KeyEvent.VK_DELETE,
            KeyEvent.VK_ENTER,
            KeyEvent.VK_Z,
            KeyEvent.VK_A,
            KeyEvent.VK_X,
            KeyEvent.VK_S
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
