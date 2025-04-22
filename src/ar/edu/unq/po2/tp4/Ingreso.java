package ar.edu.unq.po2.tp4;

import java.time.LocalDate;
import java.time.Month;

public class Ingreso {
	
	private Month mes;
	private double monto;
	private String concepto;
	
	
	//Getters y Setters
	public Month getMes() {
		return mes;
	}
	public void setMes(Month mes) {
		this.mes = mes;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
}
