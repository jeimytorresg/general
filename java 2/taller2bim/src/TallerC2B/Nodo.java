/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerC2B;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    Alumno estudiante;
    Nodo sig;
    public Nodo(Alumno est){
        this.estudiante = est;
        this.sig = null;
    }
    
}
