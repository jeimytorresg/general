/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author USUARIO
 */
public class problema8 {
    public static void main(String[] args){
        metodosP8 obj = new metodosP8();
        obj.llenarMatriz();
        for(int i = 0; i < 20; i++){
            System.out.println("La media del estudiante "+ (i+1)+" es: " +
                    obj.mediaAlumno(i));
        }
        for(int i = 0; i < 4; i++){
            System.out.println("La media de la materia "+ (i+1)+" es: " +
                    obj.mediaMateria(i));
        }
        System.out.println("La media de la clase es "+obj.mediaClase());
    }
}
