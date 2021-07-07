/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Debian10
 */
public class EliminarArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion;
        
        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". Digite un numero. ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Pedimos la posicon
        do{
            System.out.println("Digite la poscion(0-9): ");
            posicion = entrada.nextInt();
        }while(posicion<0 || posicion>9);
        
        //Eliminado el elemto de la posicon 
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i+1];
        }
        
        System.out.println("El arreglo queada: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(i+". Elemnto: "+ arreglo[i]);
        }
    }
}
