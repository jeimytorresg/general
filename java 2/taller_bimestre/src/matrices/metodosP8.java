/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP8 {
    Scanner sc = new Scanner(System.in);
    int [][] matriz;
    public metodosP8(){
        this.matriz = new int[4][20];
    }
    public void llenarMatriz(){
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 20;j++){
                matriz[i][j] = generarNumeroAleatorio();
            }
        }
    }
    public int mediaAlumno(int n){
        int suma = 0;
        for(int i = 0; i < 4; i++){
            suma += matriz[i][n];
        }
        return suma / 4;
    }
    public int mediaMateria(int n){
        int suma = 0;
        for(int i = 0; i < 20; i++){
            suma += matriz[n][i];
        }
        return suma / 20;
    }
    public int mediaClase(){
        int suma = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 20; j++){
                suma+=matriz[i][j];
            }
        }
        return suma / 80;
    }
    public int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Genera un número entre 0 y 9, luego le suma 1
    }
}
