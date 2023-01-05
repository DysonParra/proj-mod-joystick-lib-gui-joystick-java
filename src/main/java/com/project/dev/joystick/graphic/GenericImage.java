/*
 * @fileoverview    {GenericImage} se encarga de realizar tareas específicas.
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
package com.project.dev.joystick.graphic;

import com.project.dev.joystick.GenericComponent;
import lombok.Data;

/**
 * FIXME: Definición de {@code GenericImage}. Especifica el comportamiento general para almacenar
 * una imagen obtenida desde "asses/...". La implementación de como obtener la imagen y almacenarla
 * en memoria se deja a cada sistema operativo.
 *
 * @author Dyson Parra
 * @since 1.8
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
     * TODO: Definición de {@code GenericImage}.
     *
     * @throws java.lang.Exception
     */
    public GenericImage() throws Exception {

    }

    /**
     * TODO: Definición de {@code GenericImage}.
     *
     * @param path es la ruta de la imagen.
     * @throws java.lang.Exception
     */
    public GenericImage(String path) throws Exception {
        this.path = path;
    }

    /**
     * TODO: Definición de {@code setPath}.
     *
     * @param path
     * @throws java.lang.Exception
     */
    public final void setPath(String path) throws Exception {
        this.path = path;
        onPathChange();
    }

    /**
     * TODO: Definición de {@code setWidth}.
     *
     * @param width
     */
    public final void setWidth(int width) {
        this.width = width;
        onWidthChange();
    }

    /**
     * TODO: Definición de {@code setHeight}.
     *
     * @param height
     */
    public final void setHeight(int height) {
        this.height = height;
        onHeightChange();
    }

    public final void setPositionX(int positionX) {
        this.positionX = positionX;
        onPositionXChange();
    }

    public final void setPositionY(int positionY) {
        this.positionY = positionY;
        onPositionYChange();
    }

    /**
     * FIXME: Definición de {@code onPathChange}. Invocado cuando se cambia la ruta de la imagen
     * genérica.
     *
     * @throws Exception
     */
    public abstract void onPathChange() throws Exception;

    /**
     * FIXME: Definición de {@code onWidthChange}. Invocado cuando se cambia el ancho de la imagen
     * genérica.
     */
    public abstract void onWidthChange();

    /**
     * FIXME: Definición de {@code onHeightChange}. Invocado cuando se cambia el lto de la imagen
     * genérica.
     */
    public abstract void onHeightChange();

    /**
     * FIXME: Definición de {@code onPositionXChange}. Invocado cuando se cambian las coordenadas en
     * X de la imagen genérica.
     */
    public abstract void onPositionXChange();

    /**
     * FIXME: Definición de {@code onPositionYChange}. Invocado cuando se cambian las coordenadas en
     * Y de la imagen genérica.
     */
    public abstract void onPositionYChange();
}
