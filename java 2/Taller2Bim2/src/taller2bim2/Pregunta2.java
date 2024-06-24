/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2bim2;

/**
 *
 * @author USUARIO
 */
public class Pregunta2 {
    public static void main(String[] args) {
        Metodos2 obj = new Metodos2();
        System.out.println("Cuantos datos va a ingresar: ");
        int n = obj.sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Dato " + (i+1) + ": ");
            obj.insertar(obj.sc.nextInt());
        }
        
        System.out.println("Lista Ingresada: ");
        obj.recorrer();
        System.out.println("Lista sin el valor mayor: ");
        obj.eliminar(obj.mayor());
        obj.recorrer();
    }
}
