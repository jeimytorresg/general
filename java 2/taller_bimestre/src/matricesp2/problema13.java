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
public class problema13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de Alumnos: ");
        int a = sc.nextInt();
        System.out.println("Numero de Materias: ");
        int m = sc.nextInt();
        metodosP13 obj = new metodosP13(a,m);
        System.out.println("Ingrese los alumnos: ");
        obj.leer(obj.alumnos);
        System.out.println("Ingrese las materias: ");
        obj.leer(obj.materia);
        obj.leerMatriz();
        boolean bandera = true;
        int al, mat;
        do {
            obj.presentar();
            System.out.println("De que estudiante desea saber? Ingrese el numero");
            obj.estudiantes();
            al = sc.nextInt();
            System.out.println("De que materia desea saber? Ingrese el numero");
            obj.materias();
            mat = sc.nextInt();
            
            System.out.println(obj.alumnos[al-1] + " tiene " + 
                    obj.notas[al-1][mat-1] + " en " + obj.materia[mat -1]);
            sc.nextLine();
            System.out.println("Ingrese S para revisar las notas de otro estudiante: ");
            if (!sc.nextLine().equalsIgnoreCase("S")) {
                bandera = false;
            }
            
        } while(bandera);
        

    }
}
