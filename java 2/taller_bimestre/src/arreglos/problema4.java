
package arreglos;

public class problema4 {
    public static void main(String[] args) {
        /*
        guardar serie fibonacci en un arreglo a
        */
        metodosP4 obj = new metodosP4();
        
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = obj.sc.nextInt();
        
        int arreglo[] = new int[n];
        
        for (int i = 0; i < n; i++){
            arreglo[i] = obj.fibo(i);
        }
        
        obj.presentar(arreglo);
        
    }
}
