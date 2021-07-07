
package ClasesyMetodosFinal;

/**
 *
 * @author Debian10
 */
public class Cuadrado extends FiguraCerrada {
    private double area;

    public Cuadrado(double area, int nLados, double tamaño) {
        super(nLados, tamaño);
        this.area = area;
    }
    
    public void dibujar1(){
        System.out.println("Dibujamos un cuadrado.");
    }
}
