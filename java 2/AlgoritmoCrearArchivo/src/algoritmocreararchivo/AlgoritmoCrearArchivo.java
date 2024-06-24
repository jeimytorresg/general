package algoritmocreararchivo;

public class AlgoritmoCrearArchivo {

    public static void main(String[] args) {
        metodosArchivos obj = new metodosArchivos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1: obj.escribir();
                    break;
                case 2: obj.traer();
                      break;
                default: break;
            }
        } while(opc != 0);
    }
    
}
