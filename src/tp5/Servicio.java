package tp5;

public class Servicio implements Pagable{
	
	private double valor;
	private int unidadesConsumidas;
	
	public double getPrecioBase(){
		return valor * unidadesConsumidas;
	}
	
}
