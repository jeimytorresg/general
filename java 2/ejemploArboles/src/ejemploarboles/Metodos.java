/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploarboles;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Metodos {

    Scanner sc;
    Nodo raiz;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.raiz = null;
    }

    public int menu() {
        System.out.println("Insertar    [1]");
        System.out.println("Recorrer    [2]");
        System.out.println("Eliminar    [3]");
        System.out.println("Salir       [0]");
        return sc.nextInt();
    }

    public Nodo insertar(int n, Nodo actual) {
        if (actual == null) {
            Nodo nuevo = new Nodo(n);
            return nuevo;
        } else {
            if (n < actual.valor) {
                actual.izq = insertar(n, actual.izq);
            } else {
                actual.der = insertar(n, actual.der);
            }
        }

        return actual;
    }

    public void preOrden(Nodo actual) {
        if (actual != null) {
            System.out.println(actual.valor + " ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.println(actual.valor + " ");
            inOrden(actual.der);
        }
    }

    public void posOrden(Nodo actual) {
        if (actual != null) {
            posOrden(actual.izq);
            posOrden(actual.der);
            System.out.println(actual.valor + " ");
        }
    }
}
