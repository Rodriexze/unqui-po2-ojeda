package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> listaNumerica;
	
	public void ListaDeNumeros() {
		this.listaNumerica = new ArrayList<>();
	}
	
	
	public int suma() {
		int suma = 0;
		for (int numero:listaNumerica) {
			suma += numero;
		}
		return suma;
	}
	
	public int resta() {
		int resta = 0;
		for (int numero:listaNumerica) {
			resta -= numero;
		}
		return resta;
	}

	public int multiplicacion() {
		int multi = 0;
		for (int numero:listaNumerica) {
			multi *= numero;
		}
		return multi;
	}
}
