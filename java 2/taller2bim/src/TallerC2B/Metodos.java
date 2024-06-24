/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerC2B;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu() {
        System.out.println("Insertar                    [1]");
        System.out.println("Recorrer                    [2]");
        System.out.println("Reporte Mujeres             [3]");
        System.out.println("Reporte Varones             [4]");
        System.out.println("Eliminar estudiante         [5]");
        System.out.println("Salir                       [0]");
        return sc.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public Nodo leerPersona() {
        int id_;
        String nom;
        char sex;
        float[] notas = new float[3];
        Nodo nuevo;
        System.out.println("Ingrese ID: ");
        id_ = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre: ");
        nom = sc.nextLine();
        System.out.println("Ingrese su sexo: ");
        sex = sc.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese calificacion " + (i + 1));
            notas[i] = sc.nextFloat();
        }
        nuevo = new Nodo(new Alumno(id_, nom, sex, notas));
        return nuevo;
    }

    public void insertar() {
        Nodo nuevo = leerPersona();
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println("Nombre del estudiante: " + actual.estudiante.nombre);
            actual = actual.sig;
        }
    }

    public void eliminar(int n) {
        if (listaVacia()) {
            System.out.println("No hay alumnos en la lista");
        } else {
            if (n == head.estudiante.id) {
                head = head.sig;
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (n != actual.sig.estudiante.id)) {
                    actual = actual.sig;
                }
                if (actual.sig == null) {
                    System.out.println("El alumno no existe");
                } else {
                    actual.sig = actual.sig.sig;
                    if (actual.sig == null) {
                        tail = actual;
                    }
                }
            }
        }
    }

    public void reporteM() {
        Nodo actual = head;
        while (actual != null) {
            if (Character.toUpperCase(actual.estudiante.sexo) == 'F') {
                System.out.printf("Nombre: %s\n", actual.estudiante.nombre);
                for (int i = 0; i < actual.estudiante.calif.length; i++) {
                    System.out.printf("Nota %d: %.2f\n", i + 1, actual.estudiante.calif[i]);
                }
                System.out.printf("Promedio: %.2f\n", actual.estudiante.getPromedio());
            }
            actual = actual.sig;
        }
    }

    public void reporteV() {
        Nodo actual = head;
        while (actual != null) {
            if (Character.toUpperCase(actual.estudiante.sexo) == 'M') {
                System.out.printf("Nombre: %s\n", actual.estudiante.nombre);
                for (int i = 0; i < actual.estudiante.calif.length; i++) {
                    System.out.printf("Nota %d: %.2f\n", i + 1, actual.estudiante.calif[i]);
                }
                System.out.printf("Promedio: %.2f\n", actual.estudiante.getPromedio());
            }
            actual = actual.sig;
        }
    }
}
