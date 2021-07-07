
package ClasesyMetodosFinal;

/**
 *
 * @author Debian10
 */
//final => no se peude heredar mas clases hijas de esta 
final public class FiguraCerrada extends Figura {
    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }
    
    //final => significa que no deben haber mas metodos con el mismo nombre en otras clases
    public final void dibujar(){
        System.out.println("Dibujo de una figura cerrada");
    }
}
