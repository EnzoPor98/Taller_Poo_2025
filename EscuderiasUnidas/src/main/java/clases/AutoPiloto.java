package clases;

import java.util.ArrayList;

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

    public AutoPiloto(String fechaAsignacion, Auto auto, Piloto piloto, ArrayList<Carrera> carreras) {
        this.fechaAsignacion = fechaAsignacion;
        this.auto = auto;
        this.piloto = piloto;
        this.carreras = carreras;
    }

    // LISTA CARRERAS.
    public void agregarCarrera(Carrera c) {
        carreras.add(c);
    }

    public void borrarCarrera(Carrera c) {
        carreras.remove(c);
    }

    // GETTERS & SETTERS.
    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
