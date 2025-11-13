package logica;
import exceptions.*;
public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private Pais pais;

    // CONSTRUCTORES.
    public Persona() {
        dni = "";
        nombre = "";
        apellido = "";
        pais = null;
    }

    public Persona(String dni, String nombre, String apellido, Pais pais) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    // GETTERS & SETTERS.
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DatoInvalidoException, FormatoIncorrectoException{
       if(dni == null || dni.trim().isEmpty()){
            throw new DatoInvalidoException("El dni no puede estar vacío.");
       } else if (dni.matches("\\d{8}")) {
                throw new FormatoIncorrectoException();
            }
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)  throws DatoInvalidoException{
       if(nombre== null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("El nombre no puede estar vacío.");
       }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws DatoInvalidoException{
       if(apellido== null || apellido.trim().isEmpty()){
            throw new DatoInvalidoException("El apellido no puede estar vacío.");
       }
        this.apellido = apellido;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) throws DatoInvalidoException{
       if( pais== null){
            throw new DatoInvalidoException("El  pais no puede estar vacío.");
       }
        this.pais = pais;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais + "]";
    }
}
