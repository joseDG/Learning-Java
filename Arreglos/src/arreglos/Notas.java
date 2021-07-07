
package arreglos;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float primer[], segundo[], tercero[];
        float sumaPrimer = 0, sumaSegundo=0, sumaTercero=0;
        float promedioPrimer, promedioSegundo, promedioTercer, sumaAlumno, promedioAlumno;
        int posicion;
        
        //creacion de los elementos 
        primer = new float[5];
        segundo = new float[5];
        tercero = new float[5];
        
        System.out.println("Digite las notas del primer trimestre: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno ["+i+"]: ");
            primer[i] = entrada.nextFloat();
            
            sumaPrimer += primer[i]; //suma toda las notas del trimestre
        }
        
        System.out.println("Digite las notas del segundo trimestre: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno ["+i+"]: ");
            primer[i] = entrada.nextFloat();
            
            sumaSegundo += segundo[i]; //suma toda las notas del trimestre
        }
        
        System.out.println("Digite las notas del tercer trimestre: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno ["+i+"]: ");
            primer[i] = entrada.nextFloat();
            
            sumaTercero += tercero[i]; //suma toda las notas del trimestre
        }
        
        //Sacamos los promedio
        promedioPrimer = sumaPrimer / 5;
        promedioSegundo = sumaSegundo / 5;
        promedioTercer = sumaTercero / 5;
        
        //Ahorro pedimos la posicion del alumno N
        do{
            System.out.println("\nDigite la posicion del alumno(0-4), para sacar el promedio: ");
            posicion = entrada.nextInt();
        }while(posicion<0 || posicion > 4);
        
        //Sacamos la suma de las notas del alumno
        sumaAlumno = primer[posicion] + segundo[posicion] + tercero[posicion];
        promedioAlumno = sumaAlumno/3;
        
        System.out.println("\nMostrando los datos requeridos");
        System.out.println("Promedio Primer Trimestre: "+promedioPrimer);
        System.out.println("Promedio Segundo Trimestre: "+promedioSegundo);
        System.out.println("Promedio Tercero Trimestre: "+promedioTercer);
        System.out.println("Promedio del alumno: " + promedioAlumno);
    }
}
