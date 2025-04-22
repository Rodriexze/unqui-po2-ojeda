package ar.edu.unq.po2.tp3;
import java.lang.String;
import java.time.LocalDate;


public class Persona {
	
	private int edad;
	private String nombre;
	private LocalDate fechaNac;
	private LocalDate fechaActual = LocalDate.now();
	
	private void calculoEdad() {
		edad = getFechaActual().getYear() - getFechaNac().getYear();
	}
	
	public boolean menorQue(Persona p1) {
		return this.getEdad() < p1.getEdad() ;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMombre() {
		return nombre;
	}
	public void setMombre(String mombre) {
		this.nombre = mombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}
	
	public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        calculoEdad();
    }
	
	public static Persona crearPersona(String nombre, LocalDate fechaNac) {
        return new Persona(nombre, fechaNac);
    }
	
}
