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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.print("Ingrese la nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese la nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese la nota: ");
        nota3 = entrada.nextDouble();
        System.out.print("Ingrese la nota: ");
        nota4 = entrada.nextDouble();

        String cadena = notaCualitativa(nota1, nota2, nota3, nota4);
        String cualitativaMayuscula = mayuscula(cadena);

        System.out.printf("El estudiante con las notas: %.2f;   %.2f;   %.2f;   %.2f "
                + "tiene un promedio cualitativo: %s\n",
                nota1,
                nota2,
                nota3,
                nota4,
                cualitativaMayuscula);

    }

    public static String notaCualitativa(double x, double y, double z, double w) {
        double promedio;
        promedio = (w + y + z + w) / 4;
        String cualitativaa = "";
        if (promedio >= 0 && promedio <= 5) {
            cualitativaa = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cualitativaa = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    cualitativaa = "Muy bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        cualitativaa = "Sobresaliente";
                    }
                }

            }
        }
        return cualitativaa;
    }
    
    public static String mayuscula (String x) {
        String may = x.toUpperCase();
        
        return may;
    }
}
