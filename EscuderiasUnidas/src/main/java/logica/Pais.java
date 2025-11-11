/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
/**
 *
 * @author Gaston PC
 */
public class Pais {
    private int idPais;
    private String nombre;
    private String descripcion;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Carrera> carreras;
    private ArrayList<Persona> personas;

    public Pais (){
        this.idPais = 0;
        this.nombre = "x";
        this.descripcion = "X";
        circuitos = new ArrayList<>();
        escuderias = new ArrayList<>();
        carreras= new ArrayList<>();
        personas= new ArrayList<>();
    }
    
    
    
    
// constructor parametrizado    
    public Pais (int idPais, String nombre, String descripcion){
        this.idPais = idPais;
        this.nombre = nombre;
        this.descripcion = descripcion;
        circuitos = new ArrayList<>();
        escuderias = new ArrayList<>();
        carreras= new ArrayList<>();
        personas= new ArrayList<>();
    }
    
//metodo agregar
public void agregarPersonas(Persona a){
    personas.add(a);
}       
public void agregarCarrera(Carrera a){
    carreras.add(a);
}      
public void agregarCircuito(Circuito a){
    circuitos.add(a);
}    
public void agregarEscuderia(Escuderia a){
    escuderias.add(a);
}  
//metodos sett
    public void setIdPais(int idPais){
        this.idPais = idPais;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
// metodos gett    
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

    public void setCircuitos(ArrayList<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public ArrayList<Escuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(ArrayList<Escuderia> escuderias) {
        this.escuderias = escuderias;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
    }

