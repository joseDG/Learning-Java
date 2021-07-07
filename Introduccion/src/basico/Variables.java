
package basico;

import java.util.Scanner;
import javax.swing.JOptionPane;

/* TIPOS DE DATOS PRIMITIVOS
    long = 64bits
    int =  32bits
    short = 16bits
    byte = 8 bits
-----------------------------
    float decimal =  3.45f
    double  = 12.3
-----------------------------
    char = caracteres;
----------------------------
    Boolean = TRUE / FALSE
*/

/*TIPOS DE DATOS NO PRIMITIVOS
    Integer numero = 10
    String palabra = "Hola como estas"
*/

/*
    CONTANTES
    final int numero = 10
*/

public class Variables {
    public static void main(String[] args) {
        
        //double entero = 12.25;
        
        //System.out.println("Numero entero: " + entero);
        
//        Scanner entrada = new Scanner(System.in);
//        char letra;
        
//        System.out.println("Digite la letra");
//        letra = entrada.next().charAt(1);
        
//        System.out.println("La cadena es: " + letra);
        
        //Ingresando por medio de JOption Pane
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        
        //Mostrar lso valores
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es : "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        
        
    }
}
