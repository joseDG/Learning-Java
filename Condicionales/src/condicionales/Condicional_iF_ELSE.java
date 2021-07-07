
package condicionales;

import javax.swing.JOptionPane;


public class Condicional_iF_ELSE {
    public static void main(String[] args) {
        /*
        == igualdad
        != diferente
        >= mayor igual
        <= menor igual
        */
        
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        if(numero != dato){
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es igual ");
        }
    }
}
