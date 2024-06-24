package ejrecursividad;

import java.util.Scanner;

public class EjRecursividad {
    
    public static void main(String[] args) {
        MetodosRecursividad obj = new MetodosRecursividad();
        Scanner sc = new Scanner(System.in);
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1: {
                    System.out.println("Ingrese un numero: ");
                    num = sc.nextInt();
                    System.out.println("Es igual a: " + obj.factorial(num));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese un numero: ");
                    num = sc.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    int exp = sc.nextInt();
                    System.out.println("La respuesta es: " + obj.potencia(num, exp));
                    break;
                }
                case 3: {
                    System.out.print("Ingrese un valor para obtener el n-esimo numero de la sucesion: ");
                    int n = sc.nextInt();
                    System.out.println("La respuesta es: "+ MetodosRecursividad.fibo(n));
                    break;
                }
            }
        } while (opc != 0);
    }
    
}
// pene