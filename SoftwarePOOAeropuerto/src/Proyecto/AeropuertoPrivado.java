
package Proyecto;


public class AeropuertoPrivado extends Aeropuerto{
    
    private String listaempresas[] = new String[10];
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaempresas = e;
        numEmpresa = e.length;
    }
    
    public void insertarEmpresas(String e[]){
        this.listaempresas = e;
        this.numEmpresa = e.length;
    }
    
    public void insertarEmpresa(String e){
        listaempresas[numEmpresa] = e;
        numEmpresa++;
    }

    public String[] getListaempresas() {
        return listaempresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
    
    
}
