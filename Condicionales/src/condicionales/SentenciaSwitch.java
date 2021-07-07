
package condicionales;

import javax.swing.JOptionPane;

/*
switch(dato){
case 1: Introduccion:
        break;
case 2: Intruccion2;
        break;
case 3: Intruccion 3;
        break;
default: caseContrario;
        break;
}        
*/

public class SentenciaSwitch {
    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt((JOptionPane.showInputDialog("Digite un numero entre 1- 5")));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
            break;
            case 2: JOptionPane.showConfirmDialog(null, "Es el numero 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
            break;
            default:JOptionPane.showMessageDialog(null, "El numero no esta en la lista");
        }
        
    }
}
