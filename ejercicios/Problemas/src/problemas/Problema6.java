/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double mediaAritmetica = media(informacion);
        
        System.out.println("La media aritmecia: "+ mediaAritmetica);
        
        double desviacion = desviacionEstandar(informacion, mediaAritmetica);
        System.out.printf("La desviacion estandar:  %.2f   ", desviacion);
    }

    public static double media(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }

        double promedio = (double)suma / a.length;
        return promedio;
    }
    
    public static double desviacionEstandar(int []y,double x) {
        
        double suma = 0;
                
        for (int i = 0; i < y.length; i++) {
            suma=  suma + Math.pow(y[i]-x ,2);
            
        }     
        
        double variancia = suma / y.length;
               
        return  Math.sqrt(variancia);
    }
}
