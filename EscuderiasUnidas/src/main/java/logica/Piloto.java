package logica;
import exceptions.*;
import java.util.ArrayList;

public class Piloto extends Persona {

    private int numeroCompetencia;
    private int victorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;
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
        escuderias = new ArrayList<PilotoEscuderia>();
        autos = new ArrayList<AutoPiloto>();
    }

    public Piloto(String dni, String nombre, String apellido, Pais pais, int numeroCompetencia, int victorias,
            int polePosition, int vueltasRapidas, int podios) {
        super(dni, nombre, apellido, pais);
        this.numeroCompetencia = numeroCompetencia;
        this.victorias = victorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
        escuderias = new ArrayList<PilotoEscuderia>();
        autos = new ArrayList<AutoPiloto>();
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

    public void setNumeroCompetencia(int numeroCompetencia) throws DatoInvalidoException{
       if(numeroCompetencia< 0 ){
            throw new DatoInvalidoException("El numero de Competencia no puede ser menor a 0.");
       }
        this.numeroCompetencia = numeroCompetencia;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) throws DatoInvalidoException{
       if(victorias< 0 ){
            throw new DatoInvalidoException("El numero de victorias no puede ser menor a 0.");
       }
        this.victorias = victorias;
    }

    public int getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(int polePosition)  throws DatoInvalidoException{
       if(polePosition< 0 ){
            throw new DatoInvalidoException("El numero de polePosition no puede ser menor a 0.");
       }
        this.polePosition = polePosition;
    }

    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    public void setVueltasRapidas(int vueltasRapidas)  throws DatoInvalidoException{
       if(vueltasRapidas< 0 ){
            throw new DatoInvalidoException("El numero de vueltas Rapidas no puede ser menor a 0.");
       }
        this.vueltasRapidas = vueltasRapidas;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) throws DatoInvalidoException{
       if(podios <= 0 ){
            throw new DatoInvalidoException("El numero de podios no puede ser menor a 0.");
       }
        this.podios = podios;
    }

    public ArrayList<PilotoEscuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(ArrayList<PilotoEscuderia> escuderias) throws DatoInvalidoException{
       if(escuderias == null ){
            throw new DatoInvalidoException("Se necesita una escuderia.");
       }
        this.escuderias = escuderias;
    }

    public ArrayList<AutoPiloto> getAutoPiloto() {
        return autos;
    }

    public void setAutos(ArrayList<AutoPiloto> autos) throws DatoInvalidoException{
       if(autos == null ){
            throw new DatoInvalidoException("Se necesita una auto.");
       }
        this.autos = autos;
    }
}
