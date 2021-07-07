
package ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MetodoBurbuja {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elemtos del arreglo"));
        
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un numero .");
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo Burbuja
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if(arreglo[j] > arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        //Mostrando el arreglo ordenado
        System.out.println("Arreglo ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
