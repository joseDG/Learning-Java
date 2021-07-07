
package operadores;

import java.util.Scanner;

public class EjercicioCompañiaAutos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // TODO code application logic here
        final int salario = 1000;
        int nCarrosVendidos;
        float costoCarro, salarioTotal;
        
        System.out.println("Digite el total de carros vendidos: ");
        nCarrosVendidos = entrada.nextInt();
        System.out.println("Digite el coste del carro: ");
        costoCarro = entrada.nextFloat();
        
        salarioTotal = salario + (nCarrosVendidos*150) + (0.05f*costoCarro*nCarrosVendidos);
        
        System.out.println("\nEl salario del empleado es: " + salarioTotal);
        
        
        
        
    }
    
}
