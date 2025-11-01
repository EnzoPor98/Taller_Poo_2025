package clases;
import java.util.*;
public class Mecanico extends Persona {
    private Especialidad especialidad;
    private int añosExperiencia;
    private ArrayList<Escuderia > escuderia;

    // CONSTRUCTORES.
    public Mecanico() {
        super();
        especialidad = null;
        añosExperiencia = 0;
    }

    public Mecanico(String dni, String nombre, String apellido,
            Especialidad especialidad, int añosExperiencia, Pais pais) {
        super(dni, nombre, apellido, pais);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        escuderia = new ArrayList<>();
    }

    // GETTERS & SETTERS.
    public void agregarEscuderia(Escuderia a){
        escuderia.add(a);
    }

    
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
