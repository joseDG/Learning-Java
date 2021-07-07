
package EjercicioPOOFutbol;

/**
 *
 * @author Debian10
 */
public class Medico extends Persona{
    
    private String titulacion;
    private int AñosExperiencia;

    public Medico(String titulacion, int AñosExperiencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.AñosExperiencia = AñosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Asistencia medica");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Atencion medica");
    }
    
    public void curarLesion(){
        System.out.println("Curando Lesion");
    }
    
}
