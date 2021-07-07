//Declaracion de las excepciones de metodos 
package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Debian10
 */
public class ExcepcionesDeMetodo {
    
    //Se pueden declarar mas excepciones
    public void leerArchivo() throws FileNotFoundException{
        File archivo = new File("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
    }
    
    public void leerArchivo2() throws FileNotFoundException{
       leerArchivo();
    }
        
    public static void main(String[] args) {
         
    }
}
