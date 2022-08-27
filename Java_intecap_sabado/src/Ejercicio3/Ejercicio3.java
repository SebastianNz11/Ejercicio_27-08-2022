
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, num2;
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        num2 = numero;
        numero =numero * 2;
        
        System.out.println("El doble del numero es: : " +" " +numero);
        num2 = num2*3;
        System.out.println("El triple del numero es: " + " " + num2);
        
        
        
    }
}
