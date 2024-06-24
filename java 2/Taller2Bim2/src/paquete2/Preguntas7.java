/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Preguntas7 {
    public static void main(String[] args){
        Metodos7 obj = new Metodos7();
        System.out.println("Cuantos elementos va a ingresar: ");
        int n = obj.sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Dato " + (i+1) + ": ");
            obj.insertar(obj.sc.nextInt());
        }
        
        obj.recorrer();
        System.out.println("Lista ordenada (Metodo Burbuja): ");
        obj.burbuja();
        obj.recorrer();
    }
}
