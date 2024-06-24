
package arreglosp2;

import java.util.Scanner;

public class metodosP6 {
    Scanner sc;
    int [] arreglo;
    public metodosP6(int n){
        this.sc = new Scanner(System.in);
        this.arreglo = new int[n];
    }
    public boolean estaOrdenado(){
        for (int i = 0; i < arreglo.length - 1; i++){
                if (arreglo[i] > arreglo[i+1]){
                    return false;
                }
        }
        return true;
    }
    public void leerFull() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar dato " + (i + 1));
            arreglo[i] = sc.nextInt();
        }
    }

    public void presentar() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
}
