
package MetodosRertorno;

import ClaseYobjetos.Operacion;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        Operaciones op = new Operaciones();
        
        System.out.println("La suma es: "+ op.sumar(n1, n2));
        System.out.println("La resta es: "+ op.resta(n1, n2));
        System.out.println("La Multiplicacion es : "+ op.multiplicar(n1, n2));
        System.out.println("La Division es: " + op.dividir(n1, n2));
    }
}
