
package operaciones;

public class Arimetica {
    
    //Atributos de clase
    int a;
    int b;
    
    //creacion del metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumaConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return sumaConRetorno();
    }
}
