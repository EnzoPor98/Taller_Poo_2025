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

    public void actualizarDatosPilotos() {
        // SUMAMOS VICTORIA.
        participantes.getFirst().getPiloto().sumarVictoria();

        // SUMAMOS PODIOS.
        participantes.get(0).getPiloto().sumarPodio();
        participantes.get(1).getPiloto().sumarPodio();
        participantes.get(2).getPiloto().sumarPodio();

        // BUSCAMOS LA VUELTA MAS RAPIDA.
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
        // SUMAMOS LA VUELTA RAPIDA.
        ap.getPiloto().sumarVueltasRapidas();

        // SUMAMOS LOS PUNTOS CORRESPONDIENTES A CADA POSICION.
        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0 ->
                    participantes.get(i).getPiloto().sumarPuntos(25);
                case 1 ->
                    participantes.get(i).getPiloto().sumarPuntos(18);
                case 2 ->
                    participantes.get(i).getPiloto().sumarPuntos(15);
                case 3 ->
                    participantes.get(i).getPiloto().sumarPuntos(12);
                case 4 ->
                    participantes.get(i).getPiloto().sumarPuntos(10);
                case 5 ->
                    participantes.get(i).getPiloto().sumarPuntos(8);
                case 6 ->
                    participantes.get(i).getPiloto().sumarPuntos(6);
                case 7 ->
                    participantes.get(i).getPiloto().sumarPuntos(4);
                case 8 ->
                    participantes.get(i).getPiloto().sumarPuntos(2);
                case 9 ->
                    participantes.get(i).getPiloto().sumarPuntos(1);
            }
        }
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
