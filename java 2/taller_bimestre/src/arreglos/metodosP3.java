/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP3 {
    Scanner sc;
    
    public metodosP3 (){
        this.sc = new Scanner(System.in);
    }
    public int factorial (int n){
        if (n == 0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public void leerFull(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("Ingresar dato " + (i + 1));
            n[i] = sc.nextInt();
        }
    }
    public void presentar(int n[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }
}
