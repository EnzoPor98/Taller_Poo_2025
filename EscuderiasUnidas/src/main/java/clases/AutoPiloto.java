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
public class AutoPiloto {
    private String fechaAsignacion;
    private Piloto piloto;
    private Auto auto;
    private ArrayList<Carrera> carrera;
    
    
    public AutoPiloto(String fechaAsignacion, Piloto piloto, Auto auto){
        this.fechaAsignacion = fechaAsignacion ;
        this.piloto = piloto;
        this.auto = auto;
        carrera = new  ArrayList<>();
    
    }

    //metodo agregar
    public void agregarCarrera(Carrera a){
        carrera.add(a);
    }
    
    public Piloto getPiloto() {
        return piloto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }
    
}
