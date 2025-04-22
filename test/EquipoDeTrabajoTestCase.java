import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Persona;

import java.time.LocalDate;

public class EquipoDeTrabajoTestCase {

	    private EquipoDeTrabajo equipo;
	    private Persona persona1;
	    private Persona persona2;
	    private Persona persona3;
	    private Persona persona4;
	    private Persona persona5;

	    @BeforeEach
	    public void setUp() {
	        equipo = new EquipoDeTrabajo("Dream Team");

	        
	        persona1 = Persona.crearPersona("Rodrigo", LocalDate.of(1990, 5, 20));
	        persona2 = Persona.crearPersona("Pedro", LocalDate.of(1985, 8, 15));
	        persona3 = Persona.crearPersona("Juan", LocalDate.of(2000, 3, 10));
	        persona4 = Persona.crearPersona("Ignacio", LocalDate.of(1995, 11, 25));
	        persona5 = Persona.crearPersona("Estefania", LocalDate.of(1988, 7, 30));

	       
	        equipo.agregarIntegrante(persona1);
	        equipo.agregarIntegrante(persona2);
	        equipo.agregarIntegrante(persona3);
	        equipo.agregarIntegrante(persona4);
	        equipo.agregarIntegrante(persona5);
	    }

	    @Test
	    public void testNombreDelEquipo() {
	        assertEquals("Dream Team", equipo.getNombre());
	    }

	    @Test
	    public void testPromedioEdad() { //promedio manual
	        double promedioEsperado = (persona1.getEdad() + persona2.getEdad() + persona3.getEdad() + persona4.getEdad() + persona5.getEdad()) / 5.0;

	        //promedio esperado
	        assertEquals(promedioEsperado, equipo.promedioEdad());
	    }
	
}
	

