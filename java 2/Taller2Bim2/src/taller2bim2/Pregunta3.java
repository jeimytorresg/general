/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2bim2;

import taller2bim2.Nodo.Nodo;

/**
 *
 * @author USUARIO
 */
public class Pregunta3 {

    public static void main(String[] args) {
        Metodos3 obj = new Metodos3();
        System.out.println("Cuantos datos va a ingresar: ");
        int n = obj.sc.nextInt();

        Nodo head1 = lista(n,obj);
        Nodo head2 = lista(n,obj);

        Nodo fusionListas = obj.fusionListasOrdenadas(head1, head2);

        System.out.println("Listas fusionadas y ordenadas sin duplicados:");
        obj.recorrer(fusionListas);

    }

    public static Nodo lista(int n, Metodos3 obj) {
    Nodo head = null;
    for (int i = 0; i < n; i++) {
        System.out.println("Dato " + (i + 1) + ": ");
        int valor = obj.sc.nextInt();
        obj.insertarOrdenado(valor);
        if (head == null) {
            head = obj.head;
        }
    }
    return head;
}
}
