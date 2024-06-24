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
public class metodosP5 {
    Scanner sc;
    
    public metodosP5 (){
        this.sc = new Scanner(System.in);
    }
    public void presentar(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }
    
    public boolean esPrimo(int num) {
        if (num == 1) {
            return true;
        }
        for (int c = 2; c <= Math.sqrt(num); c++) {
            if (num % c == 0) {
                return false;
            }
        }
        return true;
    }
}
