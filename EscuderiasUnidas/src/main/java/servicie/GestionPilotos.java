/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicie;
import java.util.*;
import logica.*;
/**
 *
 * @author Gaston PC
 */
public class GestionPilotos {
    private ArrayList<Piloto> pilotos = new ArrayList<>();
    
    
    public void registrarPilotos (Piloto p){
        pilotos.add(p);
    }
    
    public ArrayList<Piloto> getPilotos(){
        return pilotos;
    }
    
    public Piloto buscarPorNombre(String nombre){
        for(Piloto i : pilotos){
            if(i.getNombre().equalsIgnoreCase(nombre)){
                return i;
            }      
        }
        return null;
    }
    
    public void asignarPiloto(Piloto p, AutoPiloto ap){
        p.agregarAuto(ap);
    }
    
    public void asignarEscuderia(Piloto p, PilotoEscuderia pe){
        p.agregarEscuderia(pe);
    }
}
