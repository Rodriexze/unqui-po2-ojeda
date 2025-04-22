package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<>();
	
	//constructor
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	//agrega un producto a la lista productos
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	//cantidad de productos en la lista productos
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	//precio total de la lista de productos
	public double getPrecioTotal() {
		double suma = 0;
			for (Producto producto : productos) {
			suma += producto.getPrecio();
		}
	return suma;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
