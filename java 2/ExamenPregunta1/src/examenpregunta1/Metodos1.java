/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpregunta1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Metodos1 {

    int[][] matriz;
    int[][] respuesta;

    public Metodos1() {
        this.matriz = new int[3][3];
        this.respuesta = new int[3][3];
    }

    public void llenarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = generarNumeroAleatorio();
            }
        }
    }

    public int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Genera un número entre 0 y 9, luego le suma 1
    }

    public void presentar(int [][] x){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public void multiplicacion(){
        int determinante = calcularDeterminante(matriz);
        for(int i = 0; i < 3;i++){
            for (int j = 0; j < 3; j++){
                respuesta[i][j] = matriz[i][j] * determinante;
            }
        }
    }
    
    public int calcularDeterminante(int [][]x){
        return f(x) - k(x);
    }
    
    public int f(int [][]x){
        int[] re = new int[3];
        int a = 1;
        int sum = 0;

        // Inicializar re
        // re es donde se guardan indices del 1 al 3
        for (int j = 0; j < 3; j++) {
            re[j] = j;
        }

        for (int p = 0; p < 3; p++) {
            for (int i = 0; i < 3; i++) {
                a *= x[i][re[i]];
            }

            sum += a;
            // intercambio de indices
            if (p < 3 - 1) {
                int temp = re[0];
                int temp2 = re[1];
                re[0] = temp2;
                re[1] = re[2];
                re[2] = temp;
                a = 1;
            }
        }

        return sum;
    }
    
    public int k(int [][]k){
        int[] re = new int[3];
        int a = 1;
        int sum = 0;

        // Inicializar re
        for (int j = 0; j < 3; j++) {
            re[j] = 3 - 1 - j; // **Diferencia en la inicialización de re**
        }

        for (int p = 0; p < 3; p++) {
            for (int i = 0; i < 3; i++) {
                a *= k[i][re[i]];
            }

            sum += a;

            if (p < 3 - 1) {
                int temp = re[0];
                int temp2 = re[1];
                re[0] = temp2;
                re[1] = re[2];
                re[2] = temp;
                a = 1;
            }
        }

        return sum;
    }
    
    


}
