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
public class problema14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos clientes: ");
        int n = sc.nextInt();
        metodosP14 obj = new metodosP14(n);
        int opc, num;
        do {
            opc = obj.menu();
            switch(opc) {
            case 1 -> obj.push();
            case 2 -> obj.pop();
            case 3 -> {
                System.out.println("Elemento a retirar: ");
                num = obj.sc.nextInt();
                obj.eliminar(num);
            }
            case 4 -> obj.recorrer();
        }
        } while (opc != 0);
        
    }
}
