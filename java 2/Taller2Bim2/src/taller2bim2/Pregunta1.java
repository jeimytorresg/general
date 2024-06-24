/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2bim2;

/**
 *
 * @author USUARIO
 */
public class Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos1 obj = new Metodos1();
        System.out.println("Cuantos datos va a ingresar: ");
        int n = obj.sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Dato " + (i+1) + ": ");
            obj.insertar(obj.sc.nextInt());
        }
        
        System.out.println("El promedio será: " + obj.promedio());
    }
    
}
