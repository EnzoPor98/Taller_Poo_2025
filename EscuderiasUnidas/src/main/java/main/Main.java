package main;

import gui.Inicio;
import logica.GestorDeClases;

public class Main {

    public static void main(String args[]) {
        GestorDeClases gc = new GestorDeClases();

        Inicio ventana = new Inicio(gc);
    }
}
