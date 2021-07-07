
package practica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Debian10
 */
public class TryCath {
     //Se pueden declarar mas excepciones
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
    }
    
    public void leerArchivo2() {
        //Intentar
        try{
           leerArchivo(); 
        //Captura la excepcion
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se a encontrado el archivo deseado, porfavor verifica la ruta");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un aexcepcion verificada");
        //opcional se ejecuta siempre la encunetre o no la encuentre ala excepcion
        }finally{
            
        }
        
        System.out.println("Programa terminado");
        
    }
    
    public static void main(String[] args) {
        TryCath prueba = new TryCath();
        prueba.leerArchivo2();
    }
}
