package matrices;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class problema9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes: ");
        int n = sc.nextInt();
        metodosP9 obj = new metodosP9(n);
        
        obj.llenarClientes();
        obj.llenarMatriz();
        
        obj.presentar();
    }
}
