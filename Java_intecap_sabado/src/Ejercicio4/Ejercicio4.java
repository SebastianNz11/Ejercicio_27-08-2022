
package Ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float gradosC;
        float faren;
        
        System.out.println("Ingrese grados centigrados: ");
        gradosC = entrada.nextFloat();
        
        faren = 32 +(9* (gradosC/5));
        
        System.out.println("Los grados en Fahrenheit son: " +" " + faren);
        
        
                
    }
}
