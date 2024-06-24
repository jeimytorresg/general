/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazadas;

/**
 *
 * @author USUARIO
 */
public class Enlazadas {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch(opc){
                case 1: 
                    System.out.println("Ingrese el elemento a insertar: ");
                    num = obj.sc.nextInt();
                    obj.insertar(num);
                    break;
                case 2:
                    obj.recorrer();
                    break;
                case 3: 
                    System.out.println("Ingrese el elemento a insertar: ");
                    num = obj.sc.nextInt();
                    obj.insertarInicio(num);
                    break;
                case 4: 
                    System.out.println("Ingrese el elemento a insertar: ");
                    num = obj.sc.nextInt();
                    obj.insertarOrdenado(num);
                    break;
                case 5: 
                    System.out.println("Elemento a eliminar: ");
                    System.out.println("Ingrese el elemento a insertar: ");
                    num = obj.sc.nextInt();
                    obj.eliminar(num);
                    break;
            }
        } while(opc != 0);
    }
    
}
