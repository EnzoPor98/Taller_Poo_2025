package clases;

import java.util.ArrayList;

public class Mecanico extends Persona {
    private Especialidad especialidad;
    private int añosExperiencia;
    private ArrayList<Escuderia> escuderias;

    // CONSTRUCTORES.
    public Mecanico() {
        super();
        especialidad = null;
        añosExperiencia = 0;
        escuderias = new ArrayList<Escuderia>();
    }

    public Mecanico(String dni, String nombre, String apellido, Pais pais, Especialidad especialidad,
            int añosExperiencia, ArrayList<Escuderia> escuderias) {
        super(dni, nombre, apellido, pais);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.escuderias = escuderias;
    }

    public void agregarEscuderia(Escuderia e) {
        escuderias.add(e);
    }

    public void borrarEscuderia(Escuderia e) {
        escuderias.remove(e);
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
