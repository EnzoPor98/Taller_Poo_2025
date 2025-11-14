/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
import exceptions.*;
/**
 * Representa un Circuito dentro del campeonato. 
 * Almacena nombre, longitud, pais
 * y la lista de carreras.
 */
public class Circuito {
    private String nombre;
    private int longitud;
    private ArrayList<Carrera> carreras;
    private Pais pais;
    
    /** constructor por defecto    */ 
    public Circuito ( ){
        this.nombre = "x";
        this.longitud = 0;
        carreras = new ArrayList<>();
        this.pais = null;
    }
    
    

    /**
     * Constructor parametrizado.
     *
     * @param nombre Nombre del circuito.
     * @param longitud Longitud del trazado en metros.
     * @param pais País donde se encuentra el circuito.
     */
    public Circuito ( String nombre , int longitud, Pais pais){
        this.nombre = nombre;
        this.longitud = longitud;
        carreras = new ArrayList<>();
        this.pais = pais;
    }
    
 /**
     * Agrega una carrera realizada en este circuito.
     *
     * @param a Carrera a agregar.
     */
    public void agregarCarrera(Carrera a){
        carreras.add(a);
    }

    /**
     * Establece el nombre del circuito.
     *
     * @param nombre Nombre a asignar.
     * @throws DatoInvalidoException Si el nombre es nulo o vacío.
     */
    public void setNombre(String nombre)throws DatoInvalidoException{
       if(nombre== null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita un nombre.");
       }
        this.nombre = nombre;
    }
    /**
     * Establece la longitud del circuito.
     *
     * @param longitud Longitud en metros.
     * @throws DatoInvalidoException Si la longitud es negativa.
     */
    public void setLongitud(int longitud)throws DatoInvalidoException{
       if(longitud < 0 ){
            throw new DatoInvalidoException("La longitud no puede ser negativa.");
       }
        this.longitud = longitud;
    }
    
    /**
     * Establece el país donde se encuentra el circuito.
     *
     * @param pais País a asignar.
     * @throws DatoInvalidoException Si el país es nulo.
     */
    public void setPais(Pais pais)throws DatoInvalidoException{
       if(pais== null ){
            throw new DatoInvalidoException("Se necesita un pais para circuito.");
       }
        this.pais = pais;
    }

    /** @return País donde se ubica el circuito. */
    public Pais getPais(){
        return pais;
    }
    /** @return Nombre del circuito. */
    public String getNombre(){
        return nombre;
    }
    /** @return Longitud del circuito en metros. */
    public int getLongitud(){
        return longitud;
    }
    
    @Override 
    public String toString(){
        return nombre + longitud;
    }

     /**
     * Retorna todas las carreras disputadas en este circuito.
     *
     * @return Lista de carreras.
     */
    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    /**
     * Establece la lista de carreras del circuito.
     *
     * @param carreras Lista de carreras.
     * @throws DatoInvalidoException Si la lista es nula.
     */
    public void setCarreras(ArrayList<Carrera> carreras) throws DatoInvalidoException{
       if(carreras== null ){
            throw new DatoInvalidoException("Se necesitan  carrera para el circuito.");
       }
        this.carreras = carreras;
    }
    
}
