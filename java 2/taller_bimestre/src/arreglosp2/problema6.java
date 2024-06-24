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
public class problema6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        metodosP6 obj = new metodosP6(n);
        
        obj.leerFull();
        if (obj.estaOrdenado()){
            System.out.println("El arreglo está ordenado de menor a mayor");
        } else {
            System.out.println("El arreglo no esta ordenado");
        }
    }
}
