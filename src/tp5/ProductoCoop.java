package tp5;

public class ProductoCoop extends Producto implements Pagable{
	
	private double descuento = 0.1;
	
	public ProductoCoop(double precio, int stock) {
		super(precio, stock);	
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecioBase() {
		return this.precioBase * this.descuento;
	}
	
}

