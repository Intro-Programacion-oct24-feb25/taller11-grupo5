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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int datos;
        System.out.print("Ingrese 1 si desea calcular el area de un cuadrado\n"
                + "Ingrese 2 si desea calcular el area de un triangulo\n"
                + "Ingrese 3 si desea calcular el area de un rectangulo´: \n");
        
        datos = entrada.nextInt();
        
        if (datos == 1) {
            areaCuadrado();
        } else {
            if (datos== 2) {
                areaTriangulo();
            } else {
                if (datos == 3){
                    areaRectangulo();
                }
            }
        }
    }
    
    public static void areaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese la medida del lado: \n");
        numero = entrada.nextInt();
        int formula = numero * numero;
        
        System.out.printf("El area del cuadrado es: %d\n", formula);
    }
    public static void areaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int altura;
        int base;
        System.out.print("Ingrese la medida de la altura: ");
        altura = entrada.nextInt();
        System.out.print("Ingrese la medida de la base: ");
        base = entrada.nextInt();
        int formula = (altura * base)/2;
        
        System.out.printf("El area del cuadrado es: %d\n", formula);
    }
    public static void areaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int altura;
        int base;
        System.out.print("Ingrese la medida de la altura: ");
        altura = entrada.nextInt();
        System.out.print("Ingrese la medida de la base: ");
        base = entrada.nextInt();
        int formula = altura * base;
        
        System.out.printf("El area del rectangulo es: %d\n", formula);
    }
}
