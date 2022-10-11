/*
 * @fileoverview {GraphicJoystickFactory} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {GraphicJoystickFactory} fue realizada el 31/07/2022.
 * @Dev - La primera version de {GraphicJoystickFactory} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.factory;

import com.project.dev.joystick.exception.JoystickClientConnectionRefusedException;
import com.project.dev.joystick.exception.JoystickNotFoundException;
import com.project.dev.joystick.exception.UnknownJoystickTypeException;
import com.project.dev.joystick.graphic.GraphicJoystick;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.generic.setter.GenericJoystickGraphicSetter;
import com.project.dev.joystick.setter.JoystickViewSetter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * FIXME: Definición de {@code GraphicJoystickFactory}. Se usa para fabricar un joystick, buscando
 * el nombre del joystick usando la fábrica de joystick, y además para agregarle la parte gráfica al
 * joystick.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class GraphicJoystickFactory {

    private JoystickViewSetter joystickViewSetter;

    /**
     * TODO: Definición de {@code GraphicJoystickFactory}.
     *
     * @param joystickViewSetter Es el asignador gráfico del joystick a la ventana.
     */
    public GraphicJoystickFactory(JoystickViewSetter joystickViewSetter) {
        this.joystickViewSetter = joystickViewSetter;
    }

    /**
     * TODO: Definición de {@code getJoystickViewSetter}.
     *
     * @return
     */
    public JoystickViewSetter getJoystickViewSetter() {
        return joystickViewSetter;
    }

    /**
     * TODO: Definición de {@code setJoystickViewSetter}.
     *
     * @param joystickViewSetter
     */
    public void setJoystickViewSetter(JoystickViewSetter joystickViewSetter) {
        this.joystickViewSetter = joystickViewSetter;
    }

    /**
     * FIXME: Definición de {@code makeGraphicJoystick}. Crea un joystick con la información
     * indicada.
     *
     * @param type       es el tipo de joystick que se creará (Local, cliente o servidor). Usar los
     *                   tipos especificado en "GenericJoystick.JOYSTICK_TYPE_????".
     * @param name       es el nombre del joystick que se creará, buscandolo en el classpath en
     *                   "com.project.dev.joystick.name.{@code name}".
     * @param ipAddress  Es la dirección ip donde se conectará el joystick cliente en caso de ser de
     *                   este tipo, caso contario usar cualquier valor.
     * @param serverPort Es el puerto de conexión donde se conectará el joystick cliente en caso de
     *                   ser de este tipo, caso contario usar cualquier valor.
     * @return Asignador de joystick a la vista.
     * @throws JoystickClientConnectionRefusedException
     * @throws JoystickNotFoundException
     * @throws UnknownJoystickTypeException
     * @throws java.lang.Exception
     */
    public GraphicJoystick makeGraphicJoystick(String type, String name, String ipAddress, int serverPort) throws JoystickNotFoundException, JoystickClientConnectionRefusedException, UnknownJoystickTypeException, Exception {
        GenericJoystick joystick = JoystickFactory.makeJoystick(type, name, ipAddress, serverPort);         // Usa la fábrica de joystick para crear un joystick genérico.

        String joystickPackage;                                                                             // Paquete donde está el joystick.
        String setterPackage;                                                                               // Nombre del paquete donde está el setter del joystick.

        name = joystick.getName();                                                                          // Obtiene el nombre del joystick.
        joystickPackage = "com.project.dev.joystick.name." + name.toLowerCase();                            // Obtiene el nombre del paquete donde está el joystick.
        setterPackage = joystickPackage + ".setter.";                                                       // Obtiene el nombre del paquete donde está el setter del joystick.

        GenericJoystickGraphicSetter graphicSetter;                                                         // Crea un asignador de gráficos para el joystick.
        Class<?> graphicSetterClass;                                                                        // Clase del asignador gráfico del joystick dependiendo del tipo y nombre del joystick indicado.
        Constructor graphicSetterConstructor;                                                               // Constructor del asignador gráfico del joystick.

        // Busca la clase y el constructor del asignador de gráficos del joystick.
        try {
            graphicSetterClass = Class.forName(setterPackage + name + "JoystickGraphicSetter");             // Obtiene la clase del asignador gráfico del joystick con nombre indicado.
            graphicSetterConstructor = graphicSetterClass.getConstructor();                                 // Obtiene el constructor del asignador gráfico del joystick con nombre indicado.
            graphicSetter = (GenericJoystickGraphicSetter) graphicSetterConstructor.newInstance();          // Crea nueva instancia del asignador gráfico del joystick con el nombre indicado.
        } catch (ClassNotFoundException e) {
            // Si no encuentra la clase.
            throw new JoystickNotFoundException("Cannot get joystick graphic setter in : " + setterPackage + name + "JoystickGraphicSetter");
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JoystickNotFoundException("Error invoicing deafult constructor from joystick graphic setter in : "
                    + setterPackage + name + "JoystickGraphicSetter");
        }
        return joystickViewSetter.addJoystickToView(joystick, graphicSetter);                               // Agrega joystick a la interfaz gráfica.
    }
}
