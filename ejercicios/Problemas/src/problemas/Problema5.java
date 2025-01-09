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
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion1 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] resultado = new int[3][3];

        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                resultado[i][j] = obtenerSuma(informacion[i][j],
                        informacion1[i][j]);

            }
        }
        
        informe(resultado);
        
    }
    
    public static void informe(int[][] arreglo3){
        String cadena = "";
        for (int i = 0; i < arreglo3.length; i++) {
            for (int j = 0; j < arreglo3[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo3[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
    
    public static int obtenerSuma(int a, int b){
        int operacion;
        operacion = a + b;
        return operacion;
    }
}
