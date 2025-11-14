/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.*;
import exceptions.*;
/**
 * Representa una carrera dentro del campeonato. 
 * Almacena circuito, país, fecha, hora, cantidad de vueltas, AutoPiloto, Resultado 
 * y la lista de autos/pilotos participantes.
 */
public class Carrera {
    private String fechaRealizacion;
    private String horaRealizacion;
    private int numeroVueltas;
    private Circuito circuito;
    private Pais pais;
    private ArrayList<AutoPiloto> autoPiloto;
    private Resultado resultado;
    
    /** constructor por defecto    */ 
     public Carrera (){
        this.fechaRealizacion = "x";
        this.horaRealizacion = "x";
        this.numeroVueltas= 0;
        this.circuito = new Circuito();
        this.pais = new Pais();
        this.resultado = new Resultado();
        autoPiloto = new ArrayList<>();
    }
    

     /**
     * Constructor parametrizado.
     *
     * @param fechaRealizacion Fecha de la carrera (formato yyyy/MM/dd).
     * @param horaRealizacion Hora de la carrera (formato HH:mm).
     * @param numeroVueltas Cantidad de vueltas de la carrera.
     * @param circuito Circuito donde se realiza la carrera.
     * @param pais País donde se realiza la carrera.
     */
    public Carrera (String fechaRealizacion, String horaRealizacion , int numeroVueltas, Circuito circuito, Pais pais ){
        this.fechaRealizacion = fechaRealizacion;
        this.horaRealizacion = horaRealizacion;
        this.numeroVueltas= numeroVueltas;
        this.circuito = circuito;
        this.pais = pais;
        autoPiloto = new ArrayList<>();
    }

    /**
     * Agrega un participante (AutoPiloto) a la carrera.
     * Valida que no exista otro AutoPiloto con el mismo auto.
     *
     * @param a Participante AutoPiloto a agregar.
     */
  public void agregarAutoPilotoParticipante(AutoPiloto a){
     try{
         if(a == null){
             throw new DatoInvalidoException("El participante no puede ser nulo.");
         }
          for (AutoPiloto ap : autoPiloto) {
            if (ap.getAuto().getModelo().equalsIgnoreCase(a.getAuto().getModelo())) {
                throw new DatoInvalidoException("Ese auto ya está asignado en esta carrera.");
            }
        }
         autoPiloto.add(a);
      a.agregarCarrera(this);
     } catch(DatoInvalidoException ex) {
        System.out.println(ex.getMessage());
     }
  }  
   

  /**
     * Establece el circuito donde se realiza la carrera.
     *
     * @param circuito Circuito a asignar.
     * @throws DatoInvalidoException Si el circuito es nulo.
     */
    public void setCircuito(Circuito circuito) throws DatoInvalidoException{
       if(circuito == null ){
            throw new DatoInvalidoException("Se necesita un circuito para la carrera.");
       }
        this.circuito = circuito;
    }
    /**
     * Establece el país donde se realiza la carrera.
     *
     * @param pais País a asignar.
     * @throws DatoInvalidoException Si el país es nulo.
     */
    public void setPais(Pais pais)throws DatoInvalidoException{
       if(pais == null ){
            throw new DatoInvalidoException("Se necesita un pais para la carrera.");
       }
        this.pais = pais;
    }
    /**
     * Establece la fecha de realización.
     *
     * @param fechaRealizacion Fecha (formato yyyy/MM/dd).
     * @throws DatoInvalidoException Si está vacía.
     * @throws FormatoIncorrectoException Si no respeta el formato.
     */
    public void setFechaRealizacion(String fechaRealizacion)throws DatoInvalidoException, FormatoIncorrectoException{
       if(fechaRealizacion== null || fechaRealizacion.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita un fecha para la carrera");
       } else if(!fechaRealizacion.matches("\\d{4}/\\d{2}/\\d{2}")){
           throw new FormatoIncorrectoException();
       }
        this.fechaRealizacion = fechaRealizacion;
    }
    /**
     * Establece la hora de realización.
     *
     * @param horaRealizacion Hora (formato HH:mm).
     * @throws DatoInvalidoException Si está vacía.
     * @throws FormatoIncorrectoException Si no respeta el formato.
     */
    public void sethoraRealizacion(String horaRealizacion)throws DatoInvalidoException, FormatoIncorrectoException{
       if( horaRealizacion== null ||  horaRealizacion.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una hora para la carrera");
       } else if(!horaRealizacion.matches("\\d{2}:\\d{2}")){
           throw new FormatoIncorrectoException();
       }
        this.horaRealizacion = horaRealizacion;
    }
    /**
     * Establece la cantidad de vueltas.
     *
     * @param numeroVueltas Cantidad de vueltas.
     * @throws DatoInvalidoException Si el número es negativo.
     */
     public void setNumeroVueltas(int numeroVueltas)throws DatoInvalidoException{
       if( numeroVueltas < 0){
            throw new DatoInvalidoException("La carrena no puede tener vueltas negativas");
       }
        this.numeroVueltas = numeroVueltas;
    }
    

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

      /**
     * Retorna la lista de participantes formateada en un String.
     *
     * @return Lista de participantes o mensaje "No hay participantes".
     */
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

    /**
     * Establece el resultado de la carrera.
     *
     * @param resultado Resultado a asignar.
     * @throws DatoInvalidoException Si el resultado es nulo.
     */
    public void setResultado(Resultado resultado)throws DatoInvalidoException{
       if( resultado== null ){
            throw new DatoInvalidoException("El resultado no puede estar vacio.");
       }
        this.resultado = resultado;
    }
    
}
