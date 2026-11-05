import java.util.List;
import models.Persona;

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    }
    

    // BUSQUE UNA PERSONA
    // RETORNE LA PERSONA SI LA ENCONTRO
    // RETORNE --NULL-- SI NO LA ENCONTRO

    public Persona FindByName(String name) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equals(name)) {
                return personas.get(i);
            }
        }
        return null;
    }

    // BUSQUE LAS POS DE LA PEROSNA
    // RETORNE LA POS DE LA PERSONA SI LA ENCONTRO
    // RETORNE -- -1 -- SI NO LA ENCONTRO

    public Persona FindPosByNamePos(String name) {
        for (Persona persona : personas) {
            if (persona.getName().equals(name)) {
                return persona.indexOf(persona);
            }
        }
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
