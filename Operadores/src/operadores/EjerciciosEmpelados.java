/*
 * Guillermo tiene N doalres. Luis tiene la mitad de lo que tiene guillermo
   Juan tiene tiene la mitad de lo que posse Luis y Guillermo juntos
   Hacer un programa que calcule cuanto tienen los tres. 
 */
package operadores;

import java.util.Scanner;

public class EjerciciosEmpelados {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.println("Digite la cantidad de Guillermo tiene N dolares");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        System.out.println("Luis tiene: " + luis);
        
        juan = (guillermo + luis)/2;
        System.out.println("Juan tiene: " + juan);
        
   
        total = guillermo+luis+juan;
        System.out.println("\nLa cantidad de dinero entre los 3 es: " + total);
        
        
    }
}
