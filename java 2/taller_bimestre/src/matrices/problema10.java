/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class problema10 {
   public static void main(String[] args){
       metodosP10 obj = new metodosP10(25, 6);
       obj.asientosDefault();
       int opc;
       
       do {
           opc = obj.menu();
           switch(opc){
               case 1 -> 
                   obj.verVacios();
               case 2 -> 
                   obj.desocupar();
               case 3 ->
                   obj.ocupar();
           }
       } while(opc != 0);
   } 
}
