package ar.edu.unq.po2.tp3;
import java.lang.String;
import java.time.LocalDate;


public class Persona {
	
	int edad;
	String mombre;
	LocalDate fechaNac;
	LocalDate fechaActual = LocalDate.now();
	
	private void calculoEdad() {
		edad = getFechaActual() - getFechaNac(); //cambviar esto
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMombre() {
		return mombre;
	}
	public void setMombre(String mombre) {
		this.mombre = mombre;
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
	
}
