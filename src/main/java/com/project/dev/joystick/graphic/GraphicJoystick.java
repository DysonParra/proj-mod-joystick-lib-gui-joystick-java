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
package com.project.dev.joystick.graphic;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.name.generic.GenericJoystick;

/**
 * FIXME: Definición de {@code GraphicJoystick}. Especifica el comportamiento general que debe tener
 * la parte gráfica de un jostick, cuya implementación depende de cada sistema operativo.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public interface GraphicJoystick extends GenericComponent {

    /**
     * FIXME: Definición de {@code getJoystick}. Obtiene el joystick del joystick gráfico.
     *
     * @return es el joystick del gráfico.
     */
    public abstract GenericJoystick getJoystick();

    /**
     * FIXME: Definición de {@code getJoystickWidth}. Obtiene ancho del joystick asociado al
     * joystick gráfico.
     *
     * @return el ancho del joystick gráfico.
     */
    public abstract int getJoystickWidth();

    /**
     * FIXME: Definición de {@code getJoystickHeight}. Obtiene el alto del joystick asociado al
     * joystick gráfico.
     *
     * @return el alto del joystick gráfico.
     */
    public abstract int getJoystickHeight();

    /**
     * FIXME: Definición de {@code onJoystickScale}. Realiza una acción luego de que el joystick al
     * que pertenece cambia de imagen.
     */
    public abstract void onJoystickScale();

    /**
     * FIXME: Definición de {@code scaleJoystick}. Cambia la resolución de las imágenes de los
     * botones y el joystick.
     *
     * @param percent es el porcentaje de escalado del joystick.
     * @throws java.lang.Exception
     */
    public abstract void scaleJoystick(double percent) throws Exception;

    /**
     * FIXME: Definición de {@code scaleJoystickWidth}. Cambia la resolución de las imágenes de los
     * botones y el joystick.
     *
     * @param newWidth es el nuevo ancho del joystick.
     * @throws java.lang.Exception
     */
    public abstract void scaleJoystickWidth(int newWidth) throws Exception;

    /**
     * FIXME: Definición de {@code scaleJoystickHeight}. Cambia la resolución de las imágenes de los
     * botones y el joystick.
     *
     * @param newHeight es el nuevo alto del joystick.
     * @throws java.lang.Exception
     */
    public abstract void scaleJoystickHeight(int newHeight) throws Exception;
}
