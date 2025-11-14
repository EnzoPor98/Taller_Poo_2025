/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
import exceptions.*;
/**
 * Representa una Escuderia dentro del campeonato. 
 * Almacena nombre , pais
 * y la lista de pilotosEscuderia,autos,mecanicos.
 */
public class Escuderia {
    private String nombre;
    private ArrayList<PilotoEscuderia> pilotosEscuderia;
    private ArrayList<Auto> autos;
    private ArrayList<Mecanico> mecanicos;
    private Pais pais;
    
    
 
    /**
     * Constructor por defecto.
     * Inicializa los valores base y las listas vacías.
     */
    public Escuderia (){
        this.nombre = "x";
        pilotosEscuderia = new ArrayList<>();
        autos = new ArrayList<>();
        mecanicos = new ArrayList<>();
        this.pais = null;
    }


    /**
     * Constructor parametrizado.
     *
     * @param nombre Nombre de la escudería.
     * @param pais País de origen de la escudería.
     */
    public Escuderia (String nombre, Pais pais){
        this.nombre = nombre;
        pilotosEscuderia = new ArrayList<>();
        autos = new ArrayList<>();
        mecanicos = new ArrayList<>();
        this.pais = pais;
    }
    
    /**
     * Agrega un auto a la escudería.
     *
     * @param a Auto a agregar.
     * @throws DatoInvalidoException Si el auto es nulo.
     */
    public void agregarAuto(Auto a)throws DatoInvalidoException{
       if(a== null ){
            throw new DatoInvalidoException("Se necesita un auto.");
       }
        autos.add(a);
    }
    /**
     * Elimina un auto de la escudería.
     *
     * @param a Auto a eliminar.
     */
    public void borrarAuto(Auto a) {
        autos.remove(a);
    }
    /**
     * Agrega un mecánico a la escudería.
     *
     * @param m Mecánico a agregar.
     * @throws DatoInvalidoException Si el mecánico es nulo.
     */
    public void agregarMecanico(Mecanico a)throws DatoInvalidoException{
       if(a== null ){
            throw new DatoInvalidoException("Se necesita un mecanico.");
       }
        mecanicos.add(a);
    }
    
    /**
     * Elimina un mecánico de la escudería.
     *
     * @param m Mecánico a eliminar.
     */
    public void borrarMecanico(Mecanico m) {
        mecanicos.remove(m);
    }
    /**
     * Agrega una asignación piloto–escudería.
     *
     * @param pe PilotoEscuderia a agregar.
     * @throws DatoInvalidoException Si el objeto es nulo.
     */
    public void agregarPilotoEscuderia(PilotoEscuderia pe) throws DatoInvalidoException{
       if(pe == null ){
            throw new DatoInvalidoException("Se necesita un piloto.");
       }
        pilotosEscuderia.add(pe);
    }
    /**
     * Elimina una asignación piloto–escudería.
     *
     * @param pe PilotoEscuderia a eliminar.
     */
    public void borrarPilotoEscuderia(PilotoEscuderia pe) {
        pilotosEscuderia.remove(pe);
    }
    /** @return Lista de autos de la escudería. */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

 
    /**
     * Establece el nombre de la escudería.
     *
     * @param nombre Nombre a asignar.
     * @throws DatoInvalidoException Si es nulo o vacío.
     */
    public void setNombre(String nombre)throws DatoInvalidoException{
       if(nombre== null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita un nombre.");
       }
        this.nombre = nombre;
    }
    
    /**
     * Establece el país de la escudería.
     *
     * @param pais País a asignar.
     * @throws DatoInvalidoException Si es nulo.
     */
    public void setPais(Pais pais)throws DatoInvalidoException{
       if(pais== null ){
            throw new DatoInvalidoException("Se necesita un pais.");
       }
        this.pais = pais;
    }
    
    
/** @return Nombre de la escudería. */
    public String getNombre(){
        return nombre;
    }
    /** @return Lista de pilotos asignados a la escudería. */
    public ArrayList<PilotoEscuderia> getPilotoEscuderia() {
        return pilotosEscuderia;
    }
    
    /** @return País de origen de la escudería. */
    public Pais getPais(){
        return pais; 
    }
    
    /** @return Lista de mecánicos de la escudería. */
    public ArrayList<Mecanico> getMecanicos(){
        return mecanicos;
    }
    
    
    @Override 
    public String toString(){
        return nombre ;
    }
}
