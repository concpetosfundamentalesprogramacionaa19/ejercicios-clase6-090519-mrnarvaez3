/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
// desarrollar una aplicacion que me permita ingresar placas de carros.
// se asume que las placas ingresadas pertenecen a la region costa del Ecuador
// en base a la placa nuestro programa determinara y presentara la placa con la provincia a la que pertenece.
// 0 = oro
// 
        String placa;
        System.out.println("Ingrese la placa de su automovil");
        placa = entrada.nextLine();
        
        char valor = placa.charAt(0);
                
        switch(valor){
            case'E':
                System.out.printf("Su placa pertenece a Esmeraldas\nPlaca: %s",placa);
                break;
            
            case 'M':
                 System.out.printf("Su placa pertenece a Manabi\nPlaca: %s",placa);
                break;    
            case 'J':
                     System.out.printf("Su placa pertenece a Santo Domingo de los Tsachilas\nPlaca: %s",placa);
                break;
            case 'R':
                 System.out.printf("Su placa pertenece a Los Rios\nPlaca: %s",placa);
                 break;
            case 'G':
                 System.out.printf("Su placa pertenece a Guayas\nPlaca: %s",placa);
                 break;
            case 'Y':
                 System.out.printf("Su placa pertenece a Santa Elena\nPlaca: %s",placa);
                 break;
            case 'O':
                 System.out.printf("Su placa pertenece a El Oro\nPlaca: %s",placa);
                 break;
            default:
                System.out.println("Ingrese una placa que corresponda a la Costa");
                
        }
        
    }
}
