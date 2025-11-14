package logica;

import java.util.ArrayList;
import exceptions.*;

/**
 * Representa un AutoPiloto . 
 * Almacena fechaAsignacion, auto,piloto
 * y la lista de carreras.
 */
public class AutoPiloto {

    private String fechaAsignacion;
    private Auto auto;
    private Piloto piloto;
    private ArrayList<Carrera> carreras;

    /** constructor por defecto   */ 
    public AutoPiloto() {
        fechaAsignacion = "";
        auto = null;
        piloto = null;
        carreras = new ArrayList<Carrera>();
    }
    /**
     * Constructor parametrizado.
     * @param fechaAsignacion Fecha en la que se asigna el auto al piloto.
     * @param auto Auto asignado.
     * @param piloto Piloto asignado.
     */ 
    public AutoPiloto(String fechaAsignacion, Auto auto, Piloto piloto) {
        this.fechaAsignacion = fechaAsignacion;
        this.auto = auto;
        this.piloto = piloto;
        this.carreras = new ArrayList<Carrera>();
    }

    /**
     * Agrega una carrera en la que este piloto compite con este auto.
     * @param c Carrera que se va a agregar.
     * @throws DatoInvalidoException Si la carrera es nula.
     */
    public void agregarCarrera(Carrera c) throws DatoInvalidoException {
         if(c == null){
        throw new DatoInvalidoException("El debe haber un piloto y un auto para la carrera.");  
        }
        carreras.add(c);
    }

    /**
     * Elimina una carrera asociada.
     * @param c Carrera a eliminar.
     */
    public void borrarCarrera(Carrera c) {
        carreras.remove(c);
    }


    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    /**
     * Establece la fecha de asignación del auto al piloto.
     * @param fechaAsignacion Fecha con formato yyyy/MM/dd.
     * @throws DatoInvalidoException Si la fecha está vacía.
     * @throws FormatoIncorrectoException Si el formato no es válido.
     */
    public void setFechaAsignacion(String fechaAsignacion) throws DatoInvalidoException, FormatoIncorrectoException{
       if(fechaAsignacion == null || fechaAsignacion.trim().isEmpty()){
            throw new DatoInvalidoException("La fecha no puede estar vacia.");
       } else if(!fechaAsignacion.matches("\\d{4}/\\d{2}/\\d{2}")){
           throw new FormatoIncorrectoException();
       }
        this.fechaAsignacion = fechaAsignacion;
    }

    public Auto getAuto() {
        return auto;
    }

    /**
     * Asigna un auto.
     * @param auto Auto a asignar.
     * @throws DatoInvalidoException Si el auto es nulo.
     */
    public void setAuto(Auto auto) throws DatoInvalidoException{
       if(auto == null){
            throw new DatoInvalidoException("Se necesita un auto.");
       }
        this.auto = auto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * Asigna un piloto.
     * @param piloto Piloto a asignar.
     * @throws DatoInvalidoException Si el piloto es nulo.
     */
    public void setPiloto(Piloto piloto) throws DatoInvalidoException{
       if(piloto == null){
            throw new DatoInvalidoException("Se necesita un piloto.");
       }
        this.piloto = piloto;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    /**
     * Establece la lista de carreras asociadas.
     * @param carreras Lista de carreras.
     * @throws DatoInvalidoException Si la lista es nula.
     */
    public void setCarreras(ArrayList<Carrera> carreras) throws DatoInvalidoException{
       if(carreras == null){
            throw new DatoInvalidoException("Se necesita una carrera.");
       }
        this.carreras = carreras;
    }
}
