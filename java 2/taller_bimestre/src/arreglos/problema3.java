/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        guardar factorial de numeros de un arreglo b en un arreglo a
        */
        metodosP3 obj = new metodosP3();
        
        int arregloA[] = new int[10];
        int arregloB[] = new int[10];
        
        obj.leerFull(arregloB);
        
        for (int i = 0; i < arregloB.length; i++){
            arregloA[i] = obj.factorial(arregloB[i]);
        }
        
        obj.presentar(arregloA);
        
    }
    
}
