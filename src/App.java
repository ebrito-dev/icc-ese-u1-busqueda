import java.util.List;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List <Persona> personas = List.of(
            new Persona("Juan", 20, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 25, "M"),
            new Persona("Ana", 35, "F")
        );
        
        searchPersonas(personas);
    }

    // 1. BUSQUE UNA PERSONA con nombre "Maria"
    // RETORNE LA PERSONA SI LA ENCONTRO
    // 2. BUSQUE UNA PERSONA con nombre "Diego"
    // RETORNE LA PERSONA SI LA ENCONTRO
    // 3. BUSQUE UNA PERSONA con nombre "Ana"
    // Imprima la posicion de la persona si la encontro
    
    public static void searchPersonas(List<Persona> personas) {
        BusquedaLineal busqueda = new BusquedaLineal(personas);

        // 1. Buscar "Maria"
        Persona maria = busqueda.FindByName("Maria");
        if (maria != null) {
            System.out.println("Encontrado: " + maria);
        } else {
            System.out.println("Maria no encontrada.");
        }

        // 2. Buscar "Diego"
        Persona diego = busqueda.FindByName("Diego");
        if (diego != null) {
            System.out.println("Encontrado: " + diego);
        } else {
            System.out.println("Diego no encontrado.");
        }

        // 3. Buscar "Ana" y obtener su posición
        int posAna = busqueda.FindPosByNamePersona("Ana");
        if (posAna != -1) {
            System.out.println("Ana encontrada en la posición: " + posAna);
        } else {
            System.out.println("Ana no encontrada.");
        }
        BusquedaBinaria busquedaBinaria= new BusquedaBinaria(personas);
        int resultado = busquedaBinaria.findByName("Ana");

        if (resultado>=0) {
            System.out.println("se encontro la pos"+resultado);

            
        }else{
            System.out.println("no se encontro");


        }

        int res = busquedaBinaria.findByName("Pedro");
        //operador ternario
        //cond ? accion TRUE :accion FALSE
        System.out.println(
            res >=0
            ?"se encontro en la pos = "+ res
            :" no se encontro nada :( "      
        );

        int res2 = busquedaBinaria.findByAge(25);
        System.out.println(
            res2 >=0
            ?"se encontro en la pos = "+ res2
            :" no se encontro nada :( "      
        );

    }

}