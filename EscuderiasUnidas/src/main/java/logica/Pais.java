/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
import exceptions.*;
/**
 * Representa un Pais dentro del campeonato. 
 * Almacena idpais, nombre, descripcion
 * y la lista de circuitos, escuderias, carreras, personas
 */
public class Pais {
    private int idPais;
    private String nombre;
    private String descripcion;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Carrera> carreras;
    private ArrayList<Persona> personas;

    /** constructor por defecto * @param * @throws *return  */ 
    public Pais (){
        this.idPais = 0;
        this.nombre = "x";
        this.descripcion = "X";
        circuitos = new ArrayList<>();
        escuderias = new ArrayList<>();
        carreras= new ArrayList<>();
        personas= new ArrayList<>();
    }
    
    
    
    
/** constructor parametrizado * @param * @throws *return   */ 
    public Pais (int idPais, String nombre, String descripcion){
        this.idPais = idPais;
        this.nombre = nombre;
        this.descripcion = descripcion;
        circuitos = new ArrayList<>();
        escuderias = new ArrayList<>();
        carreras= new ArrayList<>();
        personas= new ArrayList<>();
    }
    
/**metodos agregar * @param * @throws *return */
public void agregarPersonas(Persona a) throws DatoInvalidoException{
       if(a == null ){
            throw new DatoInvalidoException("Se necesitan personas.");
       }
    personas.add(a);
}       
public void agregarCarrera(Carrera a) throws DatoInvalidoException{
       if(a == null ){
            throw new DatoInvalidoException("Se necesita una carrera.");
       }
    carreras.add(a);
}      
public void agregarCircuito(Circuito a) throws DatoInvalidoException{
       if(a == null ){
            throw new DatoInvalidoException("Se necesita un circuito.");
       }
    circuitos.add(a);
}    
public void agregarEscuderia(Escuderia a) throws DatoInvalidoException{
       if(a == null ){
            throw new DatoInvalidoException("Se necesita una escuderia.");
       }
    escuderias.add(a);
}  
/**metodos sett  * @param * @throws *return */
    public void setIdPais(int idPais) throws DatoInvalidoException{
       if(idPais < 0 ){
            throw new DatoInvalidoException("Se necesita un id del pais.");
       }
        this.idPais = idPais;
    }
    public void setDescripcion(String descripcion)throws DatoInvalidoException{
       if(descripcion == null || descripcion.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una descripcion.");
       }
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre)throws DatoInvalidoException{
       if(nombre == null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita un nombre.");
       }
        this.nombre = nombre;
    }
    
    
/**metodos gett * @param * @throws *return  */ 
    public int getIdPais(){
        return idPais;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getNombre(){
        return nombre;
    }
    
    @Override 
    public String toString(){
        return idPais + descripcion;
    }

    public ArrayList<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(ArrayList<Circuito> circuitos) throws DatoInvalidoException{
       if(circuitos == null){
            throw new DatoInvalidoException("Se necesitan al menos un circuito.");
       }
        this.circuitos = circuitos;
    }

    public ArrayList<Escuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(ArrayList<Escuderia> escuderias) throws DatoInvalidoException{
       if(escuderias== null){
            throw new DatoInvalidoException("Se necesitan al menos una escuderia.");
       }
        this.escuderias = escuderias;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) throws DatoInvalidoException{
       if( carreras== null){
            throw new DatoInvalidoException("Se necesitan al menos una carrera.");
       }
        this.carreras = carreras;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) throws DatoInvalidoException{
       if( personas == null){
            throw new DatoInvalidoException("Se necesitan al menos una persona.");
       }
        this.personas = personas;
    }
    
    
    }

