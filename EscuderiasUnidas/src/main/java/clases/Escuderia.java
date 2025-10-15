/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gaston PC
 */
public class Escuderia {
    private String nombre;
    
// constructor parametrizado
    public Escuderia (String nombre){
        this.nombre = nombre;
    }
    
//metodos sett
    public void setNomber(String nombre){
        this.nombre = nombre;
    }
    
    
// metodos gett    
    public String getNombre(){
        return nombre;
    }
    
    @Override 
    public String toString(){
        return nombre;
    }
}
