
package arreglos;

import java.util.Scanner;


public class DesplazaPosicion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        ultimo = arreglo[9];
        
        for (int i = 8; i >= 0; i--) {
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;
        
        System.out.println("Nuevo arrelgle es:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"numero: "+ arreglo[i]);
        }
    }
}
