
package operadores;


public class ClaseMath {
    public static void main(String[] args) {
        
        //el int permite convertir a entero y asi puedo convertir al que yp necesite
        double raiz = (int)Math.sqrt(36.67);
        System.out.println(raiz);
        
        //Sacando el expoennte
        double base = 5, exponente=3;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);
        
        //Redondear los valroes
        float valor = 7.125f;
        int resultado1 = Math.round(valor);
        System.out.println(resultado1);
        
        //Numero aleatorios
        double numero = Math.random();

        System.out.println(numero);
        
        
    }
 
}
