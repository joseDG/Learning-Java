
package clasebucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Debian10
 */
public class EjercicioNumeroPositivoNegativo {
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero " + numero + "es Positivo");
            }else{
                System.out.println("El numero "+ numero + "es Negativo");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
    }
}
