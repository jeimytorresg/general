/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2bim2;
import taller2bim2.Nodo.Nodo;

/**
 *
 * @author USUARIO
 */
public class Pregunta4 {
    public static void main(String[] args) {
        Metodos4 obj = new Metodos4();
        System.out.println("Cuantos datos va a ingresar: ");
        int n = obj.sc.nextInt();
        System.out.println("Dato 1: ");
        Nodo head = obj.insertar(obj.sc.nextInt());
        for(int i = 0; i < n-1; i++){
            System.out.println("Dato " + (i+2) + ": ");
            obj.insertar(obj.sc.nextInt());
        }
        
        obj.recorrerRecursivoInvertido(head);
        
    }  
}
