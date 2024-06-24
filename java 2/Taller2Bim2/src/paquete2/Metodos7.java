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
public class Metodos7 {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos7() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public boolean listaVacia() {
        return head == null;
    }

    public void insertar(int num) {
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void burbuja() {
        if (listaVacia()) {
            return; 
        }
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true; 

            Nodo actual = head;
            Nodo anterior = null;
            while (actual != null && actual.sig != null) {
                if (actual.valor > actual.sig.valor) { 
                    intercambio(anterior, actual);
                    ordenado = false; 
                }

                anterior = actual;
                actual = actual.sig;
            }
        }
    }

    public void intercambio(Nodo anterior, Nodo actual) {
        if (anterior == null) { 
            head = actual.sig;
            actual.sig = head.sig;
            head.sig = actual;
        } else { 
            anterior.sig = actual.sig;
            actual.sig = anterior.sig.sig;
            anterior.sig.sig = actual;
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
