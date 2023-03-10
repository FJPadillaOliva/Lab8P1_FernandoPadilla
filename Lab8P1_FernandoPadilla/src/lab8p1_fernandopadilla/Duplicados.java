
package lab8p1_fernandopadilla;

import java.util.*;

public class Duplicados {
    
    static Random random = new Random(); 
    
    private int size;
    private int[] array;
    private int[] array2;
    
    public Duplicados (int x,int y){
    this.size = x;
    this.array = new int[x];
    this.array2 = new int[y];
    }
    
    public void setarray(int[]cambio){
        this.array = cambio;
    }
    
    public void setarray2(int[]cambio){
        this.array2 = cambio;
    }
    
    public int [] getarray(){
        return array;
    }
    
    public int [] getarray2(){
        return array2;
    }
    
    
    
    public void SDuplicados(int x){
        int [] arr = new int[x];
        int [] arr2 = new int[x];
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1+random.nextInt(10);
        }
        
        arr2 = arr;
        setarray(arr);
        System.out.println(imprimir_j_array(arr));
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
            if(i != j && arr2[j] != 0 && arr2[j] == arr2[i]){
            arr2[j]=0;
            }
            }
        }
        setarray2(arr2);
}
    
    public String imprimir_j_array(int[] array) {
        String arr = "";
        for (int i = 0; i < array.length; i++) {
            arr += ("[" + array[i] + "]");
        }
        return arr;
    }
}
