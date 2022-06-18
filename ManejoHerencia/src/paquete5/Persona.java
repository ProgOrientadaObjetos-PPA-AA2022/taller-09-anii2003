/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author DELL
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona(String n, String ap, String u){
        nombre = n;
        apellido = ap;
        username = u;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String ap) {
        apellido = ap;
    }

    public void establecerUsername(String user) {
        username = user;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }
    
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s",
                nombre,
                apellido,
                username);
        return cadena;
    }
}
