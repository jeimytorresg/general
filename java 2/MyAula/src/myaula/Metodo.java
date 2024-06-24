package myaula;

import java.util.Scanner;

public class Metodo {

    Scanner sc;
    Alumno[] myAula;
    int ev;

    public Metodo(int lim) {
        this.sc = new Scanner(System.in);
        this.myAula = new Alumno[lim];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("Insertar          [1]");
        System.out.println("Presentar         [2]");
        System.out.println("Salir             [0]");
        return sc.nextInt();
    }

    public boolean aulaLlena() {
        return (ev == myAula.length);
    }

    public boolean aulaVacia() {
        return (ev == 0);
    }

    public Alumno leeDatos() {
        int id_;
        String nom;
        char sex;
        float[] notas = new float[3];
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
        Alumno nuevo = new Alumno(id_, nom, sex, notas);
        return nuevo;
    }

    public void insertar() {
        if (!aulaLlena()) {
            myAula[ev] = leeDatos();
            ev++;

        } else {
            System.out.println("Aula Llena...");
        }
    }
    
    public void presentar(){
        if (!aulaVacia()){
            for (int i = 0; i < ev; i++){
                System.out.println("ID: " + myAula[i].id);
                System.out.println("Nombre: " + myAula[i].nombre);
                System.out.println("Sexo: " + myAula[i].sexo);
                System.out.println("Nota 1: " + myAula[i].calif[0]);
                System.out.println("Nota 2: " + myAula[i].calif[1]);
                System.out.println("Nota 3: " + myAula[i].calif[2]);
            }
        } else {
            System.err.println("Aula vacia");
        }
    }
}
