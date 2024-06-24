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
public class Metodos8 {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos8() {
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

    public void particionar() {
    Nodo actual = head;
    Nodo headImpar = null;
    Nodo headPar = null;
    Nodo tailImpar = null;
    Nodo tailPar = null;
    int c = 1;

    while (actual != null) {
        Nodo siguiente = actual.sig; 

        if (c % 2 != 0) { 
            if (headImpar == null) {
                headImpar = actual;
                tailImpar = actual;
            } else {
                tailImpar.sig = actual;
                tailImpar = actual;
            }
            tailImpar.sig = null; 
        } else { 
            if (headPar == null) {
                headPar = actual;
                tailPar = actual;
            } else {
                tailPar.sig = actual;
                tailPar = actual;
            }
            tailPar.sig = null; 
        }

        c++;
        actual = siguiente; 
    }
    recorrer(headImpar);
    recorrer(headPar);
}

    public void recorrer(Nodo head) {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.valor + "\t");
            actual = actual.sig;
        }
        System.out.println();
    }

}
