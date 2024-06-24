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
public class Metodos5 {
    Scanner sc;
    Nodo head;
    Nodo tail;
    public Metodos5(){
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
    
    public void listaEliminacion(int n){
        Nodo actual = head;
        while(actual != null){
            if (actual.valor > n){
                eliminar(actual.valor);
            }
            actual = actual.sig;
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
