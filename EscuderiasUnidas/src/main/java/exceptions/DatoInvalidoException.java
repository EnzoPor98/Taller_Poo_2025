/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 * Representa una exception. 
 */
public class DatoInvalidoException extends Exception {

    private String mensaje;

    public DatoInvalidoException(String msj) {
        this.mensaje = msj;
    }

    public String getMensaje() {
        return mensaje;
    }
}
