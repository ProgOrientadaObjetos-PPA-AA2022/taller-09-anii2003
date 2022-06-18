/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPrestamoCarrera;

    public PrestamoEducativo(Persona p, int t, String c, String n,
            InstitucionEducativa centro, double vCarrera) {
        super(p, t, c.toUpperCase());
        nivelEstudio = n;
        centroEducativo = centro;
        valorCarrera = vCarrera;
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa centro) {
        centroEducativo = centro;
    }

    public void establecerValorCarrera(double vC) {
        valorCarrera = vC;
    }

    public void establecerValorMensualPrestamoCarrera() {
        valorMensualPrestamoCarrera = (valorCarrera / tiempoPrestamoMeses)
                - ((valorCarrera / tiempoPrestamoMeses) * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualPrestamoCarrera() {
        return valorMensualPrestamoCarrera;
    }
    
    public String toString(){
        String cadena = String.format("%s\n",super.toString());
        cadena = String.format("%sNivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del pago del préstamo del valor de carrera: "
                + "%.2f\n",
                cadena,
                nivelEstudio,
                centroEducativo,
                valorCarrera,
                valorMensualPrestamoCarrera);
        return cadena;
    }

}
    