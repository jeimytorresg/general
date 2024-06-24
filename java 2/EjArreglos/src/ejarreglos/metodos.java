package ejarreglos;

import java.util.Scanner;

public class metodos {

    Scanner sc;
    int[] arreglo;
    int e;

    public metodos(int n) {
        this.sc = new Scanner(System.in);
        this.arreglo = new int[n];
        this.e = 0;
    }

    public int menu() {
        System.out.println("Llenar arreglo              [1]");
        System.out.println("Leer siguiente              [2]");
        System.out.println("Presentar                   [3]");
        System.out.println("Buscar                      [4]");
        System.out.println("Eliminar                    [5]");
        System.out.println("Insertar Inicio             [6]");
        System.out.println("Insertar Ordenado           [7]");
        System.out.println("Búsqueda Binaria            [8]");
        System.out.println("Salir                       [0]");
        return sc.nextInt();
    }

    public void leerFull() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar dato " + (i + 1));
            arreglo[i] = sc.nextInt();
        }
        e = arreglo.length;
    }

    public void leerSig() {
        if (e < arreglo.length) {
            System.out.println("Ingresar dato " + e);
            arreglo[e] = sc.nextInt();
            e++;
        } else {
            System.out.println("ño >:(");
        }
    }

    public void presentar() {
        for (int i = 0; i < e; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }

    public int secuencial(int n) {
        for (int i = 0; i < e; i++) {
            if (n == arreglo[i]) {
                return i;
            }
        }
        return -1;
    }

    public void eliminar(int n) {
        int pos = secuencial(n);
        if (pos != -1) {
            desplazaIzq(pos);
            e--;
        } else {
            System.out.println("No existe :(");
        }
    }

    public void desplazaIzq(int n) {
        for (int i = n; i < e; i++) {
            arreglo[i] = arreglo[i + 1];
        }
    }

    public void desplazaDer(int n) {
        for (int i = e; i > n; i--) {
            arreglo[i] = arreglo[i - 1];
        }
    }

    public void insInicio(int n) {
        if (e < arreglo.length) {
            desplazaDer(0);
            arreglo[0] = n;
            e++;
        } else {
            System.out.println("No se procede.");
        }
    }

    public void ordenado(int n) {
        int pos = 0;
        if (e < arreglo.length) {
            while (pos < e && n > arreglo[pos]) {
                pos++;
            }
            desplazaDer(pos);
            arreglo[pos] = n;
            e++;
        } else {
            System.out.println("No");
        }
    }

    public int binaria(int inicio, int fin, int num) {
        int medio = (inicio + fin) / 2;
        if (inicio <= fin) {
            if (num == arreglo[medio]) {
                return medio;
            } else if (num > arreglo[medio]) {
                return binaria(medio + 1, fin, num);
            } else {
                return binaria(inicio, medio - 1, num);
            }
        } else {
            return -1;
        }
    }

    public void insercion() {
        int aux, pos;
        for (int i = 1; i < e; i++) {
            aux = arreglo[i];
            pos = i - 1;
            while ((pos >= 0) && (aux < arreglo[pos])) {
                arreglo[pos + 1] = arreglo[pos];
                pos--;
            }
            arreglo[pos + 1] = aux;
        }
    }

    public void seleccion() {
        int aux, pos;
        for (int i = e; i > 0; i--) {
            pos = 0;
            aux = arreglo[pos];
            for (int j = 1; j < i; j++) {
                if (arreglo[j] > aux) {
                    aux = arreglo[j];
                    pos = j;
                }
            }
            arreglo[pos] = arreglo[i - 1];
            arreglo[i - 1] = aux;
        }
    }

    public void QuickSort(int inicio, int fin) {
        int a = inicio, b = fin, aux;
        int pivote = arreglo[(inicio + fin) / 2];
        do {
            while (arreglo[a] < pivote) {
                a++;
            }
            while (arreglo[b] > pivote) {
                b--;
            }
            if (a < b){
                aux = arreglo[a];
                arreglo[a] = arreglo[b];
                arreglo[b] = aux;
            }
            a++;
            b--;
        } while (a <= b);
        if (inicio < b){
            QuickSort(inicio, b);
        }
        if (fin > a){
            QuickSort(a, fin);
        }
    }
}
