package main;

import logica.*;
import gui.VentanaInicio;
import servicie.GestorDeClases;

public class Main {
    
    public static void main(String args[]) {
        GestorDeClases gc = new GestorDeClases();

        // ********** CREAMOS DATOS DE PRUEBA ********** //
        // PAISES.
        Pais pais = new Pais(1, "Argentina", "Descripcion 1");
        Pais pais2 = new Pais(2, "Uruguay", "Descripcion 2");
        Pais pais3 = new Pais(3, "Paraguay", "Descripcion 3");
        Pais pais4 = new Pais(4, "Brasil", "Descripcion 4");
        Pais pais5 = new Pais(5, "Chile", "Descripcion 5");

        // CIRCUITOS.
        Circuito circuito = new Circuito();
        circuito.setNombre("CircuitoArgentino");
        circuito.setLongitud(500);
        circuito.setPais(pais);
        pais.agregarCircuito(circuito);
        
        Circuito circuito2 = new Circuito();
        circuito2.setNombre("CircuitoUruguayo");
        circuito2.setLongitud(800);
        circuito2.setPais(pais2);
        pais2.agregarCircuito(circuito2);
        
        Circuito circuito3 = new Circuito();
        circuito3.setNombre("CircuitoParaguayo");
        circuito3.setLongitud(250);
        circuito3.setPais(pais3);
        pais3.agregarCircuito(circuito3);
        
        Circuito circuito4 = new Circuito();
        circuito4.setNombre("CircuitoBrasilero");
        circuito4.setLongitud(980);
        circuito4.setPais(pais4);
        pais4.agregarCircuito(circuito4);
        
        Circuito circuito5 = new Circuito();
        circuito5.setNombre("CircuitoChileno");
        circuito5.setLongitud(100);
        circuito5.setPais(pais5);
        pais5.agregarCircuito(circuito5);

        // ESCUDERIAS.
        Escuderia escuderia = new Escuderia();
        escuderia.setNombre("EscuderiaArgentina");
        escuderia.setPais(pais);
        pais.agregarEscuderia(escuderia);
        
        Escuderia escuderia2 = new Escuderia();
        escuderia2.setNombre("EscuderiaUruguaya");
        escuderia2.setPais(pais2);
        pais2.agregarEscuderia(escuderia2);
        
        Escuderia escuderia3 = new Escuderia();
        escuderia3.setNombre("EscuderiaParaguaya");
        escuderia3.setPais(pais3);
        pais3.agregarEscuderia(escuderia3);
        
        Escuderia escuderia4 = new Escuderia();
        escuderia4.setNombre("EscuderiaBrasilera");
        escuderia4.setPais(pais4);
        pais4.agregarEscuderia(escuderia4);
        
        Escuderia escuderia5 = new Escuderia();
        escuderia5.setNombre("EscuderiaChilena");
        escuderia5.setPais(pais5);
        pais5.agregarEscuderia(escuderia5);

        // MECANICOS.
        Mecanico mecanico = new Mecanico();
        mecanico.setDni("1");
        mecanico.setNombre("Enzo");
        mecanico.setApellido("Portillo");
        mecanico.setPais(pais);
        mecanico.setEspecialidad(Especialidad.ELECTRONICA);
        mecanico.setAñosExperiencia(4);
        pais.agregarPersonas(mecanico);
        
        Mecanico mecanico2 = new Mecanico();
        mecanico2.setDni("2");
        mecanico2.setNombre("Ariel");
        mecanico2.setApellido("Portillo");
        mecanico2.setPais(pais2);
        mecanico2.setEspecialidad(Especialidad.MOTOR);
        mecanico2.setAñosExperiencia(2);
        pais2.agregarPersonas(mecanico2);
        
        Mecanico mecanico3 = new Mecanico();
        mecanico3.setDni("3");
        mecanico3.setNombre("Enzo");
        mecanico3.setApellido("Portillo");
        mecanico3.setPais(pais3);
        mecanico3.setEspecialidad(Especialidad.CHASIS);
        mecanico3.setAñosExperiencia(4);
        pais3.agregarPersonas(mecanico3);
        
        Mecanico mecanico4 = new Mecanico();
        mecanico4.setDni("4");
        mecanico4.setNombre("Enzo");
        mecanico4.setApellido("Portillo");
        mecanico4.setPais(pais4);
        mecanico4.setEspecialidad(Especialidad.NEUMUMATICOS);
        mecanico4.setAñosExperiencia(4);
        pais4.agregarPersonas(mecanico4);
        
        Mecanico mecanico5 = new Mecanico();
        mecanico5.setDni("5");
        mecanico5.setNombre("Enzo");
        mecanico5.setApellido("Portillo");
        mecanico5.setPais(pais5);
        mecanico5.setEspecialidad(Especialidad.ELECTRONICA);
        mecanico5.setAñosExperiencia(4);
        pais5.agregarPersonas(mecanico5);

        // AUTOS.
        Auto auto = new Auto();
        auto.setModelo("modelo1");
        auto.setMotor("motor1");
        auto.setEscuderia(escuderia);
        escuderia.agregarAuto(auto);
        
        Auto auto2 = new Auto();
        auto2.setModelo("modelo2");
        auto2.setMotor("motor2");
        auto2.setEscuderia(escuderia);
        escuderia.agregarAuto(auto2);
        
        Auto auto3 = new Auto();
        auto3.setModelo("modelo3");
        auto3.setMotor("motor3");
        auto3.setEscuderia(escuderia2);
        escuderia2.agregarAuto(auto3);
        
        Auto auto4 = new Auto();
        auto4.setModelo("modelo4");
        auto4.setMotor("motor4");
        auto4.setEscuderia(escuderia2);
        escuderia2.agregarAuto(auto4);
        
        Auto auto5 = new Auto();
        auto5.setModelo("modelo5");
        auto5.setMotor("motor5");
        auto5.setEscuderia(escuderia3);
        escuderia3.agregarAuto(auto5);
        
        Auto auto6 = new Auto();
        auto6.setModelo("modelo6");
        auto6.setMotor("motor6");
        auto6.setEscuderia(escuderia3);
        escuderia3.agregarAuto(auto6);
        
        Auto auto7 = new Auto();
        auto7.setModelo("modelo7");
        auto7.setMotor("motor7");
        auto7.setEscuderia(escuderia4);
        escuderia4.agregarAuto(auto7);
        
        Auto auto8 = new Auto();
        auto8.setModelo("modelo8");
        auto8.setMotor("motor8");
        auto8.setEscuderia(escuderia4);
        escuderia4.agregarAuto(auto8);
        
        Auto auto9 = new Auto();
        auto9.setModelo("modelo9");
        auto9.setMotor("motor9");
        auto9.setEscuderia(escuderia5);
        escuderia5.agregarAuto(auto9);
        
        Auto auto10 = new Auto();
        auto10.setModelo("modelo10");
        auto10.setMotor("motor10");
        auto10.setEscuderia(escuderia5);
        escuderia5.agregarAuto(auto10);

        // PILOTOS.
        Piloto piloto = new Piloto();
        piloto.setDni("1");
        piloto.setNombre("Ezequiel");
        piloto.setApellido("Romero 1");
        piloto.setPais(pais);
        pais.agregarPersonas(piloto);
        
        Piloto piloto2 = new Piloto();
        piloto2.setDni("2");
        piloto2.setNombre("Ezequiel");
        piloto2.setApellido("Romero 2");
        piloto2.setPais(pais);
        pais.agregarPersonas(piloto2);
        
        Piloto piloto3 = new Piloto();
        piloto3.setDni("3");
        piloto3.setNombre("Ezequiel");
        piloto3.setApellido("Romero 3");
        piloto3.setPais(pais2);
        pais2.agregarPersonas(piloto3);
        
        Piloto piloto4 = new Piloto();
        piloto4.setDni("4");
        piloto4.setNombre("Ezequiel");
        piloto4.setApellido("Romero 4");
        piloto4.setPais(pais2);
        pais2.agregarPersonas(piloto4);
        
        Piloto piloto5 = new Piloto();
        piloto5.setDni("5");
        piloto5.setNombre("Ezequiel");
        piloto5.setApellido("Romero 5");
        piloto5.setPais(pais3);
        pais3.agregarPersonas(piloto5);
        
        Piloto piloto6 = new Piloto();
        piloto6.setDni("6");
        piloto6.setNombre("Ezequiel");
        piloto6.setApellido("Romero 6");
        piloto6.setPais(pais3);
        pais3.agregarPersonas(piloto6);
        
        Piloto piloto7 = new Piloto();
        piloto7.setDni("7");
        piloto7.setNombre("Ezequiel");
        piloto7.setApellido("Romero 7");
        piloto7.setPais(pais4);
        pais4.agregarPersonas(piloto7);
        
        Piloto piloto8 = new Piloto();
        piloto8.setDni("8");
        piloto8.setNombre("Ezequiel");
        piloto8.setApellido("Romero 8");
        piloto8.setPais(pais4);
        pais4.agregarPersonas(piloto8);
        
        Piloto piloto9 = new Piloto();
        piloto9.setDni("9");
        piloto9.setNombre("Ezequiel");
        piloto9.setApellido("Romero 9");
        piloto9.setPais(pais5);
        pais5.agregarPersonas(piloto9);
        
        Piloto piloto10 = new Piloto();
        piloto10.setDni("10");
        piloto10.setNombre("Ezequiel");
        piloto10.setApellido("Romero 10");
        piloto10.setPais(pais5);
        pais5.agregarPersonas(piloto10);

        // RELACION MECANICO-ESCUDERIA.
        mecanico.agregarEscuderia(escuderia);
        escuderia.agregarMecanico(mecanico);
        
        mecanico2.agregarEscuderia(escuderia2);
        escuderia2.agregarMecanico(mecanico2);
        
        mecanico3.agregarEscuderia(escuderia3);
        escuderia3.agregarMecanico(mecanico3);
        
        mecanico4.agregarEscuderia(escuderia4);
        escuderia4.agregarMecanico(mecanico4);
        
        mecanico5.agregarEscuderia(escuderia5);
        escuderia5.agregarMecanico(mecanico5);

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
        pe2.setEscuderia(escuderia);
        pe2.setDesdeFecha("2025/11/13");
        pe2.setHastaFecha("2025/12/13");
        piloto2.agregarEscuderia(pe2);
        escuderia.agregarPilotoEscuderia(pe2);
        
        PilotoEscuderia pe3 = new PilotoEscuderia();
        pe3.setPiloto(piloto3);
        pe3.setEscuderia(escuderia2);
        pe3.setDesdeFecha("2025/11/13");
        pe3.setHastaFecha("2025/12/13");
        piloto3.agregarEscuderia(pe3);
        escuderia2.agregarPilotoEscuderia(pe3);
        
        PilotoEscuderia pe4 = new PilotoEscuderia();
        pe4.setPiloto(piloto4);
        pe4.setEscuderia(escuderia2);
        pe4.setDesdeFecha("2025/11/13");
        pe4.setHastaFecha("2025/12/13");
        piloto4.agregarEscuderia(pe4);
        escuderia2.agregarPilotoEscuderia(pe4);
        
        PilotoEscuderia pe5 = new PilotoEscuderia();
        pe5.setPiloto(piloto5);
        pe5.setEscuderia(escuderia3);
        pe5.setDesdeFecha("2025/11/13");
        pe5.setHastaFecha("2025/12/13");
        piloto5.agregarEscuderia(pe5);
        escuderia3.agregarPilotoEscuderia(pe5);
        
        PilotoEscuderia pe6 = new PilotoEscuderia();
        pe6.setPiloto(piloto6);
        pe6.setEscuderia(escuderia3);
        pe6.setDesdeFecha("2025/11/13");
        pe6.setHastaFecha("2025/12/13");
        piloto6.agregarEscuderia(pe6);
        escuderia3.agregarPilotoEscuderia(pe6);
        
        PilotoEscuderia pe7 = new PilotoEscuderia();
        pe7.setPiloto(piloto7);
        pe7.setEscuderia(escuderia4);
        pe7.setDesdeFecha("2025/11/13");
        pe7.setHastaFecha("2025/12/13");
        piloto7.agregarEscuderia(pe7);
        escuderia4.agregarPilotoEscuderia(pe7);
        
        PilotoEscuderia pe8 = new PilotoEscuderia();
        pe8.setPiloto(piloto8);
        pe8.setEscuderia(escuderia4);
        pe8.setDesdeFecha("2025/11/13");
        pe8.setHastaFecha("2025/12/13");
        piloto8.agregarEscuderia(pe8);
        escuderia4.agregarPilotoEscuderia(pe8);
        
        PilotoEscuderia pe9 = new PilotoEscuderia();
        pe9.setPiloto(piloto9);
        pe9.setEscuderia(escuderia5);
        pe9.setDesdeFecha("2025/11/13");
        pe9.setHastaFecha("2025/12/13");
        piloto9.agregarEscuderia(pe9);
        escuderia5.agregarPilotoEscuderia(pe9);
        
        PilotoEscuderia pe10 = new PilotoEscuderia();
        pe10.setPiloto(piloto10);
        pe10.setEscuderia(escuderia5);
        pe10.setDesdeFecha("2025/11/13");
        pe10.setHastaFecha("2025/12/13");
        piloto10.agregarEscuderia(pe10);
        escuderia5.agregarPilotoEscuderia(pe10);

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
        
        AutoPiloto ap3 = new AutoPiloto();
        ap3.setAuto(auto3);
        ap3.setPiloto(piloto3);
        ap3.setFechaAsignacion("2025/11/13");
        auto3.agregarAutoPiloto(ap3);
        piloto3.agregarAuto(ap3);
        
        AutoPiloto ap4 = new AutoPiloto();
        ap4.setAuto(auto4);
        ap4.setPiloto(piloto4);
        ap4.setFechaAsignacion("2025/11/13");
        auto4.agregarAutoPiloto(ap4);
        piloto4.agregarAuto(ap4);
        
        AutoPiloto ap5 = new AutoPiloto();
        ap5.setAuto(auto5);
        ap5.setPiloto(piloto5);
        ap5.setFechaAsignacion("2025/11/13");
        auto5.agregarAutoPiloto(ap5);
        piloto5.agregarAuto(ap5);
        
        AutoPiloto ap6 = new AutoPiloto();
        ap6.setAuto(auto6);
        ap6.setPiloto(piloto6);
        ap6.setFechaAsignacion("2025/11/13");
        auto6.agregarAutoPiloto(ap6);
        piloto6.agregarAuto(ap6);
        
        AutoPiloto ap7 = new AutoPiloto();
        ap7.setAuto(auto7);
        ap7.setPiloto(piloto7);
        ap7.setFechaAsignacion("2025/11/13");
        auto7.agregarAutoPiloto(ap7);
        piloto7.agregarAuto(ap7);
        
        AutoPiloto ap8 = new AutoPiloto();
        ap8.setAuto(auto8);
        ap8.setPiloto(piloto8);
        ap8.setFechaAsignacion("2025/11/13");
        auto8.agregarAutoPiloto(ap8);
        piloto8.agregarAuto(ap8);
        
        AutoPiloto ap9 = new AutoPiloto();
        ap9.setAuto(auto9);
        ap9.setPiloto(piloto9);
        ap9.setFechaAsignacion("2025/11/13");
        auto9.agregarAutoPiloto(ap9);
        piloto9.agregarAuto(ap9);
        
        AutoPiloto ap10 = new AutoPiloto();
        ap10.setAuto(auto10);
        ap10.setPiloto(piloto10);
        ap10.setFechaAsignacion("2025/11/13");
        auto10.agregarAutoPiloto(ap10);
        piloto10.agregarAuto(ap10);

        // CARRERA
        Carrera carrera = new Carrera();
        carrera.agregarAutoPilotoParticipante(ap);
        carrera.agregarAutoPilotoParticipante(ap2);
        carrera.agregarAutoPilotoParticipante(ap3);
        carrera.agregarAutoPilotoParticipante(ap4);
        carrera.agregarAutoPilotoParticipante(ap5);
        carrera.agregarAutoPilotoParticipante(ap6);
        carrera.agregarAutoPilotoParticipante(ap7);
        carrera.agregarAutoPilotoParticipante(ap8);
        carrera.agregarAutoPilotoParticipante(ap9);
        carrera.agregarAutoPilotoParticipante(ap10);
        carrera.setCircuito(circuito);
        carrera.setFechaRealizacion("2025/12/13");
        carrera.sethoraRealizacion("12:30:00");
        carrera.setNumeroVueltas(5);
        carrera.setPais(pais);
        pais.agregarCarrera(carrera);

        // RESULTADO.
        Resultado resultado = carrera.getResultado();
        resultado.agregarParticipante(ap);
        resultado.agregarVuelta("01:05:52");
        
        resultado.agregarParticipante(ap7);
        resultado.agregarVuelta("01:12:45");
        
        resultado.agregarParticipante(ap3);
        resultado.agregarVuelta("01:14:07");
        
        resultado.agregarParticipante(ap4);
        resultado.agregarVuelta("01:21:10");
        
        resultado.agregarParticipante(ap5);
        resultado.agregarVuelta("01:27:32");
        
        resultado.agregarParticipante(ap8);
        resultado.agregarVuelta("01:33:44");
        
        resultado.agregarParticipante(ap9);
        resultado.agregarVuelta("01:37:19");
        
        resultado.agregarParticipante(ap10);
        resultado.agregarVuelta("01:49:28");
        
        resultado.agregarParticipante(ap6);
        resultado.agregarVuelta("01:56:55");
        
        resultado.agregarParticipante(ap2);
        resultado.agregarVuelta("01:58:03");
        
        // ********** CARGAMOS LOS DATOS DE PRUEBA **********//
        gc.agregarPais(pais);
        gc.agregarPais(pais2);
        gc.agregarPais(pais3);
        gc.agregarPais(pais4);
        gc.agregarPais(pais5);
        gc.agregarCircuito(circuito);
        gc.agregarCircuito(circuito2);
        gc.agregarCircuito(circuito3);
        gc.agregarCircuito(circuito4);
        gc.agregarCircuito(circuito5);
        gc.agregarEscuderia(escuderia);
        gc.agregarEscuderia(escuderia2);
        gc.agregarEscuderia(escuderia3);
        gc.agregarEscuderia(escuderia4);
        gc.agregarEscuderia(escuderia5);
        gc.agregarMecanico(mecanico);
        gc.agregarMecanico(mecanico2);
        gc.agregarMecanico(mecanico3);
        gc.agregarMecanico(mecanico4);
        gc.agregarMecanico(mecanico5);
        gc.agregarAuto(auto);
        gc.agregarAuto(auto2);
        gc.agregarAuto(auto3);
        gc.agregarAuto(auto4);
        gc.agregarAuto(auto5);
        gc.agregarAuto(auto6);
        gc.agregarAuto(auto7);
        gc.agregarAuto(auto8);
        gc.agregarAuto(auto9);
        gc.agregarAuto(auto10);
        gc.agregarPiloto(piloto);
        gc.agregarPiloto(piloto2);
        gc.agregarPiloto(piloto3);
        gc.agregarPiloto(piloto4);
        gc.agregarPiloto(piloto5);
        gc.agregarPiloto(piloto6);
        gc.agregarPiloto(piloto7);
        gc.agregarPiloto(piloto8);
        gc.agregarPiloto(piloto9);
        gc.agregarPiloto(piloto10);
        gc.agregarCarrera(carrera);
        
        VentanaInicio ventana = new VentanaInicio(gc);
    }
}
