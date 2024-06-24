package matrices;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class metodosP9 {
    Scanner sc = new Scanner(System.in);
    String clientes[];
    boolean asistencia[][];
    public metodosP9(int n){
        this.clientes = new String[n];
        this.asistencia = new boolean[clientes.length][6];
    }
    
    public void llenarClientes(){
        for(int i = 0; i < clientes.length; i++){
            System.out.println("Ingrese el nombre del cliente " + (i+1));
            clientes[i] = sc.nextLine();
        }
    }
    
    public void llenarMatriz(){
        System.out.println("Ingrese S si asistio o N si no asistio");
        for(int i = 0; i < clientes.length;i++){
            for(int j = 0; j < 6;j++){
                System.out.println(clientes[i] + " asistió el dia "+ (j+1));
                asistencia[i][j] = true;
                if (!sc.nextLine().equals("S")){
                    asistencia[i][j] = false;
                }
                
            }
        }
    }
    
    public void presentar(){
        int c;
        for(int i = 0; i < clientes.length; i++){
            c = 0;
            for(int j = 0; j < 6;j++){
                if (asistencia[i][j]){
                    c++;
                }
            }
            if (c > 3){
                System.out.println("El cliente " + clientes[i] + " tiene "
                        + " el 20% de descuento");
            }
        }
    }
    
}
