/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasenlazadas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Metodos {
    Scanner sc;
    Nodo miPila;
    Nodo tope;
    Nodo previo;
    
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.miPila = null;
        this.tope = null;
        this.previo = null;
    }
    
    public int menu(){
        System.out.println("Push   [1]");
        System.out.println("Pop    [2]");
        System.out.println("Salir  [0]");
        return sc.nextInt();
    }
    
    public boolean pilaVacia(){
        return miPila == null;
    }
    
    public void pushPila(int n){
        Nodo nuevo = new Nodo(n);
        if(pilaVacia()){
            miPila = tope = nuevo;
        } else {
            previo = tope;
            tope.sig = previo;
            tope = nuevo;
        }
    }
}
