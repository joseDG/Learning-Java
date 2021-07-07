/*
 * Herencia Multiple: hace referenci a la caracteristicas de los lenguajes
 * de programacion orientadas a objetos en la que una clase puede heredar 
 * atributos y metods de mas de una super clase
    
   permite simular la herencia multiple.
   La interfaz solo es publico o default
   todos sus metodos son abstractos
   todos sus atributos son final (constantes)
 */
package Interfaces;

public class Principal {
    public static void main(String[] args) {
        
        MusicoEstudiante mse = new MusicoEstudiante();
        
        mse.hablar();
        mse.estudiar();
        mse.tocarMusica();
    }
}
