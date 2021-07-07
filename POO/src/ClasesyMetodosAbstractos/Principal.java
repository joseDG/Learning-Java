/*
 * Las clases y metodos Abstractos:
 * Se utilizan solo como super clases.
 * No se pueden instanciar objetos.
 * Sirve para proporcionar una super clase apropiada a partir de la cual hereda otra clase.
 */
package ClasesyMetodosAbstractos;


public class Principal {
    public static void main(String[] args) {
        
        Planta pt = new Planta();
        AnimalCarnivoro ani = new AnimalCarnivoro();
        
        pt.alimentarse();
        ani.alimentarse();
    }
}
