package logica;
import exceptions.*;

public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;
    private Piloto piloto;
    private Escuderia escuderia;

    // CONSTRUCTORES.
    public PilotoEscuderia() {
        desdeFecha = "";
        hastaFecha = "";
        piloto = null;
        escuderia = null;
    }

    public PilotoEscuderia(String desdeFecha, String hastaFecha, Piloto piloto, Escuderia escuderia) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    // GETTERS & SETTERS.
    public String getDesdeFecha() {
        return desdeFecha;
    }

    public void setDesdeFecha(String desdeFecha) throws DatoInvalidoException{
       if(desdeFecha== null || desdeFecha.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una fecha de inicio.");
       }
        this.desdeFecha = desdeFecha;
    }

    public String getHastaFecha() {
        return hastaFecha;
    }

    public void setHastaFecha(String hastaFecha)throws DatoInvalidoException{
       if( hastaFecha== null ||  hastaFecha.trim().isEmpty()){
            throw new DatoInvalidoException("Se necesita una fecha final.");
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
