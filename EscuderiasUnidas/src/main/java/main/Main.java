package main;

import logica.*;
import gui.VentanaInicio;
import servicie.GestorDeClases;

public class Main {

    public static void main(String args[]) {
        GestorDeClases gc = new GestorDeClases();

        //********** CREAMOS DATOS DE PRUEBA **********//
        Pais pais = new Pais(0, "Argentina", "Descripcion");

        Circuito circuito = new Circuito();
        circuito.setNombre("Circuito FCAD");
        circuito.setLongitud(500);
        circuito.setPais(pais);

        Escuderia escuderia = new Escuderia();
        escuderia.setNombre("Sistemas");
        escuderia.setPais(pais);

        Mecanico mecanico = new Mecanico();
        mecanico.setDni("12.123.123");
        mecanico.setNombre("Enzo");
        mecanico.setApellido("Portillo");
        mecanico.setPais(pais);
        mecanico.setEspecialidad(Especialidad.ELECTRONICA);
        mecanico.setAñosExperiencia(4);

        Auto auto = new Auto();
        auto.setModelo("modelo");
        auto.setMotor("motor");
        auto.setEscuderia(escuderia);

        Piloto piloto = new Piloto();
        piloto.setDni("78.789.789");
        piloto.setNombre("Eze");
        piloto.setApellido("Romero");
        piloto.setPais(pais);

        // RELACION MECANICO-ESCUDERIA.
        mecanico.agregarEscuderia(escuderia);
        escuderia.agregarMecanico(mecanico);

        // RELACION PILOTO-ESCUDERIA.
        PilotoEscuderia pe = new PilotoEscuderia();
        pe.setPiloto(piloto);
        pe.setEscuderia(escuderia);
        pe.setDesdeFecha("2025116");
        pe.setHastaFecha("2025126");

        //RELACION AUTO-PILOTO
        AutoPiloto ap = new AutoPiloto();
        ap.setAuto(auto);
        ap.setPiloto(piloto);
        ap.setFechaAsignacion("2025116");
        auto.agregarPilotos(ap);
        piloto.agregarAuto(ap);

        //********** CARGAMOS LOS DATOS DE PRUEBA **********//
        gc.agregarPais(pais);
        gc.agregarCircuito(circuito);
        gc.agregarEscuderia(escuderia);
        gc.agregarMecanico(mecanico);
        gc.agregarAuto(auto);
        gc.agregarPiloto(piloto);

        VentanaInicio ventana = new VentanaInicio(gc);
    }
}
