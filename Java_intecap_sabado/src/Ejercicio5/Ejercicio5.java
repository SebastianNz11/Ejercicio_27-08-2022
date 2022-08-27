
package Ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float radio, longitud, area;
        
        System.out.println("Ingrese radio de la circunferencia: ");
        radio = entrada.nextFloat();
        
        longitud = (float) ((2 * 3.1416) * radio);
        area = (float) (3.1416 * Math.pow(radio, 2));
        
        System.out.println("La lñongitud es: " + longitud);
        System.out.println("El area es: " +area);
        
    }
}
