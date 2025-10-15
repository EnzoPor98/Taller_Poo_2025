/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gaston PC
 */
public class Auto {
    
    private String modelo;
    private String motor;
    
// constructor parametrizado    
    public Auto (String modelo, String motor){
        this.modelo = modelo;
        this.motor = motor;
    }
    
//metodos sett
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    
    
// metodos gett    
    public String getModelo(){
        return modelo;
    }
    public String getMotor(){
        return motor;
    }
    
    @Override 
    public String toString(){
        return modelo + motor;
    }
    
}
