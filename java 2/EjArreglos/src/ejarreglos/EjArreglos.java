package ejarreglos;

public class EjArreglos {

    public static void main(String[] args) {
        metodos obj = new metodos(5);
        int opcion, num, rp;
        do {
            opcion = obj.menu();
            switch (opcion){
                case 1 : obj.leerFull();
                break;
                case 2: obj.leerSig();
                break;
                case 3: obj.presentar();
                break;
                case 4: System.out.println("Numero a buscar: ");
                num = obj.sc.nextInt();
                rp = obj.secuencial(num);
                if (rp != -1) {
                    System.out.println("Está en la posicion: " + rp);
                } else {
                    System.out.println("No está en ninguna posicion");
                }
                break;
                case 5: System.out.println("Numero a eliminar: ");
                num = obj.sc.nextInt();
                obj.eliminar(num);
                case 6: System.out.println("Numero a insertar: ");
                num = obj.sc.nextInt();
                obj.insInicio(num);
                case 7: System.out.println("Ingresar numero ");
                num = obj.sc.nextInt();
                obj.ordenado(num);
                case 8: System.out.println("Ingresar numero a buscar: ");
                num = obj.sc.nextInt();
                rp = obj.binaria(0, obj.e -1, num);
                if (rp != -1){
                    System.out.println("Esta en posicion: " + rp);
                } else {
                    System.out.println("No esta...");
                }
                default: break;
                
            }
        } while (opcion!=0);
    }
    
}
