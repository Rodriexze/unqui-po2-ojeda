package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrimeraNEcesidad, double descuento) {
		super(nombre, precio, esPrimeraNEcesidad);
		setDescuento(descuento);
	}
	
	@Override
	public void setPerteneceAPreciosCuidados(boolean perteneceAPreciosCuidados) {
		this.perteneceAPreciosCuidados = true;
	}

	@Override
	public double getPrecio() {
		return precio * getDescuento();
	}
	
}
