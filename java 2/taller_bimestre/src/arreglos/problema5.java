
package arreglos;

public class problema5 {
    public static void main(String[] args) {
        /*
        guardar primos en un arreglo
        */
        
        metodosP5 obj = new metodosP5();
        
        System.out.println("Ingrese el tamaño del array: ");
        int n = obj.sc.nextInt();
        int arregloA[] = new int[n];
        
        int c = 1;
        for (int i = 0; i < arregloA.length; i++){
            if(obj.esPrimo(c)){
                arregloA[i] = c;
            } else {
                i--;
            }
            c++;
        }
        
        obj.presentar(arregloA);
        
    
        
    }
}