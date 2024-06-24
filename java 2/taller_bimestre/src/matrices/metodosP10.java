/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP10 {

    boolean asientos[][];
    Scanner sc;

    public metodosP10(int n, int m) {
        this.asientos = new boolean[n][m];
        this.sc = new Scanner(System.in);
    }
    
    public void asientosDefault(){
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j] = false;
            }
        }
    }
    public int menu() {
        System.out.println("Ver asientos vacios              [1]");
        System.out.println("Desocupar asiento                [2]");
        System.out.println("Escoger asiento                  [3]");
        System.out.println("Salir                            [0]");
        return sc.nextInt();
    }

    public void ocupar() {
        boolean bandera;
        int i, j;
        do {
            bandera = true;
            System.out.println("Ingrese la fila deseada (1 - 25): ");
            i = sc.nextInt();
            
            System.out.println("Ingrese la columna deseada (1 - 6): ");
            j = sc.nextInt();
            sc.nextLine();
            
            
            
            if (asientos[i-1][j-1]) {
                System.out.println("El asiento está ocupado");
            } else {
                System.out.println("El asiento ha sido escogido con exito");
                asientos[i-1][j-1] = true;
            }

            System.out.println("Ingrese S para ingresar otro asiento: ");
            if (!sc.nextLine().equalsIgnoreCase("S")) {
                bandera = false;
            }
        } while (bandera);
    }

    public void verVacios() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 6; j++) {
                if (!asientos[i][j]) {
                    System.out.println("El asiento f: " + (i + 1) + " y c: "
                            + (j + 1) + " esta libre");
                }
            }
        }
    }

    public void desocupar() {
        boolean bandera;
        do {
            bandera = true;
            System.out.println("Que asiento desea desocupar");
            System.out.println("Numero de fila del asiento: ");
            int i = sc.nextInt();
            System.out.println("Numero de columna del asiento: ");
            int j = sc.nextInt();
            asientos[i-1][j-1] = false;
            sc.nextLine();
            System.out.println("Ingrese S para desocupar otro asiento: ");
            if (!sc.nextLine().equals("S") || !sc.nextLine().equals("s")) {
                bandera = false;
            }
        } while (bandera);

    }
}
