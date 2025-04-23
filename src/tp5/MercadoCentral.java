package tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {

	private String nombre;
	private double montoAPagar;
	private List<Producto> productosAComprar;
	
	//Constructor del mercado que con el se crea la lista de productos
	public MercadoCentral(String nombre, double montoAPagar) {
		super();
		this.nombre = nombre;
		this.montoAPagar = montoAPagar;
		this.productosAComprar = new ArrayList<>();
	}
	
	//por si las dudas pensaba recorrer la lista y tirar el total pero ya registrarlo hace eso de a uno 
	public void agregarProducto(Producto producto) {
		productosAComprar.add(producto);
	}
	
	//Registra el producto en la caja descuenta del Stock y suma a monto a pagar el valor del producto
	public void registrarProducto(Producto producto) {
		producto.descontarDeStock();
		this.agregarProducto(producto);
		montoAPagar = montoAPagar + producto.getPrecioBase();
	}
	
	//cantidad de productos en la lista productos
	public int getNumeroDeProductos() {
		return this.productosAComprar.size();
	}
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	public List<Producto> getProductosAComprar() {
		return productosAComprar;
	}

	public void setProductosAComprar(List<Producto> productosAComprar) {
		this.productosAComprar = productosAComprar;
	}
}
