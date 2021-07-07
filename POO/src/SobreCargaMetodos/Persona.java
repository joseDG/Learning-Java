
package SobreCargaMetodos;


public class Persona {
    
    String nombre;
    int edad;
    String DNI;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String DNI) {
        this.DNI = DNI;
    }
    
    public void correr(){
        System.out.println("Corriendo una marathon.....");
    }
    
    public void correr(int km){
        System.out.println("estamos corriendo"+ km);
    }
}
