/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
import exceptions.*;
/**
 *
 * @author Gaston PC
 */
public class Carrera {
    private String fechaRealizacion;
    private String horaRealizacion;
    private int numeroVueltas;
    private Circuito circuito;
    private Pais pais;
    private ArrayList<AutoPiloto> autoPiloto;
    private Resultado resultado;
    
     public Carrera (){
        this.fechaRealizacion = "x";
        this.horaRealizacion = "x";
        this.numeroVueltas= 0;
        this.circuito = new Circuito();
        this.pais = new Pais();
        this.resultado = new Resultado();
        autoPiloto = new ArrayList<>();
    }
    
// constructor parametrizado    
    public Carrera (String fechaRealizacion, String horaRealizacion , int numeroVueltas, Circuito circuito, Pais pais ){
        this.fechaRealizacion = fechaRealizacion;
        this.horaRealizacion = horaRealizacion;
        this.numeroVueltas= numeroVueltas;
        this.circuito = circuito;
        this.pais = pais;
        autoPiloto = new ArrayList<>();
    }
 //metodos agregar
  public void agregarAutoPilotoParticipante(AutoPiloto a){
     try{
         autoPiloto.add(a);
      a.agregarCarrera(this);
     } catch(DatoInvalidoException ex) {
        System.out.println(ex.getMessage());
     }
  }  
   
//metodos sett
    public void setCircuito(Circuito circuito) throws DatoInvalidoException{
       if(circuito == null ){
            throw new DatoInvalidoException("Se necesita un circuito para la carrera.");
       }
        this.circuito = circuito;
    }
    public void setPais(Pais pais)throws DatoInvalidoException{
       if(pais == null ){
            throw new DatoInvalidoException("Se necesita un pais para la carrera.");
       }
        this.pais = pais;
    }
    
    public void setFechaRealizacion(String fechaRealizacion)throws DatoInvalidoException, FormatoIncorrectoException{
       if(fechaRealizacion== null || fechaRealizacion.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita un fecha para la carrera");
       } else if(!fechaRealizacion.matches("\\d{4}/\\d{2}/\\d{2}")){
           throw new FormatoIncorrectoException();
       }
        this.fechaRealizacion = fechaRealizacion;
    }
    public void sethoraRealizacion(String horaRealizacion)throws DatoInvalidoException, FormatoIncorrectoException{
       if( horaRealizacion== null ||  horaRealizacion.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una hora para la carrera");
       } else if(!horaRealizacion.matches("\\d{2}:\\d{2}")){
           throw new FormatoIncorrectoException();
       }
        this.horaRealizacion = horaRealizacion;
    }
     public void setNumeroVueltas(int numeroVueltas)throws DatoInvalidoException{
       if( numeroVueltas < 0){
            throw new DatoInvalidoException("La carrena no puede tener vueltas negativas");
       }
        this.numeroVueltas = numeroVueltas;
    }
    
    
// metodos gett    
     public Circuito getCircuito(){
         return circuito;
     }
     public Pais getPais(){
         return pais;
     }
    public int getNumeroVueltas(){
        return numeroVueltas;
    }
    public String getHoraRealizacion(){
        return horaRealizacion;
    }
     public String getFechaRealizacion(){
        return fechaRealizacion;
    }
     
     public ArrayList<AutoPiloto> getAutoPiloto(){
         return autoPiloto;
     } 

     public String mostrarParticipantes() {
    if (autoPiloto.isEmpty()) {
        return "No hay participantes";
    }

    String lista = "\n";
    
    int i = 1;
    for (AutoPiloto ap : autoPiloto) {
        lista = lista 
                      + i 
                      + ". " 
                      + ap.getPiloto().getNombreCompleto()
                      + " - Auto: " 
                      + ap.getAuto().getModelo() 
                      + "\n";
        i++;
    }
    return lista;
}
     
    @Override 
    public String toString(){
        return fechaRealizacion + horaRealizacion + numeroVueltas;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado)throws DatoInvalidoException{
       if( resultado== null ){
            throw new DatoInvalidoException("El resultado no puede estar vacio.");
       }
        this.resultado = resultado;
    }
    
}
