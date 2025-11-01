/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gaston PC
 */
public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;
    private Piloto piloto;
    private Escuderia escuderia;
    
    public PilotoEscuderia(String desdeFecha, String hastaFecha,Piloto piloto , Escuderia escuderia){
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public void setDesdeFecha(String desdeFecha) {
        this.desdeFecha = desdeFecha;
    }

    public void setHastaFecha(String hastaFecha) {
        this.hastaFecha = hastaFecha;
    }

    public String getDesdeFecha() {
        return desdeFecha;
    }

    public String getHastaFecha() {
        return hastaFecha;
    }
    
    
    
}
