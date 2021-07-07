
package Estaticos;


public class estaticos {
    //Los metodos estaticos no es necesario instanciarlos
    //Los metodos estaticos son dueños de su propia clase.
    
    private static String frase = "Primera frase";
    
    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    
    public static void main(String[] args) {
        System.out.println(estaticos.frase);
        System.out.println(estaticos.sumar(10, 5));
    }
}
