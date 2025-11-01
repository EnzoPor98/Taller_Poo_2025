package clases;
import java.util.*;

public class Piloto extends Persona {
    private int numeroCompetencia;
    private int victorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;
    private Escuderia escuderiaActual;
    private ArrayList<Escuderia> Historialescuderias;
    private ArrayList<Auto> autos;

    // CONSTRUCTORES.
    public Piloto() {
        super();
        numeroCompetencia = 0;
        victorias = 0;
        polePosition = 0;
        vueltasRapidas = 0;
        podios = 0;

    }

    public Piloto(String dni, String nombre, String apellido,
            int numeroCompetencia, int victorias, int polePosition,
            int vueltasRapidas, int podios,Escuderia escuderiaActual, Pais pais) {
        super(dni, nombre, apellido, pais);
        this.numeroCompetencia = numeroCompetencia;
        this.victorias = victorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
        escuderiaActual = escuderiaActual;
        Historialescuderias = new ArrayList<>();
        autos = new ArrayList<>();
    }

    // GETTERS & SETTERS.
    public void agregarAutos(Auto a){
        autos.add(a);
    }

    public void setEscuderiaActual(Escuderia escuderiaActual ){
        escuderiaActual = escuderiaActual ;
    }
    public void agregarEscuderiaActual(Escuderia a){
        Historialescuderias.add(a);
    }
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
}
