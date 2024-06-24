package ejrecursividad;
import java.util.Scanner;
public class MetodosRecursividad {
    Scanner sc;
    
    public MetodosRecursividad (){
        this.sc = new Scanner(System.in);
    }
    
    public int menu() {
        System.out.println("Factorial       [1]");
        System.out.println("Potencia        [2]");
        System.out.println("Fibonacci       [3]");
        System.out.println("Salir           [0]");
        return sc.nextInt();
    }
    
    public int factorial (int n){
        if (n == 0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    
    public int potencia(int num, int exp){
        if (exp == 0) {
            return 1;
        } else {
            if (exp == 1) {
                return num;
            } else {
                return num * potencia(num, exp - 1);
            }
        }
    }
    
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
}
