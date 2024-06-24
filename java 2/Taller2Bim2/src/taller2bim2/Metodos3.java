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
public class Metodos3 {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos3() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public boolean listaVacia() {
        return head == null;
    }

    public void insertarOrdenado(int num) {
    Nodo nuevo = new Nodo(num);

        // Caso lista vacía
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
            return;
        }

        // Recorrer la lista hasta encontrar la posición correcta
        Nodo anterior = null;
        Nodo actual = head;
        while (actual != null && actual.valor < num) {
            anterior = actual;
            actual = actual.sig;
        }

        // Insertar el nuevo nodo en la posición correcta
        if (anterior == null) { // Insertar al inicio
            nuevo.sig = head;
            head = nuevo;
        } else {
            nuevo.sig = anterior.sig;
            anterior.sig = nuevo;
        }

        // Actualizar el puntero tail si es necesario
        if (actual == null) {
            tail = nuevo;
        }
}

    public Nodo fusionListasOrdenadas(Nodo head1, Nodo head2) {
        Nodo aux = new Nodo(0);
        Nodo actual = aux;
        while (head1 != null && head2 != null) {
            if (head1.valor < head2.valor) {
                if (!existeValor(actual, head1.valor)) {
                    insertarNodo(actual, head1.valor);
                }
                head1 = head1.sig;
            } else if (head1.valor > head2.valor) {
                if (!existeValor(actual, head2.valor)) {
                    insertarNodo(actual, head2.valor);
                    actual = actual.sig;
                }
                head2 = head2.sig;
            } else {
                head1 = head1.sig;
            }

        }
        while (head1 != null) {
            if (!existeValor(actual, head1.valor)) {
                insertarNodo(actual, head1.valor);
                actual = actual.sig;
            }
            head1 = head1.sig;
        }
        while (head2 != null) {
            if (!existeValor(actual, head2.valor)) {
                insertarNodo(actual, head2.valor);
                actual = actual.sig;
            }
            head2 = head2.sig;
        }

        // Eliminar el nodo inicial ficticio
        return aux.sig;

    }

    public boolean existeValor(Nodo head, int valor) {
        while (head != null) {
            if (head.valor == valor) {
                return true;
            }
            head = head.sig;
        }
        return false;
    }

    public void insertarNodo(Nodo actual, int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.sig = actual.sig;
        actual.sig = nuevo;
    }
    
    public void recorrer(Nodo a) {
        Nodo actual = a; // Use the passed-in argument
        while (actual != null) {
            System.out.print(actual.valor + "\t");
            actual = actual.sig;
        }
        System.out.println();
    }
}
