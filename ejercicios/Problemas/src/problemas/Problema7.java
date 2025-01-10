/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = ingresarCiudad();
        numciudades(ciudades);
    }

    public static String[] ingresarCiudad() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de ciudades:");
        int numCiudades = leer.nextInt();
        leer.nextLine();
        String[] ciudades = new String[numCiudades];

        for (int i = 0; i < numCiudades; i++) {
            System.out.print("Ingrese la ciudad:" + (i + 1) + " ");
            ciudades[i] = leer.nextLine();
        }

        return ciudades;

    }

    public static void numciudades(String[] x) {
        System.out.println("\nCiudades con 4 o 5 caracteres");
        for (int i = 0; i < x.length; i++) {
            String ciudad = x[i];
            if (ciudad.length() == 4 || ciudad.length() == 5) {
                System.out.println(ciudad);
            }
        }

    }
}
