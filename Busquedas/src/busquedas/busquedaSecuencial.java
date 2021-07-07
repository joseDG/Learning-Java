
package busquedas;

import javax.swing.JOptionPane;


public class busquedaSecuencial {
    public static void main(String[] args) {
        
        int arreglo[] = {1,5,4,3,2};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar. "));
        
        //Busqueda Secuencial
        int i=0;
        while(i<5 && band == false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }
        
        if(band == false){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion: "+(i+1));
        }
    }
}
