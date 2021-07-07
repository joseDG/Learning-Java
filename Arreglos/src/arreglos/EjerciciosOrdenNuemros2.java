
package arreglos;

import java.util.Scanner;


public class EjerciciosOrdenNuemros2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("El resutlado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]+ " ");
            System.out.println(numeros[9-i]+ " ");
        }
        System.out.println("");
    }
}
