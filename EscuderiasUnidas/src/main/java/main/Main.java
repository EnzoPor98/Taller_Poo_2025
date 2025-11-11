package main;

import logica.*;
import gui.VentanaInicio;
import servicie.GestorDeClases;

public class Main {

    public static void main(String args[]) {
        GestorDeClases gc = new GestorDeClases();

        // ********** CREAMOS DATOS DE PRUEBA ********** //
        Pais pais = new Pais(0, "Argentina", "Descripcion 1");
        Pais pais2 = new Pais(1, "Uruguay", "Descripcion 2");
        Pais pais3 = new Pais(2, "Paraguay", "Descripcion 3");

        Circuito circuito = new Circuito();
        circuito.setNombre("Circuito 1");
        circuito.setLongitud(500);
        circuito.setPais(pais);
        pais.agregarCircuito(circuito);

        Circuito circuito2 = new Circuito();
        circuito2.setNombre("Circuito 2");
        circuito2.setLongitud(800);
        circuito2.setPais(pais);
        pais.agregarCircuito(circuito2);

        Escuderia escuderia = new Escuderia();
        escuderia.setNombre("Escuderia 1");
        escuderia.setPais(pais);
        pais.agregarEscuderia(escuderia);

        Escuderia escuderia2 = new Escuderia();
        escuderia2.setNombre("Escuderia 2");
        escuderia2.setPais(pais);
        pais.agregarEscuderia(escuderia2);

        Escuderia escuderia3 = new Escuderia();
        escuderia3.setNombre("Escuderia 3");
        escuderia3.setPais(pais);
        pais.agregarEscuderia(escuderia3);

        Mecanico mecanico = new Mecanico();
        mecanico.setDni("00111222");
        mecanico.setNombre("Enzo");
        mecanico.setApellido("Portillo");
        mecanico.setPais(pais);
        mecanico.setEspecialidad(Especialidad.ELECTRONICA);
        mecanico.setAñosExperiencia(4);
        pais.agregarPersonas(mecanico);

        Mecanico mecanico2 = new Mecanico();
        mecanico2.setDni("33444555");
        mecanico2.setNombre("Ariel");
        mecanico2.setApellido("Portillo");
        mecanico2.setPais(pais);
        mecanico2.setEspecialidad(Especialidad.MOTOR);
        mecanico2.setAñosExperiencia(2);
        pais.agregarPersonas(mecanico2);

        Auto auto = new Auto();
        auto.setModelo("modelo 1");
        auto.setMotor("motor 1");
        auto.setEscuderia(escuderia);
        escuderia.agregarAuto(auto);

        Auto auto2 = new Auto();
        auto2.setModelo("modelo 2");
        auto2.setMotor("motor 2");
        auto2.setEscuderia(escuderia2);
        escuderia2.agregarAuto(auto2);

        Auto auto3 = new Auto();
        auto3.setModelo("modelo 3");
        auto3.setMotor("motor 3");
        auto3.setEscuderia(escuderia3);
        escuderia3.agregarAuto(auto3);

        Piloto piloto = new Piloto();
        piloto.setDni("66777888");
        piloto.setNombre("Eze");
        piloto.setApellido("Romero");
        piloto.setPais(pais);
        pais.agregarPersonas(piloto);

        Piloto piloto2 = new Piloto();
        piloto2.setDni("99000111");
        piloto2.setNombre("Juan");
        piloto2.setApellido("Romero");
        piloto2.setPais(pais);
        pais.agregarPersonas(piloto2);

        // RELACION MECANICO-ESCUDERIA.
        mecanico.agregarEscuderia(escuderia);
        escuderia.agregarMecanico(mecanico);

        mecanico2.agregarEscuderia(escuderia2);
        escuderia2.agregarMecanico(mecanico2);

        // RELACION PILOTO-ESCUDERIA.
        PilotoEscuderia pe = new PilotoEscuderia();
        pe.setPiloto(piloto);
        pe.setEscuderia(escuderia);
        pe.setDesdeFecha("2025/11/13");
        pe.setHastaFecha("2025/12/13");
        piloto.agregarEscuderia(pe);
        escuderia.agregarPilotoEscuderia(pe);

        PilotoEscuderia pe2 = new PilotoEscuderia();
        pe2.setPiloto(piloto2);
        pe2.setEscuderia(escuderia2);
        pe2.setDesdeFecha("2025/11/13");
        pe2.setHastaFecha("2025/12/13");
        piloto2.agregarEscuderia(pe2);
        escuderia2.agregarPilotoEscuderia(pe2);

        // RELACION AUTO-PILOTO
        AutoPiloto ap = new AutoPiloto();
        ap.setAuto(auto);
        ap.setPiloto(piloto);
        ap.setFechaAsignacion("2025/11/13");
        auto.agregarAutoPiloto(ap);
        piloto.agregarAuto(ap);

        AutoPiloto ap2 = new AutoPiloto();
        ap2.setAuto(auto2);
        ap2.setPiloto(piloto2);
        ap2.setFechaAsignacion("2025/11/13");
        auto2.agregarAutoPiloto(ap2);
        piloto2.agregarAuto(ap2);

        // CARRERA
        Carrera carrera = new Carrera();
        carrera.agregarAutoPilotoParticipante(ap);
        carrera.agregarAutoPilotoParticipante(ap2);
        carrera.setCircuito(circuito);
        carrera.setFechaRealizacion("2025/12/13");
        carrera.sethoraRealizacion("12:30:00");
        carrera.setNumeroVueltas(5);
        carrera.setPais(pais);

        // ********** CARGAMOS LOS DATOS DE PRUEBA **********//
        gc.agregarPais(pais);
        gc.agregarCircuito(circuito);
        gc.agregarEscuderia(escuderia);
        gc.agregarMecanico(mecanico);
        gc.agregarAuto(auto);
        gc.agregarPiloto(piloto);
        
        gc.agregarPais(pais2);
        gc.agregarCircuito(circuito2);
        gc.agregarEscuderia(escuderia2);
        gc.agregarMecanico(mecanico2);
        gc.agregarAuto(auto2);
        gc.agregarPiloto(piloto2);
        
        gc.agregarPais(pais3);
        
        gc.agregarCarrera(carrera);

        VentanaInicio ventana = new VentanaInicio(gc);
    }
}
