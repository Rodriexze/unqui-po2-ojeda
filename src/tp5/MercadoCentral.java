package tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {
	
	private double montoAPagar;
	private List<Producto> productosAComprar = new ArrayList<>();
	
	//por si las dudas pensaba recorrer la lista y tirar el total pero ya registrarlo hace eso de a uno 
	public void agregarProducto(Producto producto) {
		productosAComprar.add(producto);
	}
	
	public void registrarProducto(Producto producto) {
		producto.descontarDeStock();
		montoAPagar = montoAPagar + producto.getPrecioBase();
	}
}
