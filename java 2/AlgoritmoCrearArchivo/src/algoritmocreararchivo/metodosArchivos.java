package algoritmocreararchivo;

import java.util.Scanner;
import java.io.*;

public class metodosArchivos {

    Scanner sc;
    File archivo;

    public metodosArchivos() {
        this.sc = new Scanner(System.in);
        this.archivo = new File("miArchivo.txt");
    }

    public int menu() {
        System.out.println("Escribir datos [1]");
        System.out.println("Leer datos     [2]");
        System.out.println("Salir          [0]");

        return sc.nextInt();
    }

    public void escribir() {
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", correo = "", dir = "";

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
        
        sc.nextLine();
        System.out.println("Digite el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Digite el correo: ");
        correo = sc.nextLine();
        System.out.println("Digite la direccion: ");
        dir = sc.nextLine();
        
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(nombre+"\n"+correo+"\n"+dir);
            linea.close();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }

    }
    public void traer(){
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "", nombre = "", correo = "", dir = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            
            while (cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    correo = cadena;
                    cadena = almacenamiento.readLine();
                    dir = cadena;
                    if (cadena != null){
                        System.out.println(nombre + ", " + correo + ", "+ 
                                dir+ "\n");
                    }
                } catch (Exception e){
                    System.err.println("ERROR!!!!!!!!!");
                }
            }
            
            
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
}
