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
public class problema12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de Alumnos: ");
        int a = sc.nextInt();
        System.out.println("Numero de Materias: ");
        int m = sc.nextInt();
        metodosP12 obj = new metodosP12(a,m);
        System.out.println("Ingrese los alumnos: ");
        obj.leer(obj.alumnos);
        System.out.println("Ingrese los alumnos: ");
        obj.leer(obj.materia);
        
        obj.leerMatriz();
        
        obj.presentar();

    }
}
