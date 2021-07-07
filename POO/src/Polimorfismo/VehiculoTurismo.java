/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;


public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
         return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nNumero de puertas: "+nPuertas;
    }
    
    
}
