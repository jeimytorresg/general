package taller1b;

import java.io.*;

public class MetodosTaller {

    File archivo;
    File archivo2;

    public MetodosTaller() {
        this.archivo = new File("Deudas.txt");
        this.archivo2 = new File("Liberados.txt");
    }

    public void generar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                liberar(cadena);
            }
            leer.close();
            almacenamiento.close();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
    public void liberar(String cadena){
        String nueva = "";
        FileWriter escribir;
        PrintWriter linea;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
        try {
           
            nueva = cadena.replaceAll("Central de Riesgo", "Liberado");
            escribir = new FileWriter(archivo2, true);
            linea = new PrintWriter(escribir);
            linea.println(nueva);
            linea.close();
        } catch (Exception e){
            System.err.println("ERROR !!! " + e.getMessage());
        }
            
    }
}
