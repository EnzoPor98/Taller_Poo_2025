package main;

import gui.VentanaInicio;
import servicie.GestorDeClases;

public class Main {

    public static void main(String args[]) {
        GestorDeClases gc = new GestorDeClases();

        VentanaInicio ventana = new VentanaInicio(gc);
    }
}
