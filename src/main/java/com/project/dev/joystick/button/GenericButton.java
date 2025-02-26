/*
 * @fileoverview    {GenericButton}
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
package com.project.dev.joystick.button;

import com.project.dev.joystick.GenericComponent;
import com.project.dev.joystick.factory.GenericImageAbstractFactory;
import com.project.dev.joystick.graphic.GenericImage;
import com.project.dev.joystick.name.generic.GenericJoystick;
import java.util.HashMap;
import java.util.Map;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * FIXME: Description of {@code GenericButton}. Contiene las operaciones y la especificación de un
 * botón perteneciente a un joystick de cualquier tipo y nombre.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public class GenericButton implements GenericComponent {

    public static final int MAX_BUTTON_NAME_SIZE = 100;                         // Tamaño máximo del nombre de cada botón.

    protected static int buttonNumber = 0;                                      // Número de botón creado hasta ahora.

    protected String name;                                                      // Nombre del botón.
    protected int id;                                                           // Id del botón.
    protected int keyEvent;                                                     // Tecla del teclado asociada al botón.

    protected GenericJoystick joystick = null;                                  // Joystick al que pertenece el botón.

    protected GenericButtonGraphicListener onGraphicListener = null;            // Crea listener de los cambios en los gráficos del botón.
    protected GenericButtonActionListener onActionListener = null;              // Crea listener de los estados del botón.

    @Setter(AccessLevel.NONE)
    protected Map<Byte, GenericImage> buttonImages;                             // Imágenes del botón dependiendo del estado de este.

    @Setter(AccessLevel.NONE)
    protected byte prevButtonState = BUTTON_UNPRESSED;                          // Estado anterior del botón.
    @Setter(AccessLevel.NONE)
    protected byte currentButtonState = BUTTON_UNPRESSED;                       // Estado actual del botón.

    /**
     * TODO: Description of method {@code GenericButton}.
     *
     */
    public GenericButton() {
        GenericButton.buttonNumber++;                                           // Aumenta la cantidad de botones creados.
        this.id = buttonNumber;                                                 // Almacena el id único del botón.
        this.name = String.valueOf(buttonNumber);                               // Almacena el id del botón en su nombre.
        this.buttonImages = new HashMap<>();                                    // Inicializa el mapa con las imagenes del botón.
    }

    /**
     * TODO: Description of method {@code GenericButton}.
     *
     * @param name es el nombre del botón.
     */
    public GenericButton(String name) {
        this();
        this.name = name;
    }

    /**
     * TODO: Description of method {@code GenericButton}.
     *
     * @param onGraphicListener es el componente gráfico asociado al botón.
     */
    public GenericButton(GenericButtonGraphicListener onGraphicListener) {
        this();
        this.onGraphicListener = onGraphicListener;
    }

    /**
     * TODO: Description of method {@code GenericButton}.
     *
     * @param name              es el nombre del botón.
     * @param onGraphicListener es el componente gráfico asociado al botón.
     */
    public GenericButton(String name, GenericButtonGraphicListener onGraphicListener) {
        this(name);
        this.onGraphicListener = onGraphicListener;
    }

    /**
     * FIXME: Description of method {@code getButtonImage}.
     *
     * @param state es el estado del botón asociado a dicha imágen.
     * @return la imágen del botón en el estado actual.
     */
    public final GenericImage getButtonImage(byte state) {
        return buttonImages.get(state);
    }

    /**
     * FIXME: Description of method {@code addButtonImage}.
     *
     * @param imageFactory Es la fábrica de imagenes genéricas.
     * @param stateCode    es el código de estado del botón para cambiar a esta imáagen.
     * @param path         es la ruta de la imagen.
     * @throws java.lang.Exception
     */
    public final void addButtonImage(GenericImageAbstractFactory imageFactory, Byte stateCode, String path) throws Exception {
        GenericImage buttonImage = imageFactory.makeGenericImage(path);
        buttonImages.put(stateCode, buttonImage);
    }

    /**
     * FIXME: Description of method {@code addButtonImage}.
     *
     * @param imageFactory Es la fábrica de imagenes genéricas.
     * @param stateCode    es el código de estado del botón para cambiar a esta imáagen.
     * @param path         es la ruta de la imagen.
     * @param positionX    es la coordenada que tendrá la imágen del botón en X.
     * @param positionY    es la coordenada que tendrá la imágen del botón en Y.
     * @throws java.lang.Exception
     */
    public final void addButtonImage(GenericImageAbstractFactory imageFactory, Byte stateCode, String path, int positionX, int positionY) throws Exception {
        GenericImage buttonImage = imageFactory.makeGenericImage(path, positionX, positionY);
        buttonImages.put(stateCode, buttonImage);
    }

    /**
     * FIXME: Description of method {@code addButtonImage}.
     *
     * @param imageFactory Es la fábrica de imagenes genéricas.
     * @param stateCode    es el código de estado del botón para cambiar a esta imáagen.
     * @param path         es la ruta de la imagen.
     * @param positionX    es la coordenada que tendrá la imágen del botón en X.
     * @param positionY    es la coordenada que tendrá la imágen del botón en Y.
     * @param width        es el ancho de la imagen.
     * @param height       es el alto de la imagen.
     * @throws java.lang.Exception
     */
    public final void addButtonImage(GenericImageAbstractFactory imageFactory, Byte stateCode, String path, int positionX, int positionY, int width, int height) throws Exception {
        GenericImage buttonImage = imageFactory.makeGenericImage(path, positionX, positionY, width, height);
        buttonImages.put(stateCode, buttonImage);
    }

    /**
     * FIXME: Description of method {@code addButtonImages}.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param statesCodes  son los código de estado del botón para cambiar a esa imáagen.
     * @param imagePaths   es la ruta de la imagen asociada al estado.
     * @param positions    son las coordenadas que tendrá cada imagen del botón.
     * @param dimensions   son las dimensiones que tendrá cada imagen del botón.
     * @throws java.lang.Exception
     */
    public final void addButtonImages(GenericImageAbstractFactory imageFactory, Byte statesCodes[], String imagePaths[], int positions[][], int dimensions[][]) throws Exception {
        if (statesCodes.length != imagePaths.length
                || statesCodes.length != positions.length
                || statesCodes.length != dimensions.length
                || imagePaths.length != positions.length
                || imagePaths.length != dimensions.length
                || positions.length != dimensions.length)
            throw new Exception("statesCodes, imagePaths positions and dimensions must have iqual length");
        for (int i = 0; i < statesCodes.length; i++)
            addButtonImage(imageFactory, statesCodes[i], imagePaths[i], positions[i][0], positions[i][1], dimensions[i][0], dimensions[i][1]);
    }

    /**
     * FIXME: Description of method {@code addButtonImages}.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param statesCodes  son los código de estado del botón para cambiar a esa imáagen.
     * @param imagePaths   es la ruta de la imagen asociada al estado.
     * @param positions    son las coordenadas que tendrá cada imagen del botón.
     * @throws java.lang.Exception
     */
    public final void addButtonImages(GenericImageAbstractFactory imageFactory, Byte statesCodes[], String imagePaths[], int positions[][]) throws Exception {
        if (statesCodes.length != imagePaths.length
                || statesCodes.length != positions.length
                || imagePaths.length != positions.length)
            throw new Exception("statesCodes, imagePaths and positions must have iqual length");
        for (int i = 0; i < statesCodes.length; i++)
            addButtonImage(imageFactory, statesCodes[i], imagePaths[i], positions[i][0], positions[i][1]);
    }

    /**
     * FIXME: Description of method {@code addButtonImages}.
     *
     * @param imageFactory Es la fabrica de imagenes genéricas.
     * @param statesCodes  son los código de estado del botón para cambiar a esa imáagen.
     * @param imagePaths   es la ruta de la imagen asociada al estado.
     * @throws java.lang.Exception
     */
    public final void addButtonImages(GenericImageAbstractFactory imageFactory, Byte statesCodes[], String imagePaths[]) throws Exception {
        if (statesCodes.length != imagePaths.length)
            throw new Exception("statesCodes, and imagePaths must have iqual length");
        for (int i = 0; i < statesCodes.length; i++)
            addButtonImage(imageFactory, statesCodes[i], imagePaths[i]);
    }

    /**
     * FIXME: Description of method {@code scaleImages}. Cambia la resolución de las imágenes de los botones
     * y el joystick.
     *
     * @param percent es el porcentaje de escalado del joystick.
     * @throws java.lang.Exception
     */
    public final void scaleImages(double percent) throws Exception {
        GenericImage buttonImage;
        for (Map.Entry<Byte, GenericImage> entry : buttonImages.entrySet()) {
            buttonImage = entry.getValue();

            double newWith = buttonImage.getWidth() * percent;
            double newHeight = buttonImage.getHeight() * percent;
            double newPositionX = buttonImage.getPositionX() * percent;
            double newPositionY = buttonImage.getPositionY() * percent;

            if ((newWith - (int) newWith) > 0.5)
                buttonImage.setWidth((int) (Math.ceil(newWith)) + 1);
            else
                buttonImage.setWidth((int) (Math.ceil(newWith)));

            if ((newHeight - (int) newHeight) > 0.5)
                buttonImage.setHeight((int) (Math.ceil(newHeight)) + 1);
            else
                buttonImage.setHeight((int) (Math.ceil(newHeight)));

            if ((newPositionX - (int) newPositionX) > 0.5)
                buttonImage.setPositionX((int) (Math.ceil(newPositionX)) + 1);
            else
                buttonImage.setPositionX((int) (Math.ceil(newPositionX)));

            if ((newPositionY - (int) newPositionY) > 0.5)
                buttonImage.setPositionY((int) (Math.ceil(newPositionY)) + 1);
            else
                buttonImage.setPositionY((int) (Math.ceil(newPositionY)));
        }
        if (onGraphicListener != null)
            getOnGraphicListener().onButtonStateChanged(BUTTON_RELEASED, getButtonImage(BUTTON_RELEASED));
    }

    /**
     * FIXME: Description of method {@code touchButton}. Pulsa el botón.
     *
     * @return si fue posible tocar el botón.
     */
    public boolean touchButton() {
        boolean result = false;                                                                                         // Si fue posible editar el estado del botón.
        prevButtonState = currentButtonState;                                                                           // Almacena el estado actual del botón como anterior.
        switch (currentButtonState) {                                                                                   // Evalúa el estado actual del botón.
            case BUTTON_UNPRESSED:                                                                                      // El estado es Unpressed.
            case BUTTON_RELEASED:                                                                                       // El estado es released.
                currentButtonState = BUTTON_TYPED;                                                                      // Marca el estado del botón.
                result = true;                                                                                          // Indica que fue posible cambiar el estado del botón.
                if (joystick != null)                                                                                   // Si hay un joystick asociado al botón.
                    result = joystick.onButtonStateChanged(id, currentButtonState);                                     // Notifica al joystick el cambio de estado del botón y obtiene el resultado.
                if (result) {                                                                                           // Si el resultado es verdarero todavía.
                    if (onGraphicListener != null)                                                                      // Si hay un componente genérico asociado al botón.
                        onGraphicListener.onButtonStateChanged(currentButtonState, getButtonImage(currentButtonState)); // Ejecuta acción para el botón gráfico asociado.
                    if (onActionListener != null) {                                                                     // Si el botón tiene un listener.
                        onActionListener.onTyped();                                                                     // Realiza acción para el nuevo estado del botón.
                        //onActionListener.setCurrentButtonState(currentButtonState);
                        //onActionListener.run();
                    }
                } else                                                                                                  // Si el resultado ya no es verdarero.
                    currentButtonState = prevButtonState;                                                               // Devuelve el estado del botón al estado anterior.
                break;

            case BUTTON_TYPED:                                                                                          // El estado es typed.
            case BUTTON_PRESSED:                                                                                        // El estado es Pressed.
                currentButtonState = BUTTON_PRESSED;                                                                    // Marca el estado del botón.
                result = true;                                                                                          // Indica que fue posible cambiar el estado del botón.
                if (joystick != null)                                                                                   // Si hay un joystick asociado al botón.
                    result = joystick.onButtonStateChanged(id, currentButtonState);                                     // Notifica al joystick el cambio de estado del botón y obtiene el resultado.
                if (result) {                                                                                           // Si el resultado es verdarero todavía.
                    if (onGraphicListener != null && currentButtonState == BUTTON_TYPED)                                // Si hay un componente genérico asociado al botón.
                        onGraphicListener.onButtonStateChanged(currentButtonState, getButtonImage(currentButtonState)); // Ejecuta acción para el botón gráfico asociado.
                    if (onActionListener != null) {                                                                     // Si el botón tiene un listener.
                        onActionListener.onPressed();                                                                   // Realiza acción para el nuevo estado del botón.
                        //onActionListener.setCurrentButtonState(currentButtonState);
                        //onActionListener.run();
                    }
                } else                                                                                                  // Si el resultado ya no es verdarero.
                    currentButtonState = prevButtonState;                                                               // Devuelve el estado del botón al estado anterior.
                break;
        }

        return result;                                                                                                  // Devuelve si fue posible cambiar el estado del botón.
    }

    /**
     * FIXME: Description of method {@code unTouchButton}. Dejar de pulsar el botón.
     *
     * @return si fue posible soltar el botón.
     */
    public boolean unTouchButton() {
        boolean result = false;                                                                                         // Si fue posible editar el estado del botón.
        prevButtonState = currentButtonState;                                                                           // Almacena el estado actual del botón como anterior.
        switch (currentButtonState) {                                                                                   // Evalúa el estado actual del botón.
            case BUTTON_UNPRESSED:                                                                                      // El estado es Unpressed.
            case BUTTON_RELEASED:                                                                                       // El estado es released.
                currentButtonState = BUTTON_UNPRESSED;                                                                  // Marca el estado del botón.
                result = true;                                                                                          // Indica que fue posible cambiar el estado del botón.
                if (joystick != null)                                                                                   // Si hay un joystick asociado al botón.
                    result = joystick.onButtonStateChanged(id, currentButtonState);                                     // Notifica al joystick el cambio de estado del botón y obtiene el resultado.
                if (result) {                                                                                           // Si el resultado es verdarero todavía.
                    if (onGraphicListener != null)                                                                      // Si hay un componente genérico asociado al botón.
                        onGraphicListener.onButtonStateChanged(currentButtonState, getButtonImage(currentButtonState)); // Ejecuta acción para el botón gráfico asociado.
                    if (onActionListener != null) {                                                                     // Si el botón tiene un listener.
                        onActionListener.onUnpressed();                                                                 // Realiza acción para el nuevo estado del botón.
                        //onActionListener.setCurrentButtonState(currentButtonState);
                        //onActionListener.run();
                    }
                } else                                                                                                  // Si el resultado ya no es verdarero.
                    currentButtonState = prevButtonState;                                                               // Devuelve el estado del botón al estado anterior.
                break;

            case BUTTON_TYPED:                                                                                          // El estado es typed.
            case BUTTON_PRESSED:                                                                                        // El estado es Pressed.
                currentButtonState = BUTTON_RELEASED;                                                                   // Marca el estado del botón.
                result = true;                                                                                          // Indica que fue posible cambiar el estado del botón.
                if (joystick != null)                                                                                   // Si hay un joystick asociado al botón.
                    result = joystick.onButtonStateChanged(id, currentButtonState);                                     // Notifica al joystick el cambio de estado del botón y obtiene el resultado.
                if (result) {                                                                                           // Si el resultado es verdarero todavía.
                    if (onGraphicListener != null)                                                                      // Si hay un componente genérico asociado al botón.
                        onGraphicListener.onButtonStateChanged(currentButtonState, getButtonImage(currentButtonState)); // Ejecuta acción para el botón gráfico asociado.
                    if (onActionListener != null) {                                                                     // Si el botón tiene un listener.
                        onActionListener.onReleased();                                                                  // Realiza acción para el nuevo estado del botón.
                        //onActionListener.setCurrentButtonState(currentButtonState);
                        //onActionListener.run();
                    }
                } else                                                                                                  // Si el resultado ya no es verdarero.
                    currentButtonState = prevButtonState;                                                               // Devuelve el estado del botón al estado anterior.
                break;
        }

        return result;                                                                                                  // Devuelve si fue posible cambiar el estado del botón.
    }

    /**
     * Get the current {@code Object} as {@code String}.
     *
     * @return {@code String} representing this {@code Object}.
     */
    @Override
    public String toString() {
        return "GenericButton{" + "currentButtonState=" + currentButtonState + ", name=" + name + ", id=" + id + ", keyEvent=" + keyEvent + ", buttonImages=" + buttonImages + '}';
    }
}
