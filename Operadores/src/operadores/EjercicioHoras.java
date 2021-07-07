
package operadores;

import java.util.Scanner;


public class EjercicioHoras {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        
        System.out.println("Ingrese las horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("\nEl equivalante es: ");
        System.out.println("Semanas: "+ semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        
        
        
        
        
        
        
    }
}
