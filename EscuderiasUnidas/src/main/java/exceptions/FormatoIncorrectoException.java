/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 * Representa una exception. 
 */
public class FormatoIncorrectoException extends Exception {

    private String mensaje;

    public FormatoIncorrectoException() {
        this.mensaje = "El formato ingresado es incorrecto.";
    }

    public String getMensaje() {
        return mensaje;
    }
}

