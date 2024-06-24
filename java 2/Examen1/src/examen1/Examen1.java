/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

/**
 *
 * @author USUARIO
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        System.out.println("Cuantos estudiantes va a ingresar: ");
        int n = m.sc.nextInt();
        m.escribir(n);
        m.guardarVectores(n);
    }
    
}
