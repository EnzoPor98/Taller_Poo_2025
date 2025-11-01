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
public class Auto {
    
    private String modelo;
    private String motor;
    private Escuderia escuderia;
    private  ArrayList<Piloto> pilotos;
    
// constructor parametrizado    
    public Auto (String modelo, String motor , Escuderia escuderia){
        this.modelo = modelo;
        this.motor = motor;
        this.escuderia = escuderia;
        pilotos = new ArrayList<>();
    }
    
//metodos agregar
    public void agregarPilotos(Piloto a){
        pilotos.add(a);
    }

    //metodos sett
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    public void setEscuderia(Escuderia escuderia){
        this.escuderia = escuderia;
    }
    
    
// metodos gett    
    public String getModelo(){
        return modelo;
    }
    public String getMotor(){
        return motor;
    }
    public Escuderia getEscuderia(){
        return escuderia;
    }
    
    @Override 
    public String toString(){
        return modelo + motor + escuderia;
    }
    
}
