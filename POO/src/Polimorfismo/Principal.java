package Polimorfismo;

/**
 *
 * @author Debian10
 */
public class Principal {
    public static void main(String[] args) {
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("sdfsd", "fwerrar", "a562");
        misVehiculos[1] = new VehiculoTurismo("asdas", "asdasd", "asdasd", 4);
        misVehiculos[2] = new VehiculoDeportivo("asd", "asdasd", "asdasd", 1500);
        misVehiculos[3] = new VehiculoFurgoneta("asda", "asd", "asdasd", 2000);
        
        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
