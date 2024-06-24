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
public class problema7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        
        metodosP7 obj = new metodosP7(n);
        
        obj.leerFull();
        
        System.out.printf("La suma de pares sera: %s\n"
                + "La suma de impares sera: %s\n", obj.sumaPar(), obj.sumaImpar());
    }
}
