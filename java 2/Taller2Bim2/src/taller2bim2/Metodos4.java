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
public class Metodos4 {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos4() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public boolean listaVacia() {
        return head == null;
    }

    public Nodo insertar(int num) {
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
        return head;
    }

    public void recorrerRecursivoInvertido(Nodo actual) {
        if (actual == null) {
            return;
        }
        recorrerRecursivoInvertido(actual.sig);
        System.out.print(actual.valor + "\t");
    }
}
