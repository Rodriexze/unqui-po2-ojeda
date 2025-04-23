package tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MercadoCentralTestCase {

	private Producto arroz;
	private Producto detergente;
	private Producto leche;
	private MercadoCentral mercadito;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto(10.5, 10);
		detergente = new Producto(11.5, 10);
		leche = new ProductoCoop(10,10);
		mercadito = new MercadoCentral("SuperCam", 00.00);
	}
	
	@Test
	public void testNumeroDeProductos() {
		assertEquals(0, mercadito.getNumeroDeProductos());
		mercadito.registrarProducto(arroz);
		mercadito.registrarProducto(detergente);
		assertEquals(2, mercadito.getNumeroDeProductos());
	}
	
	@Test
	public void testMontoAPagar() {
		assertEquals(0, mercadito.getMontoAPagar());
		mercadito.registrarProducto(arroz);
		mercadito.registrarProducto(detergente);
		mercadito.registrarProducto(leche);
		assertEquals(23, mercadito.getMontoAPagar());
	}
	
	@Test
	public void testStock() {
		assertEquals(10, arroz.getStock());
		assertEquals(10, detergente.getStock());
		mercadito.registrarProducto(arroz);
		mercadito.registrarProducto(detergente);
		mercadito.registrarProducto(leche);
		assertEquals(9, arroz.getStock());
		assertEquals(9, detergente.getStock());
		assertEquals(9, leche.getStock());
	}
	
}
