package main;

import gui.VentanaInicio;
import servicie.GestorDeClases;

public class Main {

    public static void main(String args[]) {
        VentanaInicio ventana = new VentanaInicio(new GestorDeClases());
    }
}
