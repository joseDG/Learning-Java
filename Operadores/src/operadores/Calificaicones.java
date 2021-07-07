/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Debian10
 */
public class Calificaicones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        
        //Pedir los datos
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("\nLa nota final es: "+notaFinal);
        
    }
}
