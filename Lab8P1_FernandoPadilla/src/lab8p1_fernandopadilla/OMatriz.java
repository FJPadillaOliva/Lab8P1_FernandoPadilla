
package lab8p1_fernandopadilla;

import java.util.*;

public class OMatriz {
   
    private char[][] matriz;
    
    public char[][] getmatriz(){
        return matriz;
    }
    
    public OMatriz (String sentence){
        String[] words = sentence.split(" ");
        int filas = words.length;
        int columnas = 0;
        for (String word : words) {
            if (word.length() > columnas){
                columnas = word.length();
            }
        }
        matriz = new char[filas][columnas];
        for (int i = 0; i < filas ; i++) {
            String word = words[i];
            for (int j = 0; j < columnas; j++) {
                if(j < word.length()){
                    matriz[i][j] = word.charAt(j);
                }else {
                    matriz[i][j] = '-';
                }
            }
        }
    }
    

    

}
