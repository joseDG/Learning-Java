
package practica;

import java.util.Scanner;

/**
 *
 * @author Debian10
 */
public class ThrowExcepcionesPersonalizadas {
    private int numero;
    private Scanner entrada;
    
    public void instroducirNumeros() throws Excepcion0{
         entrada = new Scanner(System.in);
         
         do{
             System.out.print("Digite un numero: ");
             numero = entrada.nextInt();
             
             if(numero== 0){ //Quiero que se produsca una exceocion personalizada
                 throw new Excepcion0();
             }
         }while(numero!=0 && numero!=1);
    }
    
    public static void main(String[] args) {
       
        ThrowExcepcionesPersonalizadas prueba = new ThrowExcepcionesPersonalizadas();
        
        try {
             prueba.instroducirNumeros();
        } catch (Excepcion0 e) {
            System.out.println("ha introducicdo el numero 0");
        }
        
        System.out.println("Programa terminado"); 
    }
}
