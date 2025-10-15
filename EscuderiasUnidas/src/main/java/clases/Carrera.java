/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gaston PC
 */
public class Carrera {
    private String fechaRealizacion;
    private String horaRealizacion;
    private int numeroVueltas;
    
// constructor parametrizado    
    public Carrera (String fechaRealizacion, String horaRealizacion , int numeroVueltas){
        this.fechaRealizacion = fechaRealizacion;
        this.horaRealizacion = horaRealizacion;
        this.numeroVueltas= numeroVueltas;
    }
    
//metodos sett
    public void setFechaRealizacion(String fechaRealizacion){
        this.fechaRealizacion = fechaRealizacion;
    }
    public void sethoraRealizacion(String horaRealizacion){
        this.horaRealizacion = horaRealizacion;
    }
     public void setNumeroVueltas(int numeroVueltas){
        this.numeroVueltas = numeroVueltas;
    }
    
    
// metodos gett    
    public int getNumeroVueltas(){
        return numeroVueltas;
    }
    public String getHoraRealizacion(){
        return horaRealizacion;
    }
     public String getFechaRealizacion(){
        return fechaRealizacion;
    }
    
    @Override 
    public String toString(){
        return fechaRealizacion + horaRealizacion + numeroVueltas;
    }
    
}
