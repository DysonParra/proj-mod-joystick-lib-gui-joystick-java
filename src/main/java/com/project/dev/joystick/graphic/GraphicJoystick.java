/*
 * @overview        {GraphicJoystick}
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
package com.project.dev.joystick.graphic;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Description of {@code GraphicJoystick}. Especifica el comportamiento general que debe tener
 * la parte gráfica de un jostick, cuya implementación depende de cada sistema operativo.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public interface GraphicJoystick extends GenericComponent {

    /**
     * FIXME: Description of method {@code getJoystick}. Obtiene el joystick del joystick gráfico.
     *
     * @return es el joystick del gráfico.
     */
    public abstract GenericJoystick getJoystick();

    /**
     * FIXME: Description of method {@code getJoystickWidth}. Obtiene ancho del joystick asociado al
     * joystick gráfico.
     *
     * @return el ancho del joystick gráfico.
     */
    public abstract int getJoystickWidth();

    /**
     * FIXME: Description of method {@code getJoystickHeight}. Obtiene el alto del joystick asociado al
     * joystick gráfico.
     *
     * @return el alto del joystick gráfico.
     */
    public abstract int getJoystickHeight();

    /**
     * FIXME: Description of method {@code onJoystickScale}. Realiza una acción luego de que el joystick al
     * que pertenece cambia de imagen.
     *
     */
    public abstract void onJoystickScale();

    /**
     * FIXME: Description of method {@code scaleJoystick}. Cambia la resolución de las imágenes de los
     * botones y el joystick.
     *
     * @param percent es el porcentaje de escalado del joystick.
     * @throws java.lang.Exception
     */
    public abstract void scaleJoystick(double percent) throws Exception;

    /**
     * FIXME: Description of method {@code scaleJoystickWidth}. Cambia la resolución de las imágenes de los
     * botones y el joystick.
     *
     * @param newWidth es el nuevo ancho del joystick.
     * @throws java.lang.Exception
     */
    public abstract void scaleJoystickWidth(int newWidth) throws Exception;

    /**
     * FIXME: Description of method {@code scaleJoystickHeight}. Cambia la resolución de las imágenes de los
     * botones y el joystick.
     *
     * @param newHeight es el nuevo alto del joystick.
     * @throws java.lang.Exception
     */
    public abstract void scaleJoystickHeight(int newHeight) throws Exception;
}
