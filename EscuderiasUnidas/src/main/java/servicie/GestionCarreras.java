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
public class GestionCarreras {
    private ArrayList<Carrera> carreras = new ArrayList<>();

    public void registarCarrera(Carrera c){
        carreras.add(c);
    }
    
    public ArrayList<Carrera> getCarreras(){
        return carreras;
    }
    
    public ArrayList<Carrera> listarPorCircuito(Circuito c){
        ArrayList<Carrera> resultado = new ArrayList<>();
            for(Carrera i : carreras){
                if(i.getCircuito().equals(c)){
                    resultado.add(i);
                }
            }
        return resultado;
    }
    
    public ArrayList<Carrera> listarPorPais(Pais p){
        ArrayList<Carrera> resultado = new ArrayList<>();
            for(Carrera i : carreras){
                if(i.getCircuito().getPais().equals(p)){
                    resultado.add(i);
                }
            }
        return resultado;
    }
    
    public void registrarParticipante (Carrera c, AutoPiloto ap){
        c.agregarAutoPilotoParticipante(ap);
    }
    
    


}
