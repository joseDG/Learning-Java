/*
 * try-cach excepciones no verificadas 
 */
package practica;

import javax.swing.JOptionPane;

/**
 *Try catch para excepciones no verificadas
 */
public class TryCath_no {
    
    public void operaciones(){
        int num1=5, num2=0;
        
        int resultado = num1/num2;
        
        System.out.println(resultado);
    }
    
    public void operaciones2(){
        try{
            operaciones();
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Error, ha intentado dividir un numero entero 0");
        }
       
        System.out.println("Programa terminado...");
    }
    
    public static void main(String[] args) {
        TryCath_no prueba = new TryCath_no();
        
        prueba.operaciones2();
    }
}
