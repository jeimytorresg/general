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
public class Metodos1 {
    Scanner sc;
    Nodo head;
    Nodo tail;
    public Metodos1(){
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }
    
    public boolean listaVacia(){
        return head == null;
    }
    
    public void insertar(int num){
        Nodo nuevo = new Nodo(num);
        if (listaVacia()){
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }
    
    public float promedio(){
        Nodo actual = head;
        int sum = 0;
        int c = 0;
        while(actual != null){
            sum += actual.valor;
            actual = actual.sig;
            c++;
        }
        
        float promedio = sum / c;
        return promedio;
    }
}
