package matrices;

import java.util.Scanner;

public class Metodos {
    Scanner sc;
    int matriz[][];
    int matrizT[][];
    int matrizResp[][];
    public Metodos(int n){
        this.sc = new Scanner(System.in);
        this.matriz = new int[4][3];
        this.matrizT = new int[3][3];
        this.matrizResp = new int[4][3];
    }
    public int menu(){
        System.out.println("Leer Matriz            [1]");
        System.out.println("Presentar              [2]");
        System.out.println("Transponer 1           [3]");
        System.out.println("Transponer 2           [4]");
        System.out.println("Salir                  [0]");
        return sc.nextInt();
    }
    public void leerMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Ingrese el dato ["+ (i+1) + ", "+(j+1)+ "]");
                System.out.print("> ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public void presentar(int [][] x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void matrizTranspuesta(){
        int aux;
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz.length; j++){
                if (i < j){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }  
            }
        }
    }
    public void matrizTranspuesta2(){
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz.length; j++){
                matrizT[j][i] = matriz[i][j]; 
            }
        }
    }
    public void matrizTranspuesta3(int n){
        int l = n-1, aux;
        for (int i = 0; i < matriz.length;i++){
            int k = n - 1;
            for (int j = 0; j < matriz.length-i-1; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[k][l];
                matriz[k][l] = aux;
                k--;
            }
            l--;
        }
    }
    public void multiplicar(int[][] a, int[][] b, int[][] r){
        int s;
        for(int i = 0; i < a.length; i++){
            for(int l = 0; l < b[0].length; l++){
                s = 0;
                for( int j = 0; j < b.length; j++){
                    s += a[i][j] * b[j][l];
                }
                matrizResp[i][l]= s; 
            }
        }
    }
    
    public void determinante(){
        // Calcular el determinante
        int determinante = calcularDeterminante(matrizT);
        System.out.println("El determinante es: " + determinante);
    }
    
    public int calcularDeterminante(int [][]x){
        return f(x) - k(x);
    }
    
    public int f(int [][]x){
        int[] re = new int[3];
        int a = 1;
        int sum = 0;

        // Inicializar re
        for (int j = 0; j < 3; j++) {
            re[j] = j;
        }

        for (int p = 0; p < 3; p++) {
            for (int i = 0; i < 3; i++) {
                a *= x[i][re[i]];
            }

            sum += a;
            // intercambio de indices
            if (p < 3 - 1) {
                int temp = re[0];
                int temp2 = re[1];
                re[0] = temp2;
                re[1] = re[2];
                re[2] = temp;
                a = 1;
            }
        }

        return sum;
    }
    
    public int k(int [][]k){
        int[] re = new int[3];
        int a = 1;
        int sum = 0;

        // Inicializar re
        for (int j = 0; j < 3; j++) {
            re[j] = 3 - 1 - j; // **Diferencia en la inicialización de re**
        }

        for (int p = 0; p < 3; p++) {
            for (int i = 0; i < 3; i++) {
                a *= k[i][re[i]];
            }

            sum += a;

            if (p < 3 - 1) {
                int temp = re[0];
                int temp2 = re[1];
                re[0] = temp2;
                re[1] = re[2];
                re[2] = temp;
                a = 1;
            }
        }

        return sum;
    }
    
}
