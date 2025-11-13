package logica;

import java.util.ArrayList;
import exceptions.*;

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
            int añosExperiencia) {
        super(dni, nombre, apellido, pais);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        escuderias = new ArrayList<Escuderia>();
    }

    // LISTA DE ESCUDERIAS.
    public void agregarEscuderia(Escuderia e) throws DatoInvalidoException{
       if(e == null ){
            throw new DatoInvalidoException("Se necesita una escuderia.");
       }
        escuderias.add(e);
    }

    public void borrarEscuderia(Escuderia e) {
        escuderias.remove(e);
    }

    // GETTERS & SETTERS.
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad)  throws DatoInvalidoException{
       if(especialidad == null ){
            throw new DatoInvalidoException("Se necesita una especialidad.");
       }
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia)  throws DatoInvalidoException{
       if(añosExperiencia < 0 ){
            throw new DatoInvalidoException("Los años de experiencia no pueden ser negativos.");
       }
        this.añosExperiencia = añosExperiencia;
    }

    public ArrayList<Escuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(ArrayList<Escuderia> escuderias)throws DatoInvalidoException{
       if(escuderias == null ){
            throw new DatoInvalidoException("Se necesita una escuderia.");
       }
        this.escuderias = escuderias;
    }
}
