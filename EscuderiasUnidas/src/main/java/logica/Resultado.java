/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import exceptions.*;

/**
 * Representa los Resultados dentro del campeonato. Almacena carrera y la lista
 * de participantes, vueltas.
 */
public class Resultado {

    private Carrera carrera;
    private ArrayList<AutoPiloto> participantes;
    private ArrayList<String> vueltas;

    /**
     * constructor por defecto
     */
    public Resultado() {
        this.participantes = new ArrayList<AutoPiloto>();
        this.vueltas = new ArrayList<String>();
    }

    /*
    Actualiza los datos de cada piloto participante.
     */
    public void actualizarDatosPilotos() {
        participantes.getFirst().getPiloto().sumarVictoria();

        participantes.get(0).getPiloto().sumarPodio();
        participantes.get(1).getPiloto().sumarPodio();
        participantes.get(2).getPiloto().sumarPodio();

        String vueltaMin = "99:99:99";
        String vueltaPar;
        AutoPiloto ap = new AutoPiloto();
        for (int i = 0; i < 10; i++) {
            vueltaPar = vueltas.get(i);
            if (vueltaMin.compareTo(vueltaPar) > 0) {
                vueltaMin = vueltas.get(i);
                ap = participantes.get(i);
            }

            participantes.get(i).getPiloto().sumarCompetencia();
        }

        ap.getPiloto().sumarVueltasRapidas();
    }

    //METODOS DE LISTAS.
    /*
    agrega un participante a la lista.
     * @param ap
     * @throws DatoInvalidoException si el valor es nulo.
     */
    public void agregarParticipante(AutoPiloto ap) throws DatoInvalidoException {
        if (ap == null) {
            throw new DatoInvalidoException("Se necesita el participante.");
        }
        participantes.add(ap);
    }

    /*
    agrega una vuelta rapida a la lista.
     * @param vuelta
     * @throws DatoInvalidoException si el valor es nulo.
     */
    public void agregarVuelta(String vuelta) throws DatoInvalidoException {
        if (vuelta == null) {
            throw new DatoInvalidoException("Se necesita la vuelta.");
        }
        vueltas.add(vuelta);
    }

    /*
    borra un participante de la lista.
     * @param index
     */
    public void borrarParticipante(int index) {
        participantes.remove(index);
    }

    /*
    borra una vuelta de la lista.
     * @param index
     */
    public void borrarVuelta(int index) {
        vueltas.remove(index);
    }

    /**
     * GETTERS & SETTERS.
     */
    /*
    @return una lista de AutoPilotos.
     */
    public ArrayList<AutoPiloto> getParticipantes() {
        return participantes;
    }

    /*
    @param participantes
    ingresa una lista de AutoPiloto.
     */
    public void setParticipantes(ArrayList<AutoPiloto> participantes) throws DatoInvalidoException {
        if (participantes == null) {
            throw new DatoInvalidoException("Se necesitan los participantes.");
        }
        this.participantes = participantes;
    }

    /*
    @return una lista de string para las vueltas.
     */
    public ArrayList<String> getVueltas() {
        return vueltas;
    }

    /*
    @param vueltas
    ingresa una lista de String para las vueltas.
     */
    public void setVueltas(ArrayList<String> vueltas) throws DatoInvalidoException {
        if (vueltas == null) {
            throw new DatoInvalidoException("Se necesitan las  vueltas.");
        }
        this.vueltas = vueltas;
    }

    /*
    @return una carrera.
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /*
    * @param carrera
    * ingresa una carrera
     */
    public void setCarrera(Carrera carrera) throws DatoInvalidoException {
        if (carrera == null) {
            throw new DatoInvalidoException("Se necesita una carrera.");
        }
        this.carrera = carrera;
    }
}
