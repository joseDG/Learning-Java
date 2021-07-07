
package Encapsulamiento;

public class Clase2 {
    public static void main(String[] args) {
        
        Clase1 cl = new Clase1();
        cl.setEdad(21);
        System.out.println("Mi edad es: " + cl.getEdad());
        
        cl.setNombre("Jose Luis");
        System.out.println("Mi nombre es: "+ cl.getNombre());
    }
}
