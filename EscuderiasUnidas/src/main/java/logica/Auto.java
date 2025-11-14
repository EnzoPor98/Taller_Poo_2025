/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
import exceptions.*;
/**
 * Representa un Auto dentro del campeonato. 
 * Almacena modelo, motor, escuderia
 * y la lista de pilotos participantes.
 */
public class Auto {
    
    private String modelo;
    private String motor;
    private Escuderia escuderia;
    private  ArrayList<AutoPiloto> pilotos;
    
     /** constructor por defecto * @param * @throws *return */ 
    public Auto() {
        modelo = "x";
        motor = "x";
        escuderia = new Escuderia();
        pilotos = new ArrayList<AutoPiloto>();

    }
    
    
/** constructor parametrizado  * @param * @throws *return  */ 
    public Auto (String modelo, String motor , Escuderia escuderia){
        this.modelo = modelo;
        this.motor = motor;
        this.escuderia = escuderia;
        pilotos = new ArrayList<>();
    }
    
/**metodos agregar  * @param * @throws *return  */
    public void agregarAutoPiloto(AutoPiloto a)throws DatoInvalidoException{
        if(a == null){
        throw new DatoInvalidoException("El auto debe tener un piloto.");  
        }
        pilotos.add(a);
    }
    
    public void borrarPiloto(AutoPiloto ap){
        pilotos.remove(ap);
    }

    /**metodos sett * @param * @throws *return */
    public void setModelo(String modelo)throws DatoInvalidoException{
       if(modelo == null || modelo.trim().isEmpty()){
            throw new DatoInvalidoException("El modelo del auto no puede estar vacío.");
       }
        this.modelo = modelo;
    }
    public void setMotor(String motor)throws DatoInvalidoException{
       if(motor == null || motor.trim().isEmpty()){
            throw new DatoInvalidoException("El motor del auto no puede estar vacío.");
       }
    this.motor = motor;
}
    public void setEscuderia(Escuderia escuderia)throws DatoInvalidoException{
       if(escuderia == null){
            throw new DatoInvalidoException("El auto debe pertenecer a una escuderia.");
       }
        this.escuderia = escuderia;
    }
    
    
/**metodos gett  * @param * @throws *return */  
    public String getModelo(){
        return modelo;
    }
    public ArrayList<AutoPiloto> getAutoPiloto(){
        return pilotos;
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
