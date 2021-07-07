
package Proyecto;

import java.util.Scanner;

public class Principal {
    
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4;//numero de aeropuertos.
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main(String[] args) {
        
        //Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        menu();
         
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(80000000, "Jose Diaz", "Loja", "Ecaudor");
        aero[0].insertarCompañia(new Compañia("AeroPeru"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Ecuador", 180.90, 120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "España", 500.90, 180));
        aero[0].getCompañia("Aeroperu").getVuelo("IB20").insertarPasajero(new Pasajero("Mateo", "20BGHP", "Ecuatoriano"));
        aero[0].getCompañia("Aeroperu").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "50BKL2", "Mexicano"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Elena", "80BKM6", "Peruana"));
        
        aero[1] = new AeropuertoPrivado("Central Ciudad Real", "Loja", "España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        String empresas[] = {"Cobresol", "Aguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025", "Madrid", "Buenos Aires", 150.00, 180));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Andres", "ASDASD256", "Español"));
        
        
        aero[2] = new AeropuertoPublico(20000000, "Aeropuerto Bogota", "Loja", "Colombia");
        aero[2].insertarCompañia(new Compañia("AeroColombia"));
        aero[2].insertarCompañia(new Compañia("VuelaBogota"));
        aero[2].getCompañia("AeroColombia").insertarVuelo(new Vuelo("IB20", "Bogota", "Lima", 150.90, 150));
        aero[2].getCompañia("AeroColombia").insertarVuelo(new Vuelo("IB21", "Bogota", "Ecuador", 180.90, 120));
        aero[2].getCompañia("AeroColombia").getVuelo("AE030").insertarPasajero(new Pasajero("Mariana", "20BGHP", "Ecuatoriano"));
        aero[2].getCompañia("AeroColombia").getVuelo("AE030").insertarPasajero(new Pasajero("Esperanza", "50BKL2", "Mexicano"));
        
        aero[3] = new AeropuertoPublico(20000000, "Aeropuerto Mexico", "Loja", "Culata");
        aero[3].insertarCompañia(new Compañia("AeroMexico"));
        aero[3].insertarCompañia(new Compañia("VuelaMexico"));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IM20", "Mexico", "Lima", 150.90, 150));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IM21", "Mexico", "Ecuador", 180.90, 120));
        aero[3].getCompañia("AeroMexico").getVuelo("ME030").insertarPasajero(new Pasajero("Aguisto", "20BGHP", "Ecuatoriano"));
        aero[3].getCompañia("AeroMexico").getVuelo("ME030").insertarPasajero(new Pasajero("Jorge", "50BKL2", "Mexicano"));
        
    }
    
    public static void menu(){
        String nombreAeropuerto;
        int opcion;
        Aeropuerto aeropuerto;
        
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ver Aeropuertos gestionados (Publicos o Privados)");
            System.out.println("2. Ver empresas (Privado) o subvencion(Publico)");
            System.out.println("3. Listas compañias de un Aeropuerto");
            System.out.println("4. Listas de vuelos por Compañia");
            System.out.println("5. Listar posibles vuelos de origen a Destino");
            System.out.println("6. Salir");
            System.out.println("Opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: mostrarAeropuerto(aeropuertos);
                        break;
                case 2: mostrarPatrocinio(aeropuertos);
                        break;
                case 3: entrada.nextLine();
                        System.out.println("\nDigite el nombre del Aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if(aeropuerto == null){
                            System.out.println("El Aeropuerto no Existe");
                        }else{
                            mostrarCompañias(aeropuerto);
                        }
                        break;
                case 4: /////
                        break;
                case 5: /////
                        break;
                case 6: break;
                default:System.out.println("Error, Se equivoco de opinion de menu");
            }
            System.out.println("");
        }while(opcion!= 6);
    }
    
    public static void mostrarAeropuerto(Aeropuerto aeropuertos[]){
        for (int i = 0; i < aeropuertos.length; i++) {
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }else{
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());   
            }
            System.out.println("");
        }
    }
    
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        
        for (int i = 0; i < aeropuertos.length; i++) {
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado: "+ aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaempresas();
                System.out.println("Empresas: ");
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            }else{
                System.out.println("Aeropuerto Publico: "+ aeropuertos[i].getNombre());
                System.out.println("Subvencion: "+ ((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        //Realizar una busqueda secunecial
        while((!encontrado) && (i<aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }
    
    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("\nLas compañias del aeropuerto: "+aeropuerto.getNombre());
        for (int i = 0; i < aeropuerto.getNumCompañia(); i++) {
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }
}
