/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gaston PC
 */
public class Pais {
    private int idPais;
    private String descripcion;
    
// constructor parametrizado    
    public Pais (int idPais, String descripcion){
        this.idPais = idPais;
        this.descripcion = descripcion;
    }
    
//metodos sett
    public void setIdPais(int idPais){
        this.idPais = idPais;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    
// metodos gett    
    public int getIdPais(){
        return idPais;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    @Override 
    public String toString(){
        return idPais + descripcion;
    }
    
    
    }

