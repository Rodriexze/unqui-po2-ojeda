package ar.edu.unq.po2.tp4;

public class IngresoHorasExtra extends Ingreso {
	
	private double valorHoraExtra;
	private int cantidadHorasExtra;
	
	@Override
	public double getMonto() {
		return this.getMonto() +  this.valorHorasExtraTotal();
	}
	
	public double valorHorasExtraTotal() {
		return cantidadHorasExtra * valorHoraExtra;
	}
	
	//Getter y Setter
	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(int cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
}
