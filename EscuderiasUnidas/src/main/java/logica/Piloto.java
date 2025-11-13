package logica;

import java.util.ArrayList;

public class Piloto extends Persona implements Comparable<Piloto> {

    private int numeroCompetencia;
    private int victorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;
    private int puntaje;
    private ArrayList<PilotoEscuderia> escuderias;
    private ArrayList<AutoPiloto> autos;

    // CONSTRUCTORES.
    public Piloto() {
        super();
        numeroCompetencia = 0;
        victorias = 0;
        polePosition = 0;
        vueltasRapidas = 0;
        podios = 0;
        puntaje = 0;
        escuderias = new ArrayList<PilotoEscuderia>();
        autos = new ArrayList<AutoPiloto>();
    }

    public Piloto(String dni, String nombre, String apellido, Pais pais, int numeroCompetencia, int victorias,
            int polePosition, int vueltasRapidas, int podios, int puntaje) {
        super(dni, nombre, apellido, pais);
        this.numeroCompetencia = numeroCompetencia;
        this.victorias = victorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
        this.puntaje = puntaje;
        escuderias = new ArrayList<PilotoEscuderia>();
        autos = new ArrayList<AutoPiloto>();
    }

    @Override
    public int compareTo(Piloto o) {
        return o.getPuntaje() - puntaje;
    }

    // METODOS PARA CONTADORES.
    public void sumarCompetencia() {
        numeroCompetencia++;
    }

    public void sumarVictoria() {
        victorias++;
    }

    public void sumarVueltasRapidas() {
        vueltasRapidas++;
    }

    public void sumarPodio() {
        podios++;
    }

    public void sumarPuntos(int valor) {
        puntaje += valor;
    }

    // LISTA DE ESCUDERIAS.
    public void agregarEscuderia(PilotoEscuderia pe) {
        escuderias.add(pe);
    }

    public void borrarEscuderia(PilotoEscuderia pe) {
        escuderias.remove(pe);
    }

    // LISTA DE AUTOS.
    public void agregarAuto(AutoPiloto ap) {
        autos.add(ap);
    }

    public void borrarAuto(AutoPiloto ap) {
        autos.remove(ap);
    }

    // GETTERS & SETTERS.
    public int getNumeroCompetencia() {
        return numeroCompetencia;
    }

    public void setNumeroCompetencia(int numeroCompetencia) {
        this.numeroCompetencia = numeroCompetencia;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(int polePosition) {
        this.polePosition = polePosition;
    }

    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    public void setVueltasRapidas(int vueltasRapidas) {
        this.vueltasRapidas = vueltasRapidas;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) {
        this.podios = podios;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public ArrayList<PilotoEscuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(ArrayList<PilotoEscuderia> escuderias) {
        this.escuderias = escuderias;
    }

    public ArrayList<AutoPiloto> getAutoPiloto() {
        return autos;
    }

    public void setAutos(ArrayList<AutoPiloto> autos) {
        this.autos = autos;
    }
}
