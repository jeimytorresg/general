/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpregunta1;

/**
 *
 * @author USUARIO
 */
public class ExamenPregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos1 obj = new Metodos1();
        
        obj.llenarMatriz();
        
        obj.presentar(obj.matriz);
        
        obj.multiplicacion();
        
        System.out.println("El determinante es: " + 
                obj.calcularDeterminante(obj.matriz));
        
        
        System.out.println("La matriz multiplicada por k sera: ");
        obj.presentar(obj.respuesta);
    }
    
}
