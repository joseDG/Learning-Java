/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class LllenarArreglo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantida de elementos:"));
        
        //Ceramos el arrecglo
        char[] letras = new char[nElementos];
        
        //Llenamos el arrreglo
        System.out.println("Digite los elemetos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+"Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        
        //Mostrar
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i]);
        }
        System.out.println("");
    }
}
