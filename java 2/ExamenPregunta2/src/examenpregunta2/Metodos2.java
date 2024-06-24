/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpregunta2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Metodos2 {
    Scanner sc;
    int[] a;
    int[] b;
    int[] r;
    public Metodos2(int n){
        this.sc = new Scanner(System.in);
        this.a = new int[n];
        this.b = new int[n];
        this.r = new int[n];
    }
    
    public void llenarConjunto(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.println("Ingrese el valor " + (i+1));
            System.out.print("> ");
            x[i] = sc.nextInt();
        }
    }
    
    public void buscarRepetidos(){
        short indice = 0;
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if (a[i] == b[j]){
                    r[indice++] = a[i];
                } 
            }
        }
    }
    
    public void presentarInterseccion(){
        System.out.println("El conjunto interseccion será el siguiente: ");
        for (int i = 0; i < r.length; i++){
            System.out.print(r[i] + "\t");
        }
        System.out.println("");
    }
}
