/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasycolas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP14 {
    Scanner sc;
    int[] myCola;
    int ev;
    public metodosP14(int n){
        this.sc = new Scanner(System.in);
        this.myCola = new int[n];
        this.ev = 0;
    }
    public int menu(){
        System.out.println("Ingresar cliente              [1]");
        System.out.println("Atender Cliente                [2]");
        System.out.println("Retirarse de la cola           [3]");
        System.out.println("Presentar                      [4]");
        System.out.println("Salir                  [0]");
        return sc.nextInt();
    }
    
    public boolean colaLlena(){
        return (ev == myCola.length);
    }
    
    public boolean colaVacia(){
        return (ev == 0);
    }
    public void push(){
        if(!colaLlena()){
            System.out.println("Ingresar cliente: ");
            myCola[ev] = sc.nextInt();
            ev++;
        } else {
            System.out.println("Cola llena");
        }
    }
    public void recorrerIzq(int pos){
        for(int i = pos; i < ev - 1;i++){
            myCola[i] = myCola[i+1];
        }
    }
    public void pop(){
        if(!colaVacia()){
            System.out.println("Cliente " + myCola[0] + " atendido");
            recorrerIzq(0);
            ev--;
        } else {
            System.out.println("No hay clientes que atender");
        }
    }
    public int secuencial(int n) {
        for (int i = 0; i < ev ; i++) {
            if (n == myCola[i]) {
                return i;
            }
        }
        return -1;
    }
    public void eliminar(int k){
        int pos = secuencial(k);
        if (pos != -1){
            recorrerIzq(pos);
            ev--;
            System.out.println("Cliente retirado de la cola...");
        } else {
            System.out.println("El cliente no existe");
        }
    }
    public void recorrer(){
        for(int i = 0; i < ev; i++){
            System.out.println("> Cliente " + (i+1) +": " + myCola[i]);
        }
    }
}
