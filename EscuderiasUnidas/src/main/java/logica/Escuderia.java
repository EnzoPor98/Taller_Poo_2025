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
public class Escuderia {
    private String nombre;
    private ArrayList<Piloto> pilotos;
    private ArrayList<Auto> autos;
    private ArrayList<Mecanico> mecanicos;
    private Pais pais;
    
// constructor parametrizado
    public Escuderia (String nombre, Pais pais){
        this.nombre = nombre;
        pilotos = new ArrayList<>();
        autos = new ArrayList<>();
        mecanicos = new ArrayList<>();
        this.pais = pais;
    }
    
    //metodos agregar 
    public void agregarPiloto(Piloto a){
        pilotos.add(a);
    }
    public void agregarAuto(Auto a){
        autos.add(a);
    }
    public void agregarMecanico(Mecanico a){
        mecanicos.add(a);
    }
    
    
    
//metodos sett
    public void setNomber(String nombre){
        this.nombre = nombre;
    }
    
    private void setPais(Pais pais){
        this.pais = pais;
    }
    
    
// metodos gett    
    public String getNombre(){
        return nombre;
    }
    
    public Pais getPais(){
        return pais; 
    }
    
    
    
    @Override 
    public String toString(){
        return nombre ;
    }
}
