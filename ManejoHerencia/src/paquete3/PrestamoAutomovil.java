/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;
    
    public PrestamoAutomovil(Persona b, int t, String c, String tA, String mA,
            Persona g, double vA){        
        super(b, t, c.toLowerCase());
        tipoAutomovil = tA;
        marcaAutomovil = mA;
        garante1 = g;
        valorAutomovil = vA;
    }    
    
    public void establecerTipoAutomovil(String t){
        tipoAutomovil = t;
    }
    
    public void establecerMarcaAutomovil(String m){
        marcaAutomovil = m;
    }
    
    public void establecerGarante1(Persona g){
        garante1 = g;
    }
    
    public void establecerValorAutomovil(double vA){
        valorAutomovil = vA;
    }
    
    public void establecerValorMensualPagoPrestamo(){
        valorMensual = valorAutomovil / tiempoPrestamoMeses; 
        // tiempoPrestamoMeses se puede usar ya que se heredó de la super clase
    }
    
    public String obtenerTipoAutomovil(){
        return tipoAutomovil;
    }
    
    public String obtenerMarcaAutomovil(){
        return marcaAutomovil;
    }
    
    public Persona obtenerGarante1(){
        return garante1;
    }
    
    public double obtenerValorAutomovil(){
        return valorAutomovil;
    }
    
    public double obtenerValorMensualPagoPrestamo(){
        return valorMensual;
    }
        
    public String toString(){
        String cadena = String.format("%s",super.toString());
        cadena = String.format("%s\nTipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Valor de automóvil: %.2f\n"
                + "- Garante \n%s\n"
                + "Valor mesual de pago préstamo automóvil: %.2f",
                cadena,
                tipoAutomovil,
                marcaAutomovil,
                valorAutomovil,
                garante1,                
                valorMensual);
        return cadena;
    }
}
