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
public class Circuito {
    private String nombre;
    private int longitud;
    private ArrayList<Carrera> carreras;
    private Pais pais;
    
// constructor parametrizado    
    public Circuito ( String nombre , int longitud, Pais pais){
        this.nombre = nombre;
        this.longitud = longitud;
        carreras = new ArrayList<>();
        this.pais = pais;
    }
    
 //agregar Carrera
    public void agregarCarrera(Carrera a){
        carreras.add(a);
    }
//metodos sett
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
    
    
// metodos gett    
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
    
}
