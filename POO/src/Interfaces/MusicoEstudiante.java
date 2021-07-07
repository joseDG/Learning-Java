
package Interfaces;


public class MusicoEstudiante implements Musico, Estudiante{
    
    @Override
    public void hablar(){
        System.out.println("Hablar");
    }
    
    @Override
    public void tocarMusica(){
        System.out.println("Estoy tocando la guitarra");
    }
    
    @Override
    public void estudiar(){
        System.out.println("Estoy estudiando programacion");
    }
}
