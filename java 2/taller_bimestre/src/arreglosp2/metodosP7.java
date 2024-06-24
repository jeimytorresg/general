/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosp2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP7 {
    Scanner sc ;
    int[] arreglo;
    public metodosP7(int n){
        this.sc = new Scanner(System.in);
        this.arreglo = new int[n];
    }
    public void leerFull() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar dato " + (i + 1));
            arreglo[i] = sc.nextInt();
        }
    }
    
    public int sumaPar(){
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 == 0){
                suma += arreglo[i];
            }
        }
        return suma;
    }
    public int sumaImpar(){
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 != 0){
                suma += arreglo[i];
            }
        }
        return suma;
    }

    
}
