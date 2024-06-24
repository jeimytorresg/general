/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesp2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class problema11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        
        metodosP11 obj = new metodosP11(n);
        
        obj.leerMatriz();
        obj.presentar();
        
        obj.matrizTranspuesta(n);
        System.out.println("Matriz transpuesta: ");
        obj.presentar();
    }
}
