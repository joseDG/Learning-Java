/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Debian10
 */
public class VehiculoDeportivo extends Vehiculo {
    
    public int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override
     public String mostrarDatos(){
         return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCilindraje: "+cilindrada;
    }
    
}
