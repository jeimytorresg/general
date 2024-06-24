/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author USUARIO
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos(4);
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->
                    obj.leerMatriz(obj.matriz);
                case 2 ->
                    obj.presentar(obj.matriz);
                case 3 -> {
                    obj.matrizTranspuesta();
                    obj.presentar(obj.matrizT);
                }
                case 4 -> {
                    obj.matrizTranspuesta2();
                    obj.presentar(obj.matriz);
                }
                case 5 -> {
                    obj.matrizTranspuesta3(obj.matriz.length);
                    obj.presentar(obj.matriz);
                }
                case 6 -> {
                    obj.leerMatriz(obj.matriz);
                    obj.leerMatriz(obj.matrizT);
                }
                case 7 -> {
                    obj.leerMatriz(obj.matrizT);
                    obj.determinante();
                }


            }
        } while (opc != 0);
    }

}
