
package operaciones;


public class PruebaArimetica {
    
    public static void main(String[] args) {
        
        Arimetica arimetica1 = new Arimetica();
        arimetica1.a = 3;
        arimetica1.b = 5;
        arimetica1.sumar();
        
        int resultado = arimetica1.sumaConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = arimetica1.sumarConArgumentos(5, 5);
        System.out.println("resutlado con arguemntos = " + resultado);
    }
    
}
