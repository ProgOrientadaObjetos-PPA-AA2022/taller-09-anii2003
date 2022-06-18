/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author DELL
 */
public class Ejecutor1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipoPrestamo, meses;
        String nombre, apellido, username, nombreG, apellidoG, usernameG,
                nivelE, nombreCentroE, siglas, tipoAuto, marcaAuto,
                ciudad, cadenaAuto, cadenaEd;
        int continuar;
        double valorAuto, valorCarrera;

        int n1 = 0, n2 = 0;

        cadenaAuto = "";
        cadenaEd = "";

        do {
            System.out.println("Tipo de Préstamo a ingresar.\n"
                    + "1) Préstamo de Automóvil\n"
                    + "2) Préstamo Educativo");
            tipoPrestamo = entrada.nextInt();

            if (tipoPrestamo == 1 || tipoPrestamo == 2) {

                // Datos del acreedor del préstamo
                System.out.print("Ingrese el nombre del acreedor de "
                        + "préstamo: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.print("Ingrese el apellido del acreedor de "
                        + "préstamo: ");
                apellido = entrada.nextLine();
                System.out.print("Ingrese el username del acreedor de "
                        + "préstamo: ");
                username = entrada.nextLine();

                Persona persona = new Persona(nombre, apellido, username);

                System.out.print("Ingrese el tiempo de préstamo en meses: ");
                meses = entrada.nextInt();
                System.out.print("Ingrese la ciudad: ");
                entrada.nextLine();
                ciudad = entrada.nextLine();

                if (tipoPrestamo == 1) {

                    System.out.print("Ingrese el tipo de automóvil: ");
                    tipoAuto = entrada.nextLine();
                    System.out.print("Ingrese la marca del automóvil: ");
                    marcaAuto = entrada.nextLine();
                    System.out.print("Ingrese el valor del automóvil: ");
                    valorAuto = entrada.nextDouble();
                    System.out.println("--DATOS DEL GARANTE--");
                    System.out.print("Ingrese el nombre garante: ");
                    nombreG = entrada.nextLine();
                    entrada.nextLine();
                    System.out.print("Ingrese el apellido del garante: ");
                    apellidoG = entrada.nextLine();
                    System.out.print("Ingrese el username del garante: ");
                    usernameG = entrada.nextLine();

                    Persona garante = new Persona(nombreG, apellidoG, usernameG);

                    PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(
                            persona, meses, ciudad, tipoAuto, marcaAuto, garante,
                            valorAuto);

                    prestamoAutomovil.establecerValorMensualPagoPrestamo();

                    n1 = n1 + 1;

                    cadenaAuto = String.format("%s\n%d) %s\n", cadenaAuto,
                            n1, prestamoAutomovil);
                }

                if (tipoPrestamo == 2) {
                    System.out.print("Ingrese el nivel de estudio: ");
                    nivelE = entrada.nextLine();
                    System.out.println("--DATOS DEL CENTRO EDUCATIVO--");
                    System.out.print("Ingrese el nombre del centro "
                            + "educativo: ");
                    nombreCentroE = entrada.nextLine();
                    System.out.print("Ingrese las siglas del centro "
                            + "educativo: ");
                    siglas = entrada.nextLine();

                    InstitucionEducativa instE = new InstitucionEducativa(
                            nombreCentroE, siglas);

                    System.out.print("Ingrese el valor de la carrera: ");
                    valorCarrera = entrada.nextDouble();

                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(
                            persona, meses, ciudad, nivelE, instE, valorCarrera);

                    prestamoEducativo.establecerValorMensualPrestamoCarrera();

                    n2 = n2 + 1;

                    cadenaEd = String.format("%s\n%d) %s\n", cadenaEd, n2,
                            prestamoEducativo);
                }

            } else {
                System.out.println("Opción inválida");
            }

            System.out.println("Desea ingresar más préstamos. Digite"
                    + " 1 para continuar o digite 0 para salir");
            continuar = entrada.nextInt();
            entrada.nextLine();

        } while (continuar == 1);

        System.out.println("\n***LISTADO DE PRÉSTAMOS***\n");
        if (n1 > 0) {
            System.out.println("- PRÉSTAMOS DE AUTOMÓVILES:");
            System.out.println(cadenaAuto);
        } else {
            if (n1 == 0) {
                System.out.println("- PRÉSTAMOS DE AUTOMÓVILES:");
                System.out.println("No existen préstamos de automóviles");
            }
        }

        if (n2 > 0) {
            System.out.println("- PRÉSTAMOS EDUCATIVOS:");
            System.out.println(cadenaEd);
        } else {
            if (n2 == 0) {
                System.out.println("- PRÉSTAMOS EDUCATIVOS:");
                System.out.println("No existen préstamos educativos");
            }
        }
    }
}
