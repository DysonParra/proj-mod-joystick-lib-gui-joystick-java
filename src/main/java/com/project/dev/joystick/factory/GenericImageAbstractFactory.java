/*
 * @overview        {GenericImageAbstractFactory}
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
package com.project.dev.joystick.factory;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.graphic.GenericImage;

/**
 * FIXME: Description of {@code GenericImageAbstractFactory}. Especifica la forma general de fabricar
 * imágenes genéricas, la implementación depende de cada sistema operativo.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public abstract class GenericImageAbstractFactory implements GenericComponent {

    /**
     * TODO: Description of method {@code GenericImageAbstractFactory}.
     *
     */
    public GenericImageAbstractFactory() {

    }

    /**
     * FIXME: Description of method {@code makeGenericImage}. Fabrica una imagen genérica con solo la ruta.
     *
     * @param path es la ruta de la imagen.
     * @return una imagen genérica.
     * @throws java.lang.Exception
     */
    public abstract GenericImage makeGenericImage(String path) throws Exception;

    /**
     * FIXME: Description of method {@code makeGenericImage}. Fabrica una imagen genérica con la ruta el
     * ancho y el alto.
     *
     * @param path      es la ruta de la imagen.
     * @param positionX es la posición en x de la imagen.
     * @param positionY es la posición en y de la imagen.
     * @return una imagen genérica.
     * @throws java.lang.Exception
     */
    public final GenericImage makeGenericImage(String path, int positionX, int positionY) throws Exception {
        GenericImage genericImage = makeGenericImage(path);
        genericImage.setPositionX(positionX);
        genericImage.setPositionY(positionY);
        return genericImage;
    }

    /**
     * FIXME: Description of method {@code makeGenericImage}. Fabrica una imagen genérica con la ruta el
     * ancho y el alto.
     *
     * @param path      es la ruta de la imagen.
     * @param positionX es la posición en x de la imagen.
     * @param positionY es la posición en y de la imagen.
     * @param width     es el ancho de la imagen.
     * @param height    es el alto de la imagen.
     * @return una imagen genérica.
     * @throws java.lang.Exception
     */
    public final GenericImage makeGenericImage(String path, int positionX, int positionY, int width, int height) throws Exception {
        GenericImage genericImage = makeGenericImage(path, positionX, positionY);
        genericImage.setWidth(width);
        genericImage.setHeight(height);
        return genericImage;
    }
}
