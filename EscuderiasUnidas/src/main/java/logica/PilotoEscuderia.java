package logica;
import exceptions.*;
/**
 * Representa un PilotoEscuderia.
 * Almacena desdeFecha, hastaFecha
 * y la lista de escuderia.
 */

public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;
    private Piloto piloto;
    private Escuderia escuderia;

    /** constructor por defecto   */ 
    public PilotoEscuderia() {
        desdeFecha = "";
        hastaFecha = "";
        piloto = null;
        escuderia = null;
    }

    /** constructor parametrizado   */ 
    public PilotoEscuderia(String desdeFecha, String hastaFecha, Piloto piloto, Escuderia escuderia) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    /** GETTERS & SETTERS. */
    public String getDesdeFecha() {
        return desdeFecha;
    }

    public void setDesdeFecha(String desdeFecha) throws DatoInvalidoException, FormatoIncorrectoException{
       if(desdeFecha== null || desdeFecha.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una fecha de inicio.");
       } else if (!desdeFecha.matches("\\d{4}/\\d{2}/\\d{2}")) {
                throw new FormatoIncorrectoException();
            }
        this.desdeFecha = desdeFecha;
    }

    public String getHastaFecha() {
        return hastaFecha;
    }

    public void setHastaFecha(String hastaFecha)throws DatoInvalidoException, FormatoIncorrectoException{
       if( hastaFecha== null ||  hastaFecha.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una fecha final.");
       } else if (!hastaFecha.matches("\\d{4}/\\d{2}/\\d{2}")) {
                throw new FormatoIncorrectoException();
            }
        this.hastaFecha = hastaFecha;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto)throws DatoInvalidoException{
       if(  piloto== null ){
            throw new DatoInvalidoException("Se necesita un piloto.");
       }
        this.piloto = piloto;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia)throws DatoInvalidoException{
       if( escuderia== null ){
            throw new DatoInvalidoException("Se necesita una escuderia.");
       }
        this.escuderia = escuderia;
    }
}
