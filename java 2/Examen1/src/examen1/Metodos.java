package examen1;

import java.io.*;
import java.util.Scanner;

public class Metodos {

    Scanner sc;
    File archivo;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.archivo = new File("Aula.txt");
    }

    public void escribir(int n) {
        FileWriter escribir;
        PrintWriter linea;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
        String nombre;
        float calc, prog, log;
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

            for (int i = 0; i <= n-1; i++) {
                sc.nextLine();
                System.out.println("Nombre del estudiante: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese las notas de calculo: ");
                calc = promedio();
                System.out.println("Ingrese las notas de programacion: ");
                prog = promedio();
                System.out.println("Ingrese las notas de logica: ");
                log = promedio();

                linea.printf("%d\n%s\n%,2f\n%,2f\n%,2f\n", i,
                        nombre, calc, prog, log);

            }
            linea.close();
            escribir.close();

        } catch (Exception e) {
            System.err.println("Error !!" + e.getMessage());
        }
    }

    public float promedio() {
        float suma;
        System.out.println("Nota 1: ");
        float n1 = sc.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = sc.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = sc.nextFloat();
        suma = n1 + n2 + n3;
        float promedio = suma / 3;
        return promedio;
    }

    public void guardarVectores(int n) {

        FileReader leer;
        BufferedReader almacenamiento;
        String nombre[], nom, cadena = "", id, promCalc, promLog, promProg;
        float prom1[], prom2[], prom3[];
        prom1 = new float[n];
        prom2 = new float[n];
        prom3 = new float[n];
        nombre = new String[n];
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            int i = 0;
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                id = cadena;
                cadena = almacenamiento.readLine();
                nom = cadena;
                cadena = almacenamiento.readLine();
                promCalc = cadena;
                cadena = almacenamiento.readLine();
                promProg = cadena;
                cadena = almacenamiento.readLine();
                promLog = cadena;

                if (cadena != null) {
                    nombre[i] = nom;
                    prom1[i] = Float.parseFloat(promCalc.replace(",", "."));
                    prom2[i] = Float.parseFloat(promProg.replace(",", "."));
                    prom3[i] = Float.parseFloat(promLog.replace(",", "."));
                    i++;
                }
            }
            almacenamiento.close();
            leer.close();

        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }
        presentarReporte(nombre, prom1, n);
        presentarReporte(nombre, prom2, n);
        presentarReporte(nombre, prom3, n);

    }

    public void presentarReporte(String nombre[], float prom1[],  int n) {
        System.out.println("Los estudiantes que aprobaron  son: ");
        for (int i = 0; i < n; i++) {
            if (prom1[i] >= 7) {
                System.out.printf("> Nombre: %s Promedio: %.2f\n", nombre[i],
                         prom1[i]);
            }
        }
        
    }
}
