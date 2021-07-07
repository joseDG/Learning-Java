
package EjercicioCuentaBancaria;


public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public double consultarSaldo(int n){
        return cuentas[n].getSaldo();
    }
    
    public void ingresarDinero(int n, double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirarDinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
    
}
