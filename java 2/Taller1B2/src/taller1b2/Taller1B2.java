package taller1b2;

public class Taller1B2 {

    public static void main(String[] args) {
        MetodosProblemas2 obj = new MetodosProblemas2();
        System.out.println("Escriba la cantidad de pacientes: ");
        int pacientes = obj.sc.nextInt();
        obj.escribir(pacientes);
    }
    
}
