package clases;

public class AutoPiloto {
    private String fechaAsignacion;
    private Auto auto;
    private Piloto piloto;

    // CONSTRUCTORES.
    public AutoPiloto() {
        fechaAsignacion = "";
        auto = null;
        piloto = null;
    }

    public AutoPiloto(String fechaAsignacion, Auto auto, Piloto piloto) {
        this.fechaAsignacion = fechaAsignacion;
        this.auto = auto;
        this.piloto = piloto;
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
