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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: \n");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su numero de cedula:\n");
        int cedula = entrada.nextInt();
        System.out.print("Ingrese (1) si desea calcular la planilla de luz\n(2) Si desea calcular el valor del predio: \n");
        int dato = entrada.nextInt();

        if (dato == 1) {
            planillaLuz(nombre,cedula);
        } else {
            if (dato == 2) {
                valorPredio(nombre,cedula);
            }

        }

    }
    
    public static void planillaLuz(String x, int y){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la numero de kilowatios del mes:\n");
        int numero = entrada.nextInt();
        System.out.print("Ingrese el valor de kilowatio:\n");
        int valor = entrada.nextInt();
        
        int formula = numero * valor;
        
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%d\n", x,y,formula);
        
    }
    public static void valorPredio(String x, int y){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del inmueble:\n");
        int valor = entrada.nextInt();  
        
        double formula = valor * 0.2;
        
        System.out.printf("Cliente %s con cédula %d tiene un bien inmueble valorado en $%d y tiene que pagar de predio $ %.1f\n",x,y,valor,formula);
    }
}
