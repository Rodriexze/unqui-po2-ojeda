package ar.edu.unq.po2.tp3;

public class Point {

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private int x = 0;
	private int y = 0;

	public void crearPunto() {
		this.x = 0;
		this.y = 0;
	}

	public void moverPunto(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
	
	public static Point sumarPunto(int x, int y, Point punto) {
		return new Point( x + punto.x, y + punto.y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static void main(String[] args) {	
		Point p1 = new Point(3,4);
		Point resultado = Point.sumarPunto(2,3,p1);
		System.out.println(resultado);
	}
}
