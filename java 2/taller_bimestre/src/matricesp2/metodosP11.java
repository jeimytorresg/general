/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesp2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP11 {
    Scanner sc;
    int[][] matriz;

    public metodosP11(int n) {
        this.matriz = new int[n][n];
        this.sc = new Scanner(System.in);
    }
    
    public void leerMatriz(){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = generarNumeroAleatorio();
            }
        }
    }
    
    public void presentar(){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void matrizTranspuesta(int n) {
        int l = n - 1, aux;
        for (int i = 0; i < matriz.length; i++) {
            int k = n - 1;
            for (int j = 0; j < matriz.length - i - 1; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[k][l];
                matriz[k][l] = aux;
                k--;
            }
            l--;
        }
    }

    public int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(99) + 1; // Genera un número entre 0 y 9, luego le suma 1
    }
}
