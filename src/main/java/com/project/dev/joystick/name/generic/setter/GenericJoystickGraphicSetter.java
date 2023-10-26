/*
 * @fileoverview    {GenericJoystickGraphicSetter}
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
package com.project.dev.joystick.name.generic.setter;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.factory.GenericImageAbstractFactory;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Definición de {@code GenericJoystickGraphicSetter}. Contiene las operaciones generales
 * para un joystick de cualquier nombre y tipo, para asignarle las imágenes genéricas que
 * representan la parte gráfica del joystick.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public abstract class GenericJoystickGraphicSetter implements GenericComponent {

    /**
     * FIXME: Definición de {@code setGenericJoystickGraphics}. Asigna los componnetes gráficos a un
     * joystick y sus botones.
     *
     * @param imageFactory         Es la fabrica de imagenes genéricas.
     * @param joystick             es el joystick.
     * @param iconImagePath        es el icono del joystick.
     * @param backGroundImagePath  es la ruta de la imagen de fondo del joystick.
     * @param buttonNames          Son los nombres de los botones.
     * @param unTouchedImagesPaths Son las rutas de las imagenes de los botones sin oprimir.
     * @param touchedImagesPaths   Son las rutas de las imagenes de los botones oprimidos.
     * @param buttonLocations      Son las coordenadas de las imagenes de los botones.
     * @param buttonKeyEvents      Son las teclas del teclado asociadas a los botones.
     * @throws Exception Si algún array es null o los arrays tienen diferentes dimensiones.
     */
    public final void setGenericJoystickGraphics(
            GenericImageAbstractFactory imageFactory,
            GenericJoystick joystick,
            String iconImagePath,
            String backGroundImagePath,
            String buttonNames[],
            String unTouchedImagesPaths[],
            String touchedImagesPaths[],
            int buttonLocations[][],
            int buttonKeyEvents[])
            throws Exception {
        if (!(iconImagePath == null
                && backGroundImagePath == null
                && buttonNames == null
                && unTouchedImagesPaths == null
                && touchedImagesPaths == null
                && buttonLocations == null
                && buttonKeyEvents == null)) {
            if (iconImagePath != null)
                joystick.setIconImage(imageFactory, iconImagePath);
            if (backGroundImagePath != null)
                joystick.setBackgroundImage(imageFactory, backGroundImagePath);
            if (buttonNames != null) {
                if (buttonLocations != null) {
                    if (unTouchedImagesPaths != null)
                        joystick.setButtonsImages(imageFactory, GenericButton.BUTTON_RELEASED, buttonNames, unTouchedImagesPaths, buttonLocations);
                    if (touchedImagesPaths != null)
                        joystick.setButtonsImages(imageFactory, GenericButton.BUTTON_TYPED, buttonNames, touchedImagesPaths, buttonLocations);
                } else
                    throw new Exception("Button locations not especified");

                if (buttonKeyEvents != null)
                    joystick.setButtonsKeyEvents(buttonNames, buttonKeyEvents);
            } else
                throw new Exception("Button names not especified");
        }
    }

    /**
     * FIXME: Definición de {@code setGenericJoystickGraphics}. Asigna los componnetes gráficos a un
     * joystick y sus botones.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param joystick     es el joystick.
     * @throws Exception Si algún array es null o los arrays tienen diferentes dimensiones.
     */
    public abstract void setGenericJoystickGraphics(GenericImageAbstractFactory imageFactory, GenericJoystick joystick) throws Exception;
}
