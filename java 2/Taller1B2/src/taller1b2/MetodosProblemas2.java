
package taller1b2;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosProblemas2 {
    File archivo;
    Scanner sc;
    public MetodosProblemas2(){
        this.archivo = new File("Pacientes.txt");
        this.sc = new Scanner(System.in);
    }
    
    public void escribir(int n){
        FileWriter escribir;
        PrintWriter linea;
        String cadena, cedula, nombre, apellido, nacimiento,alergia;
        float peso,estatura;

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            sc.nextLine();
            for (int i = 1; i <= n; i++ ){
                System.out.println("Paciente" + i + ": ");
                System.out.println("Digite su cedula: ");
                cedula = sc.nextLine();
                System.out.println("Digite sus apellidos: ");
                apellido = sc.nextLine();
                System.out.println("Digite sus nombres: ");
                nombre = sc.nextLine();
                System.out.println("Digite su fecha de nacimiento: ");
                nacimiento = sc.nextLine();
                System.out.println("Digite su peso: ");
                peso = sc.nextFloat();
                System.out.println("Digite su estatura: ");
                estatura = sc.nextFloat();
                sc.nextLine();
                System.out.println("Escriba sus alergias: ");
                alergia = sc.nextLine();
                
                cadena = nombre + " " + apellido;
                
                linea.println("Cedula: "+ cedula);
                linea.println("Nombres Completos: "+ cadena);
                linea.println("Fecha de nacimiento: "+ nacimiento);
                linea.println("Peso: "+ peso);
                linea.println("Estatura: "+ estatura);
                linea.println("Alergias: "+ alergia);
                linea.println("----------------------------------");
                
                
            }
            linea.close();
        } catch (IOException ex) {
            Logger.getLogger(MetodosProblemas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
