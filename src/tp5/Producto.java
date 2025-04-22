package tp5;

public class Producto implements Pagable{
	
	protected double precioBase;
	protected int stock;
	
	
	//Constructor
	public Producto(double precio, int stock) {
		this.precioBase = precio;
		this.stock = stock;
	}
	
	public void descontarDeStock() {
		if (stock>0) {
			stock -= 1;
		}
		System.out.print("no hay mas ;(");
	}
	
	
	//Getters and Setters
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		stock = stock;
	}

}
