
package lab8p1_fernandopadilla;

import java.util.*;

public class Lab8P1_FernandoPadilla {

   static Scanner read = new Scanner (System.in);
   static Random random = new Random(); 
   
    public static void main(String[] args) {
    int opcion = 0;
    do{
        System.out.println("1.XArray");
        System.out.println("2.Duplicados");
        System.out.println("3.OMatriz");
        System.out.println("4.Salida");
        opcion = read.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el tamaño de la matriz: ");
                int fyc = read.nextInt();
                int[][]matriz = new int [fyc][fyc];
                matriz = llenado(fyc);
                XArray xarray = new XArray(matriz);
                xarray.Xarr(matriz);
                break;
                
            case 2:
                int size = 0;
                do{
                System.out.println("Ingrese un tamaño: ");
                size = read.nextInt();
                }while(size<5||size>10);
                Duplicados duplicados = new Duplicados(size,size);
                duplicados.SDuplicados(size);
                int[]array;
                int[]array2;
                array2 = duplicados.getarray2();
                System.out.println(imprimir_j_array(array2));
                break;
                
            case 3:
                String oracion = "";
                System.out.println("Ingrese una oracion: ");
                read.nextLine();
                oracion = read.nextLine();
                OMatriz omatriz = new OMatriz(oracion);
                char[][] resultado = omatriz.getmatriz();
                for (int i = 0; i < resultado.length; i++) {
                    for (int j = 0; j < resultado[i].length; j++) {
                        if(resultado[i][j] != '-'){
                            System.out.print("["+resultado[i][j]+"]");
                        }
                    }
                    System.out.println();
                }
                break;
                
            case 4:
                opcion = 4;
                break;
            
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }while(opcion != 4);
    }


public static int[][] llenado(int fyc){
    int[][] temp = new int[fyc][fyc];
        for (int i = 0; i < fyc; i++) {
            for (int j = 0; j < fyc; j++) {
                temp[i][j] = 1100+random.nextInt(4100);
            }//Maneja las columnas
        }//Maneja las filas
        return temp;
}    

public static String imprimir_j_array(int[] array) {
        String arr = "";
        for (int i = 0; i < array.length; i++) {
            arr += ("[" + array[i] + "]");
        }
        return arr;
    }
}
