
package myaula;

public class MyAula {

    public static void main(String[] args) {
        Metodo obj = new Metodo(10);
        int opc;
        do{
            opc = obj.menu();
            switch(opc){
                case 1: obj.insertar();
                case 2: obj.presentar();
            }
        } while (opc != 0);
    }
    
}
