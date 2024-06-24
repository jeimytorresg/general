/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Pregunta5 {
    public static void main(String[] args) {
        Metodos5 obj = new Metodos5();
        System.out.println("Cuantos datos va a ingresar: ");
        int n = obj.sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Dato " + (i+1) + ": ");
            obj.insertar(obj.sc.nextInt());
        }
        obj.recorrer();
        
        System.out.println("Ingrese el valor limite: ");
        int num = obj.sc.nextInt();
        
        obj.listaEliminacion(num);
        obj.recorrer();
        
    }   
}
