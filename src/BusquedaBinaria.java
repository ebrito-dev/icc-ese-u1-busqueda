import java.util.ArrayList;
import java.util.List;
import models.Persona;

public class BusquedaBinaria {

    private  List<Persona>personas;
    public BusquedaBinaria(List<Persona>personas){
        this.personas= new ArrayList<>(personas);
    }

    public Integer findByName(String name){

        personas.sort((persona1,persona2) ->
            persona1.getName().compareTo(persona2.getName()));
            


        //ordenado → nombre
        //personas.sort
        //comparator.
        //);
        

        





        //busqueda binaria
        //definimos limites
        int lo = 0;
        int hi= personas.size()-1;
        //2 def bucle con su condicion

        while (lo<=hi) {

            
            //calculamos mid
            int mid = (lo+hi)/2;

            //4 preguntar si es el [mid]
            if (personas.get(mid).getName().equals(name)) {
                return mid;

                
            }
            //5 actualizar limites
            //5.1 verificar si es mayor o menor y escogr un lado
            if (personas.get(mid).getName().compareTo(name)>0) {
                //5.2 qctualizo el limite xxxx
                lo= mid +1;
                
                
            }else{
                //5.2 actualizo el limite yy
                //negativa persoan centro es menor alfabeticamente y va a la derecha
                hi = mid -1;

            }


            
        }
        return -1;

        
    }



    
}