package clases;

public class Mecanico extends Persona {
    private Especialidad especialidad;
    private int añosExperiencia;

    // CONSTRUCTORES.
    public Mecanico() {
        super();
        especialidad = null;
        añosExperiencia = 0;
    }

    public Mecanico(String dni, String nombre, String apellido,
            Especialidad especialidad, int añosExperiencia) {
        super(dni, nombre, apellido);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    // GETTERS & SETTERS.
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

}
