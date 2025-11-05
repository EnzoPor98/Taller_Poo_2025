/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Gaston PC
 */
public class Resultados {
    private Piloto piloto;
    private int posicion;
    private double tiempoVueltaRapida;
    
    public Resultados (){
        this.piloto = null;
        this.posicion = 0;
        this. tiempoVueltaRapida =  0.0;
    }

    public Resultados (Piloto piloto, int posicion ,double tiempoVueltaRapida){
        this.piloto = piloto;
        this.posicion = posicion;
        this.posicion= posicion;
        this. tiempoVueltaRapida =  tiempoVueltaRapida;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setTiempoVueltaRapida(double tiempoVueltaRapida) {
        this.tiempoVueltaRapida = tiempoVueltaRapida;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public int getPosicion() {
        return posicion;
    }

    public double getTiempoVueltaRapida() {
        return tiempoVueltaRapida;
    }

    @Override
    public String toString() {
        return "Resultados{" + "piloto=" + piloto + ", posicion=" + posicion + ", tiempoVueltaRapida=" + tiempoVueltaRapida + '}';
    }
    
    












}
