
package ClaseYobjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Creacion de Metodos
    
    //Metodo para que el usuario pida numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digiet un numero: "));
    }
    
    //Metodo sumar ambos numeros
    public void sumar(){
        suma = numero1 + numero2;
    }
    
    public void restar(){
        resta = numero1 - numero2;
    }
    
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    
    public void dividir(){
        division = numero1 / numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La seuma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        System.out.println("La division es: "+ division);
    }
        
    
}
