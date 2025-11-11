/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Gaston PC
 */
public class Resultado {

    private Carrera carrera;
    private ArrayList<AutoPiloto> participantes;
    private ArrayList<String> vueltas;

    public Resultado() {
        this.participantes = new ArrayList<AutoPiloto>();
        this.vueltas = new ArrayList<String>();
    }

    // METODOS DE LISTAS.
    public void agregarParticipante(AutoPiloto ap) {
        participantes.add(ap);
    }

    public void agregarVuelta(String vuelta) {
        vueltas.add(vuelta);
    }

    public void borrarParticipante(int index) {
        participantes.remove(index);
    }

    public void borrarVuelta(int index) {
        vueltas.remove(index);
    }

    // GETTERS & SETTERS.
    public ArrayList<AutoPiloto> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<AutoPiloto> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<String> getVueltas() {
        return vueltas;
    }

    public void setVueltas(ArrayList<String> vueltas) {
        this.vueltas = vueltas;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
