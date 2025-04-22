package ar.edu.unq.po2.tp4;

public class Trabajador {
	
	private Ingreso ingresosPercividos;

	public double getTotalPercibido() {
		return this.getIngresosPercividos().getMonto() + IngresoHorasExtra.getMonto();
	}
	
	public Ingreso getMontoImponible() {
		return this.getIngresosPercividos();
	}
	
	public double getMontoAPagar() {
		return this.getMontoImponible().getMonto() * 0.2;
	}
	
	//Getter y Setter
	public Ingreso getIngresosPercividos() {
		return ingresosPercividos;
	}

	public void setIngresosPercividos(Ingreso ingresosPercividos) {
		this.ingresosPercividos = ingresosPercividos;
	}
}
