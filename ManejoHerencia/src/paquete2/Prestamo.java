/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamoMeses;
    protected String ciudad;

    public Prestamo(Persona b, int tiempo, String c) {
        beneficiario = b;
        tiempoPrestamoMeses = tiempo;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerTiempoPrestamoMeses(int tiempo) {
        tiempoPrestamoMeses = tiempo;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamoMeses() {
        return tiempoPrestamoMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario \n"
                + "%s\n"
                + "Tiempo de préstamo en meses: %d\n"
                + "Ciudad del préstamo: %s",
                obtenerBeneficiario(),
                obtenerTiempoPrestamoMeses(),
                obtenerCiudad());
        return cadena;
    }
}
