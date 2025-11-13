package logica;

import java.util.ArrayList;
import exceptions.*;
public class AutoPiloto {

    private String fechaAsignacion;
    private Auto auto;
    private Piloto piloto;
    private ArrayList<Carrera> carreras;

    // CONSTRUCTORES.
    public AutoPiloto() {
        fechaAsignacion = "";
        auto = null;
        piloto = null;
        carreras = new ArrayList<Carrera>();
    }

    public AutoPiloto(String fechaAsignacion, Auto auto, Piloto piloto) {
        this.fechaAsignacion = fechaAsignacion;
        this.auto = auto;
        this.piloto = piloto;
        this.carreras = new ArrayList<Carrera>();
    }

    // LISTA DE CARRERAS.
    public void agregarCarrera(Carrera c) throws DatoInvalidoException {
         if(c == null){
        throw new DatoInvalidoException("El debe haber un piloto y un auto para la carrera.");  
        }
        carreras.add(c);
    }

    public void borrarCarrera(Carrera c) {
        carreras.remove(c);
    }

    // GETTERS & SETTERS.
    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

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

    public void setAuto(Auto auto) throws DatoInvalidoException{
       if(auto == null){
            throw new DatoInvalidoException("Se necesita un auto.");
       }
        this.auto = auto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) throws DatoInvalidoException{
       if(piloto == null){
            throw new DatoInvalidoException("Se necesita un piloto.");
       }
        this.piloto = piloto;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) throws DatoInvalidoException{
       if(carreras == null){
            throw new DatoInvalidoException("Se necesita una carrera.");
       }
        this.carreras = carreras;
    }
}
