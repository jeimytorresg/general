/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Scanner;
import taller2bim2.Nodo.Nodo;

/**
 *
 * @author USUARIO
 */
public class Metodos6 {
    Scanner sc;
    Nodo head;
    Nodo tail;
    public Metodos6(){
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }
    
    public boolean listaVacia(){
        return head == null;
    }
    
    public void insertar(int num){
        Nodo nuevo = new Nodo(num);
        if (listaVacia()){
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }
    
    public void recorrerRecursivoInvertido(Nodo actual) {
        if (actual == null) {
            return;
        }
        recorrerRecursivoInvertido(actual.sig);
        System.out.print(actual.valor + "\t");
    }
    
    public void invertirLista(){
        Nodo anterior = null;
        Nodo actual = head;
        Nodo siguiente;
        tail = head;
        
        while (actual != null) {
            siguiente = actual.sig; 
            actual.sig = anterior; 
            anterior = actual; 
            actual = siguiente;
        }
        
        head = anterior;
        
        
        
    }
    public void recorrer(){
        Nodo actual = head;
        while(actual != null){
            System.out.print(actual.valor +"\t");
            actual = actual.sig;
        }
        System.out.println();
    }
    
    

}
