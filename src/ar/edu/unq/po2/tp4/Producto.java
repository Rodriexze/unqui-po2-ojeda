package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {
	private String nombre;
	protected double precio;
	public boolean perteneceAPreciosCuidados;
	private double descuento = 1;
	
	//constructores
	public Producto(String nombre,double precio, boolean preciosCuidperteneceAPreciosCuidadosados) {
		this.nombre = nombre; 
	    this.precio = precio; 
	    this.perteneceAPreciosCuidados = preciosCuidperteneceAPreciosCuidadosados;
	}
	
	public Producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void aumentarPrecio(double aumentoNeto) {
		precio += aumentoNeto;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isPerteneceAPreciosCuidados() {
		return perteneceAPreciosCuidados;
	}
	public void setPerteneceAPreciosCuidados(boolean perteneceAPreciosCuidados) {
		this.perteneceAPreciosCuidados = perteneceAPreciosCuidados;
	}

	public boolean esPrecioCuidado() {
		return this.isPerteneceAPreciosCuidados();
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
