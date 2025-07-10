/*
 * @overview        {JoystickNotFoundException}
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
package com.project.dev.joystick.exception;

/**
 * FIXME: Description of {@code JoystickNotFoundException}. Exception que ocurre cuando al usar la
 * fábrica de joystick el joystick con el nombre indicado no es encontrado en el classpath.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class JoystickNotFoundException extends Exception {

    /**
     * TODO: Description of method {@code JoystickNotFoundException}.
     *
     * @param message es el mensaje que mostrará la exception.
     */
    public JoystickNotFoundException(String message) {
        super(message);
    }
}
