/*
 *              Throwable
Exception                      Error(Pc)
IOException             RunTimeExceotion
excepcionesverificadas Excepciones no Verificadas
 * 
 * 
 */
package practica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Debian10
 */
public class Jerarquia {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*//Excepciones Verificadas (IOException)
        //Lectura de un archivo de texto (.txt)
        BufferedReader bf = new BufferedReader(new FileReader("d:\\prueba\\texto.txt"));
        String linea;
        while ((linea=bf.readLine())!=null){
            System.out.println(linea);
        }*/
        
        //Exception no verificadas(RunTimeExcepcion)
            //Division entre cero
            int num1=5,num2=0,resultado;
            
            resultado = num1/num2;
            
            System.out.println(resultado);
    }
}
