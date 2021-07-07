
package busquedas;

import javax.swing.JOptionPane;

/**
 * El arreglo debe estar en orden forma creciente
 * Se puede utilziar el ordenamiento en burbuja o seleccion pero debe estar ordenado
 * @author Debian10
 */
public class busquedaBinaria {
    public static void main(String[] args) {
        
        int arreglo[] = {1,2,3,4,5};
        int dato,inf,sup,mitad,i;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        
        //Busqueda Binaria
        inf = 0;
        sup =5;
        i=0;
        
        mitad = (inf+sup)/2;
        while(inf<=sup && i<5){
            if(arreglo[mitad] == dato){
                band = true;
                break;
            }
            if(arreglo[mitad] > dato){
                sup = mitad;
                mitad = (inf+sup)/2;
            }
            if(arreglo[mitad] < dato){
                inf = mitad;
                mitad = (inf+sup)/2;
            }
            i++;
        }
        if(band == true){
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la psoicion: "+mitad);
        }else{
            JOptionPane.showMessageDialog(null, "No hemos encontrado el numero en el arreglo: ");
        }
    }
}
