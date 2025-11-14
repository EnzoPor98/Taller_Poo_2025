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
    
    /** constructor por defecto * @param * @throws *return   */ 
    public Circuito ( ){
        this.nombre = "x";
        this.longitud = 0;
        carreras = new ArrayList<>();
        this.pais = null;
    }
    
    
/** constructor parametrizado   * @param * @throws *return */ 
    public Circuito ( String nombre , int longitud, Pais pais){
        this.nombre = nombre;
        this.longitud = longitud;
        carreras = new ArrayList<>();
        this.pais = pais;
    }
    
 /**metodos agregar * @param * @throws *return */
    public void agregarCarrera(Carrera a){
        carreras.add(a);
    }
/** metodos sett  * @param * @throws *return  */ 
    public void setNombre(String nombre)throws DatoInvalidoException{
       if(nombre== null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita un nombre.");
       }
        this.nombre = nombre;
    }
    public void setLongitud(int longitud)throws DatoInvalidoException{
       if(longitud < 0 ){
            throw new DatoInvalidoException("La longitud no puede ser negativa.");
       }
        this.longitud = longitud;
    }
    
    public void setPais(Pais pais)throws DatoInvalidoException{
       if(pais== null ){
            throw new DatoInvalidoException("Se necesita un pais para circuito.");
       }
        this.pais = pais;
    }
    
    
/** metodos gett  * @param * @throws *return */  
    public Pais getPais(){
        return pais;
    }
    public String getNombre(){
        return nombre;
    }
    public int getLongitud(){
        return longitud;
    }
    
    @Override 
    public String toString(){
        return nombre + longitud;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) throws DatoInvalidoException{
       if(carreras== null ){
            throw new DatoInvalidoException("Se necesitan  carrera para el circuito.");
       }
        this.carreras = carreras;
    }
    
}
