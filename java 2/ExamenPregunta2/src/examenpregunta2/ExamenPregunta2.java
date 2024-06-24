/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpregunta2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ExamenPregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los conjuntos: ");
        int n = sc.nextInt();
        
        Metodos2 obj = new Metodos2(n);
        
        // Ingresamos datos por teclado para tener un mayor control
        // sobre la logica de este codigo
        
        // En cada conjunto deben ir elementos diferentes.
        
        System.out.println("Ingrese el conjunto A: ");
        obj.llenarConjunto(obj.a); 
        System.out.println("Ingrese el conjunto B: ");
        obj.llenarConjunto(obj.b);
        
        obj.buscarRepetidos();
        
        obj.presentarInterseccion();

    }
    
}
