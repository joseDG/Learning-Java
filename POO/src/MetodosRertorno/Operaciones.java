
package MetodosRertorno;


public class Operaciones {
    
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    
    public int resta(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    
    public int multiplicar(int numero1, int numero2){
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }
    
    public int dividir(int numero1, int numero2){
        int dividir = numero1 / numero2;
        return dividir;
    }
    
    public void mostrarResultado(int suma, int resta, int multiplicar, int dividir){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicar);
        System.out.println("La division es: " + dividir);
    }
}
