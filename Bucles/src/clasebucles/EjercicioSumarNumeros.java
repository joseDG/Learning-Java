/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasebucles;

import javax.swing.JOptionPane;


public class EjercicioSumarNumeros {
    public static void main(String[] args) {
        
        int numero, suma=0;
        
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            suma += numero; 
        }
        
        System.out.println("La suma es: " + suma);
    }
}
