/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadas;

import java.util.Scanner;

public class Metodos {
    Scanner sc;
    Nodo head;
    Nodo tail;
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }
    
    public int menu(){
        System.out.println("[1] Insertar");
        System.out.println("[2] Recorrer");
        System.out.println("[3] Insertar Inicio");
        System.out.println("[4] Insertar Ordenado");
        System.out.println("[0] Salir");
        return sc.nextInt();
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
    
    public void recorrer(){
        Nodo actual = head;
        while(actual != null){
            System.out.print(actual.valor +"\t");
            actual = actual.sig;
        }
        System.out.println();
    }
    
    public void insertarInicio(int num){
        Nodo nuevo = new Nodo(num);
        if (listaVacia()){
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }
    }
    
    public void insertarOrdenado(int n){
        Nodo nuevo = new Nodo(n);
        if (listaVacia()){
            head = nuevo;
            tail = nuevo;
        } else if (n < head.valor){
            insertarInicio(n);
        } else {
            Nodo actual = head;
            while ((actual.sig != null) && (n > actual.sig.valor)){
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            actual.sig = nuevo;
            if(nuevo.sig == null){
                tail = nuevo;
            }
        }
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
}
