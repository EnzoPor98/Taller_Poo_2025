/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import exceptions.*;
/**
 * Representa los Resultados dentro del campeonato. 
 * Almacena carrera
 * y la lista de participantes, vueltas.
 */
public class Resultado {

    private Carrera carrera;
    private ArrayList<AutoPiloto> participantes;
    private ArrayList<String> vueltas;

    /** constructor por defecto  * @param * @throws *return  */ 
    public Resultado() {
        this.participantes = new ArrayList<AutoPiloto>();
        this.vueltas = new ArrayList<String>();
    }

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

    /** METODOS DE LISTAS.* @param * @throws *return */
    public void agregarParticipante(AutoPiloto ap) throws DatoInvalidoException{
       if(  ap == null ){
            throw new DatoInvalidoException("Se necesita el participante.");
       }
        participantes.add(ap);
    }

    public void agregarVuelta(String vuelta)  throws DatoInvalidoException{
       if(  vuelta == null ){
            throw new DatoInvalidoException("Se necesita la vuelta.");
       }
        vueltas.add(vuelta);
    }

    public void borrarParticipante(int index) {
        participantes.remove(index);
    }

    public void borrarVuelta(int index) {
        vueltas.remove(index);
    }

    /** GETTERS & SETTERS.* @param * @throws *return  */
    public ArrayList<AutoPiloto> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<AutoPiloto> participantes)  throws DatoInvalidoException{
       if(  participantes == null ){
            throw new DatoInvalidoException("Se necesitan los participantes.");
       }
        this.participantes = participantes;
    }

    public ArrayList<String> getVueltas() {
        return vueltas;
    }

    public void setVueltas(ArrayList<String> vueltas) throws DatoInvalidoException{
       if(  vueltas == null ){
            throw new DatoInvalidoException("Se necesitan las  vueltas.");
       }
        this.vueltas = vueltas;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera)throws DatoInvalidoException{
       if( carrera== null ){
            throw new DatoInvalidoException("Se necesita una carrera.");
       }
        this.carrera = carrera;
    }
}
