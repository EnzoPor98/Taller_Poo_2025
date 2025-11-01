/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.*;
/**
 *
 * @author Gaston PC
 */
public class Pais {
    private int idPais;
    private String descripcion;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Carrera> carreras;
    private ArrayList<Persona> personas;

// constructor parametrizado    
    public Pais (int idPais, String descripcion){
        this.idPais = idPais;
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
    
    
// metodos gett    
    public int getIdPais(){
        return idPais;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    @Override 
    public String toString(){
        return idPais + descripcion;
    }
    
    
    }

