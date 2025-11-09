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
    private ArrayList<PilotoEscuderia> pilotosEscuderia;
    private ArrayList<Auto> autos;
    private ArrayList<Mecanico> mecanicos;
    private Pais pais;
    
    public Escuderia (){
        this.nombre = "x";
        pilotosEscuderia = new ArrayList<>();
        autos = new ArrayList<>();
        mecanicos = new ArrayList<>();
        this.pais = null;
    }
    
    
    
    
// constructor parametrizado
    public Escuderia (String nombre, Pais pais){
        this.nombre = nombre;
        pilotosEscuderia = new ArrayList<>();
        autos = new ArrayList<>();
        mecanicos = new ArrayList<>();
        this.pais = pais;
    }
    
    //metodos agregar 
    public void agregarAuto(Auto a){
        autos.add(a);
    }
    public void borrarAuto(Auto a) {
        autos.remove(a);
    }
    public void agregarMecanico(Mecanico a){
        mecanicos.add(a);
    }
    public void borrarMecanico(Mecanico m) {
        mecanicos.remove(m);
    }
    public void agregarPilotoEscuderia(PilotoEscuderia pe) {
        pilotosEscuderia.add(pe);
    }
    public void borrarPilotoEscuderia(PilotoEscuderia pe) {
        pilotosEscuderia.remove(pe);
    }
    public ArrayList<Auto> getAutos() {
        return autos;
    }
    
    
    
//metodos sett
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPais(Pais pais){
        this.pais = pais;
    }
    
    
// metodos gett    
    public String getNombre(){
        return nombre;
    }
    public ArrayList<PilotoEscuderia> getPilotoEscuderia() {
        return pilotosEscuderia;
    }
    
    public Pais getPais(){
        return pais; 
    }
    
    public ArrayList<Mecanico> getMecanicos(){
        return mecanicos;
    }
    
    
    @Override 
    public String toString(){
        return nombre ;
    }
}
