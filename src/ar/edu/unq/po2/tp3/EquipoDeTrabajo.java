package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
    private String nombre;
    private List<Persona> integrantes;

    
    public EquipoDeTrabajo(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    
    public void agregarIntegrante(Persona persona) {
        this.integrantes.add(persona);
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public double promedioEdad() {
        int sumaEdades = 0;
        for (Persona persona : integrantes) {
            sumaEdades += persona.getEdad();
        }
        return (double) sumaEdades / integrantes.size();
    }
}

