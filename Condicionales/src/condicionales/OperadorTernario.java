
package condicionales;

import javax.swing.JOptionPane;

/**
 * El operador ternario
 * valor = (condicion) ? valor1 : valor2
 * @author Debian10
 */
public class OperadorTernario {
    public static void main(String[] args) {
        
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        //mensaje = (numero%2==0) ? "Es par" : "Es Impar";
        //JOptionPane.showMessageDialog(null, mensaje);
        
        JOptionPane.showMessageDialog(null, (numero%2==0) ? "Es par" : "Es impar");
        
    }
}
