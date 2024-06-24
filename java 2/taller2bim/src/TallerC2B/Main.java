/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TallerC2B;

/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->  {
                    obj.insertar();
                }
                case 2 ->  {
                    obj.recorrer();
                }
                case 3 ->  {
                    obj.reporteM();
                }
                case 4 ->  {
                    obj.reporteV();
                }
                case 5 -> {
                    System.out.println("ID a eliminar: ");
                    num = obj.sc.nextInt();
                    obj.eliminar(num);
                }
            }
        } while (opc != 0);
    }

}
