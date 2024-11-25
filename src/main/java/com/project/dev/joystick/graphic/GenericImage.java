/*
 * @fileoverview    {GenericImage}
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
import lombok.Data;

/**
 * FIXME: Description of {@code GenericImage}. Especifica el comportamiento general para almacenar
 * una imagen obtenida desde "asses/...". La implementación de como obtener la imagen y almacenarla
 * en memoria se deja a cada sistema operativo.
 *
 * @author Dyson Parra
 * @since 11
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public abstract class GenericImage implements GenericComponent {

    protected String path = null;                                               // Ruta de una imagen cualquiera.
    protected Object graphic = null;                                            // Icono de la imagen cualquiera.
    protected int width = 0;                                                    // Ancho de la imagen.
    protected int height = 0;                                                   // Alto de la imagen.
    protected int positionX = 0;                                                // Posición en X de la imagen.
    protected int positionY = 0;                                                // Posición en Y de la imagen.

    /**
     * TODO: Description of {@code GenericImage}.
     *
     * @throws java.lang.Exception
     */
    public GenericImage() throws Exception {

    }

    /**
     * TODO: Description of {@code GenericImage}.
     *
     * @param path es la ruta de la imagen.
     * @throws java.lang.Exception
     */
    public GenericImage(String path) throws Exception {
        this.path = path;
    }

    /**
     * TODO: Description of {@code setPath}.
     *
     * @param path
     * @throws java.lang.Exception
     */
    public final void setPath(String path) throws Exception {
        this.path = path;
        onPathChange();
    }

    /**
     * TODO: Description of {@code setWidth}.
     *
     * @param width
     */
    public final void setWidth(int width) {
        this.width = width;
        onWidthChange();
    }

    /**
     * TODO: Description of {@code setHeight}.
     *
     * @param height
     */
    public final void setHeight(int height) {
        this.height = height;
        onHeightChange();
    }

    /**
     * TODO: Description of {@code setPositionX}.
     *
     * @param positionX
     */
    public final void setPositionX(int positionX) {
        this.positionX = positionX;
        onPositionXChange();
    }

    /**
     * TODO: Description of {@code setPositionY}.
     *
     * @param positionY
     */
    public final void setPositionY(int positionY) {
        this.positionY = positionY;
        onPositionYChange();
    }

    /**
     * FIXME: Description of {@code onPathChange}. Invocado cuando se cambia la ruta de la imagen
     * genérica.
     *
     * @throws Exception
     */
    public abstract void onPathChange() throws Exception;

    /**
     * FIXME: Description of {@code onWidthChange}. Invocado cuando se cambia el ancho de la imagen
     * genérica.
     */
    public abstract void onWidthChange();

    /**
     * FIXME: Description of {@code onHeightChange}. Invocado cuando se cambia el lto de la imagen
     * genérica.
     */
    public abstract void onHeightChange();

    /**
     * FIXME: Description of {@code onPositionXChange}. Invocado cuando se cambian las coordenadas en
     * X de la imagen genérica.
     */
    public abstract void onPositionXChange();

    /**
     * FIXME: Description of {@code onPositionYChange}. Invocado cuando se cambian las coordenadas en
     * Y de la imagen genérica.
     */
    public abstract void onPositionYChange();
}
