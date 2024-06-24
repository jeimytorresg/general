/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2bim2;

import java.util.Scanner;
import taller2bim2.Nodo.Nodo;

/**
 *
 * @author USUARIO
 */
public class Metodos2 {
    Scanner sc;
    Nodo head;
    Nodo tail;
    public Metodos2(){
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
    
    public int mayor(){
        Nodo actual = head;
        int n = actual.valor;
        while(actual.sig != null){
            if (n < actual.sig.valor){
                n = actual.sig.valor;
            }
            actual = actual.sig;
        }
        return n;
    }
    
    public void eliminar(int n){
        if (listaVacia()){
            System.out.println("No hay elementos en la lista");
        } else {
            if (n == head.valor){
                head = head.sig;
                if (head == null){
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while((actual.sig != null) && (n != actual.sig.valor)){
                    actual = actual.sig;
                }
                if (actual.sig == null){
                    System.out.println("El elemento no existe");
                } else {
                    actual.sig = actual.sig.sig;
                    if (actual.sig == null){
                        tail = actual;
                    }
                }
            }
        }
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
