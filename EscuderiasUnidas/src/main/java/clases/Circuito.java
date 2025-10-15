/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gaston PC
 */
public class Circuito {
    private String nombre;
    private int longitud;
    
// constructor parametrizado    
    public Circuito ( String nombre , int longitud){
        this.nombre = nombre;
        this.longitud = longitud;
    }
    
//metodos sett
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    
// metodos gett    
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
