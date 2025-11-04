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
public class GestionEscuderias {
    private ArrayList<Escuderia> escuderias = new ArrayList<>();
    
    public void registrarEscuderia(Escuderia a){
        escuderias.add(a);
    }
    
    public ArrayList<Escuderia> getEscuderias(){
        return escuderias;
    }
    
    public Escuderia buscarPorNombre(String nombre){
        for(Escuderia a : escuderias){
            if(a.getNombre().equalsIgnoreCase(nombre)){
                return a;
            }
        }
        return null;
    }
    
    
    public ArrayList<Escuderia> listaPorPais (Pais p){
        ArrayList<Escuderia> resultado = new ArrayList<>(); 
        for(Escuderia a : escuderias){
            if(a.getPais().equals(p)){
                resultado.add(a);
            }
        }
        return resultado;
    }
}
