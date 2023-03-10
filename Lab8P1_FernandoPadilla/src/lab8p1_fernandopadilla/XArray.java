
package lab8p1_fernandopadilla;

import java.util.*;

public class XArray {
    
    private int[][]matriz;
    
    public XArray(int[][]x){
      this.matriz = x;  
    }
    
    
    
    public void Xarr(int[][]matriz){
        int[]array = new int[matriz.length];
        int[]array2 = new int[matriz.length];
        System.out.println("Matriz generada: ");
        imprimir(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    array[i] = matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == (matriz.length-1-i)){
                    array2[i] = matriz[i][j];
                }
            }
        }
        System.out.println("El arreglo es: ");
     imprimir_arreglo(array,array2);   
    }
    
    public void imprimir_arreglo(int[] arreglo, int[]arreglo2) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i] +"]"+ " ");
        }
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("["+arreglo2[i] +"]"+ " ");
        }
        System.out.println("");
    }
    
    public void imprimir(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
