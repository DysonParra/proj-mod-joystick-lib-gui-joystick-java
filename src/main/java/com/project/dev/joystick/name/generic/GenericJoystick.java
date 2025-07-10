/*
 * @overview        {GenericJoystick}
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
package com.project.dev.joystick.name.generic;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.button.GenericButton;
import com.project.dev.joystick.factory.GenericImageAbstractFactory;
import com.project.dev.joystick.graphic.GenericImage;
import com.project.dev.joystick.graphic.GraphicJoystick;
import java.util.Arrays;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * FIXME: Description of {@code GenericJoystick}. Contiene las operaciones y definiciones generales
 * que contiene un joystick de cualquier tipo y nombre.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public abstract class GenericJoystick implements GenericComponent {

    public static final String JOYSTICK_TYPE_SERVER = "SERVER";                 // Código si el joystick a crear es un servidor.
    public static final String JOYSTICK_TYPE_CLIENT = "CLIENT";                 // Código si el joystick a crear es un cliente.
    public static final String JOYSTICK_TYPE_LOCAL = "LOCAL";                   // Código si el joystick a crear es un cliente.
    public static final String JOYSTICK_NAME_GENERIC = "GENERIC";               // Código si el joystick a crear es un joystick de nombre genérico.

    @Setter(AccessLevel.NONE)
    protected final String type;                                                // Tipo de joystick que es (cliente o servidor.).
    protected String name;                                                      // Nombre del joystick que servirá para identificar el control que es (ps3, nintendo, etc...).
    protected GenericButton[] buttons;                                          // Botones del joystick.
    @Setter(AccessLevel.NONE)
    protected int buttonQuantity;                                               // Cantidad de botones del joystick.
    @Setter(AccessLevel.NONE)
    protected byte[] prevButtonsStates;                                         // Estado anterior de los botones del joystick.
    @Setter(AccessLevel.NONE)
    protected byte[] currentButtonsStates;                                      // Estado actual de los botones del joystick.

    protected GenericImage backgroundImage;                                     // Imagen de fondo del joystick.
    protected GenericImage iconImage;                                           // Icono del joystick.
    protected GraphicJoystick onGraphicListener;                                // Componente gráfico asociado al joystick.

    /**
     * TODO: Description of method {@code GenericJoystick}.
     *
     * @param type es el tipo de joystick que será.
     * @param name es el nombre del joystick.
     * @throws java.lang.Exception Si se indica un joystick de tipo no válido.
     */
    public GenericJoystick(String type, String name) throws Exception {
        if (!type.equals(JOYSTICK_TYPE_SERVER)
                && !type.equals(JOYSTICK_TYPE_CLIENT)
                && !type.equals(JOYSTICK_TYPE_LOCAL))
            throw new Exception("Invalid joystick type");
        this.type = type;                                                       // Inicializa el tipo de joystick que es.
        this.name = name;                                                       // Indica el nombre del joystick.
        this.buttonQuantity = 0;                                                // Inicializa la cantidad de botones.
        this.currentButtonsStates = null;                                       // Inicializa el estado actual de los botones.
        this.buttons = null;                                                    // Inicializa los botones.
    }

    /**
     * TODO: Description of method {@code getButtons}.
     *
     * @return
     */
    public final GenericButton[] getButtons() {
        return buttons;
    }

    /**
     * TODO: Description of method {@code setButtons}.
     *
     */
    public abstract void setButtons(GenericButton[] newButtons) throws Exception;

    /**
     * FIXME: Description of method {@code onButtonStateChanged}. Invocado cuando se cambia el estado de un
     * botón del joystick.
     *
     * @param buttonNumber   es el número del botón que cambió.
     * @param newButtonState es el nuevo estado del botón.
     * @return Si fue posible cambiar el estado del botón.
     */
    public abstract boolean onButtonStateChanged(int buttonNumber, byte newButtonState);

    /**
     * TODO: Description of method {@code getBackground}.
     *
     * @return
     */
    public final GenericImage getBackground() {
        return backgroundImage;
    }

    /**
     * TODO: Description of method {@code setBackground}.
     *
     * @param imageFactory
     * @param path
     * @throws java.lang.Exception
     */
    public final void setBackgroundImage(GenericImageAbstractFactory imageFactory, String path) throws Exception {
        backgroundImage = imageFactory.makeGenericImage(path);
    }

    /**
     * TODO: Description of method {@code setBackground}.
     *
     * @param imageFactory
     * @param positionY
     * @param path
     * @param positionX
     * @throws java.lang.Exception
     */
    public final void setBackgroundImage(GenericImageAbstractFactory imageFactory, String path, int positionX, int positionY) throws Exception {
        backgroundImage = imageFactory.makeGenericImage(path, positionX, positionY);
    }

    /**
     * TODO: Description of method {@code setBackground}.
     *
     * @param imageFactory
     * @param path
     * @param positionX
     * @param height
     * @param width
     * @param positionY
     * @throws java.lang.Exception
     */
    public final void setBackgroundImage(GenericImageAbstractFactory imageFactory, String path, int positionX, int positionY, int width, int height) throws Exception {
        backgroundImage = imageFactory.makeGenericImage(path, positionX, positionY, width, height);
    }

    /**
     * TODO: Description of method {@code setIconImage}.
     *
     * @param imageFactory
     * @param path
     * @throws java.lang.Exception
     */
    public final void setIconImage(GenericImageAbstractFactory imageFactory, String path) throws Exception {
        iconImage = imageFactory.makeGenericImage(path);
    }

    /**
     * TODO: Description of method {@code setIconImage}.
     *
     * @param imageFactory
     * @param positionY
     * @param path
     * @param positionX
     * @throws java.lang.Exception
     */
    public final void setIconImage(GenericImageAbstractFactory imageFactory, String path, int positionX, int positionY) throws Exception {
        iconImage = imageFactory.makeGenericImage(path, positionX, positionY);
    }

    /**
     * TODO: Description of method {@code setIconImage}.
     *
     * @param imageFactory
     * @param path
     * @param height
     * @param positionX
     * @param width
     * @param positionY
     * @throws java.lang.Exception
     */
    public final void setIconImage(GenericImageAbstractFactory imageFactory, String path, int positionX, int positionY, int width, int height) throws Exception {
        iconImage = imageFactory.makeGenericImage(path, positionX, positionY, width, height);
    }

    /**
     * FIXME: Description of method {@code setButtonsImages}. Asigna imágenes que tendrán los botones en el
     * estado indicado.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param statesCode   Es el estado en el cual los botones cambiarán a la imagen indicada.
     * @param buttonNames  Son los nombres de los botones a los que se les asignará la imagen que
     *                     tendrá en el estado indicado.
     * @param imagePaths   Son las rutas de las imagenes de cada botón.
     * @param positions    Son las coordenadas en pantalla de la imagen que tendrá cada botón en el
     *                     estado indicado.
     * @param dimensions   Son las dimensiones en pantalla de la imagen que tendrá cada botón en el
     *                     estado indicado.
     * @throws Exception Si los arrays no tienen la misma longitud.
     */
    public final void setButtonsImages(GenericImageAbstractFactory imageFactory, byte statesCode, String[] buttonNames, String imagePaths[], int positions[][], int dimensions[][]) throws Exception {
        GenericButton button;
        if (buttonNames.length != imagePaths.length
                || buttonNames.length != positions.length
                || buttonNames.length != dimensions.length
                || imagePaths.length != positions.length
                || imagePaths.length != dimensions.length
                || positions.length != dimensions.length)
            throw new Exception("buttonNames, imagePaths, positions and dimensions must have iqual length");
        for (int i = 0; i < buttonNames.length; i++) {
            button = getButton(buttonNames[i]);
            if (button != null)
                button.addButtonImage(imageFactory, statesCode, imagePaths[i], positions[i][0], positions[i][1], dimensions[i][0], dimensions[i][1]);
            else
                throw new Exception("Button width name '" + buttonNames[i] + "' does not exist.");
        }
    }

    /**
     * FIXME: Description of method {@code setButtonsImages}. Asigna imágenes que tendrán los botones en el
     * estado indicado.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param statesCode   Es el estado en el cual los botones cambiarán a la imagen indicada.
     * @param buttonNames  Son los nombres de los botones a los que se les asignará la imagen que
     *                     tendrá en el estado indicado.
     * @param imagePaths   Son las rutas de las imagenes de cada botón.
     * @param positions    Son las coordenadas en pantalla de la imagen que tendrá cada botón en el
     *                     estado indicado.
     * @throws Exception Si los arrays no tienen la misma longitud.
     */
    public final void setButtonsImages(GenericImageAbstractFactory imageFactory, byte statesCode, String[] buttonNames, String imagePaths[], int positions[][]) throws Exception {
        GenericButton button;
        if (buttonNames.length != imagePaths.length
                || buttonNames.length != positions.length
                || imagePaths.length != positions.length)
            throw new Exception("buttonNames, imagePaths and positions must have iqual length");
        for (int i = 0; i < buttonNames.length; i++) {
            button = getButton(buttonNames[i]);
            if (button != null)
                button.addButtonImage(imageFactory, statesCode, imagePaths[i], positions[i][0], positions[i][1]);
            else
                throw new Exception("Button with name '" + buttonNames[i] + "' does not exist.");
        }
    }

    /**
     * FIXME: Description of method {@code setButtonsImages}. Asigna imágenes que tendrán los botones en el
     * estado indicado.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param statesCode   Es el estado en el cual los botones cambiarán a la imagen indicada.
     * @param buttonNames  Son los nombres de los botones a los que se les asignará la imagen que
     *                     tendrá en el estado indicado.
     * @param imagePaths   Son las rutas de las imagenes de cada botón.
     * @throws Exception Si los arrays no tienen la misma longitud.
     */
    public final void setButtonsImages(GenericImageAbstractFactory imageFactory, byte statesCode, String[] buttonNames, String imagePaths[]) throws Exception {
        GenericButton button;
        if (buttonNames.length != imagePaths.length)
            throw new Exception("buttonNames and imagePaths must have iqual length");
        for (int i = 0; i < buttonNames.length; i++) {
            button = getButton(buttonNames[i]);
            if (button != null)
                button.addButtonImage(imageFactory, statesCode, imagePaths[i]);
            else
                throw new Exception("Button width name '" + buttonNames[i] + "' does not exist.");
        }
    }

    /**
     * FIXME: Description of method {@code setButtonsKeyEvents}. Asigna teclas del teclado a los botones.
     *
     * @param buttonNames     Son los nombres de los botones a los que se les asignará la tecla
     *                        indicada.
     * @param buttonKeyEvents Son las teclas que se asignarán a cada botón.
     * @throws Exception Si los arrays no tienen la misma longitud.
     */
    public final void setButtonsKeyEvents(String[] buttonNames, int buttonKeyEvents[]) throws Exception {
        if (buttonNames.length != buttonKeyEvents.length)
            throw new Exception("buttonNames and buttonKeyEvents must have iqual length");
        for (int i = 0; i < buttonNames.length; i++)
            getButton(buttonNames[i]).setKeyEvent(buttonKeyEvents[i]);
    }

    /**
     * FIXME: Description of method {@code scaleImages}. Cambia la resolución de las imágenes de los botones
     * y el joystick.
     *
     * @param percent es el porcentaje de escalado del joystick.
     * @throws java.lang.Exception
     */
    public final void scaleImages(double percent) throws Exception {

        double newWith = backgroundImage.getWidth() * percent;
        double newHeight = backgroundImage.getHeight() * percent;

        if ((newWith - (int) newWith) > 0.5)
            backgroundImage.setWidth((int) (Math.ceil(newWith)) + 1);
        else
            backgroundImage.setWidth((int) (Math.ceil(newWith)));

        if ((newHeight - (int) newHeight) > 0.5)
            backgroundImage.setHeight((int) (Math.ceil(newHeight)) + 1);
        else
            backgroundImage.setHeight((int) (Math.ceil(newHeight)));

        if (onGraphicListener != null)
            onGraphicListener.onJoystickScale();
        for (GenericButton joystickButton : buttons)
            joystickButton.scaleImages(percent);
    }

    /**
     * FIXME: Description of method {@code scaleImagesWidth}. Cambia la resolución de las imágenes de los
     * botones y el joystick basado en un ancho en píxeles.
     *
     * @param newWidth es el porcentaje de escalado del joystick.
     * @throws java.lang.Exception
     */
    public final void scaleImagesWidth(int newWidth) throws Exception {
        double percent = newWidth / (double) backgroundImage.getWidth();
        scaleImages(percent);
    }

    /**
     * FIXME: Description of method {@code scaleImagesHeight}. Cambia la resolución de las imágenes de los
     * botones y el joystick basado en un alto en píxeles.
     *
     * @param newHeight es el nuevo alto del joystick.
     * @throws java.lang.Exception
     */
    public final void scaleImagesHeight(int newHeight) throws Exception {
        double percent = newHeight / (double) backgroundImage.getHeight();
        scaleImages(percent);
    }

    /**
     * FIXME: Description of method {@code getButton}. Busca un botón en el joystick.
     *
     * @param buttonName es el nombre del botón que se buscará.
     * @return el botón con el nombre indicado o null si no se encuentró.
     */
    public final GenericButton getButton(String buttonName) {
        GenericButton button = null;                                            // Botón encontrado.
        if (buttons != null)                                                    // Si hay botones en el joystick.
            for (GenericButton joysTickButon : buttons)                         // Recorre los botones.
                if (joysTickButon.getName().equals(buttonName)) {               // Si encuentra el botón con el nombre indicado.
                    button = joysTickButon;                                     // Almacena el botón encontrado.
                    break;                                                      // Sale del ciclo.
                }

        return button;                                                          // Devuelve el botón con el nombre indicado si lo encuentra.
    }

    /**
     * FIXME: Description of method {@code removeButtonActionListeners}. Quita los listener de acción de
     * cada uno de sus botones.
     *
     */
    public void removeButtonActionListeners() {
        for (GenericButton button : buttons)
            button.setOnActionListener(null);
    }

    /**
     * Get the current {@code Object} as {@code String}.
     *
     * @return {@code String} representing this {@code Object}.
     */
    @Override
    public String toString() {
        return "GenericJoystick{" + "type=" + type + ", name=" + name + ", buttons=" + Arrays.toString(buttons) + ", buttonQuantity=" + buttonQuantity + ", prevButtonsStates=" + Arrays.toString(prevButtonsStates) + ", currentButtonsStates=" + Arrays.toString(currentButtonsStates) + ", backgroundImage=" + backgroundImage + ", onGraphicListener=" + onGraphicListener + '}';
    }
}
