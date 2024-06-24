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
public class metodosP13 {
    Scanner sc;
    int[][] notas;
    String alumnos[], materia[];
    int filas, columnas;
    public metodosP13(int a, int m){
        this.sc = new Scanner(System.in);
        this.notas = new int[a][m];
        filas = a;
        columnas = m;
        this.alumnos = new String[a];
        this.materia = new String[m];
    }
    
    public void leer(String[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingresar dato " + (i + 1));
            x[i] = sc.nextLine();
        }
    }
    
    public void leerMatriz(){
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("Ingrese la nota " + (j+1) + " del estudiante"
                        + " " + (i+1));
                System.out.print("> ");
                notas[i][j] = sc.nextInt();
            }
        }
    }
    public void presentar(){
        System.out.print("Alumno");
        for (int i = 0; i < columnas; i++) {
            System.out.print("\t" + materia[i]);
        }
        System.out.println();

        // Imprimir filas de alumnos y notas
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i]);
            for (int j = 0; j < materia.length; j++) {
                System.out.print("\t" + notas[i][j]);
            }
            System.out.println();
        }
    }
    
    public void estudiantes(){
        for(int i = 0; i < filas; i++){
            System.out.println("> " + (i+1) + ") "+ alumnos[i]);
        }
    }
    public void materias(){
        for(int i = 0; i < columnas; i++){
            System.out.println("> " + (i+1) + ") "+ materia[i]);
        }
    }
}
