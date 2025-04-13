package ar.edu.unq.po2.tp3;

import java.lang.String;

public class Stringasd {
	
	String a = "abc";
	
	String s = a;
	
	String t;
	
	public Stringasd() {
		this.a = "abc";
		this.s = "a";
	}
	 
	public int retornaAlgo() {
		return s.length();	
	}
	
	public static void main(String[] args) {

		String a = "abc";
		
		String s = a;
		
		String t;

		
        System.out.println(s.length());
       // System.out.println(t.length());
        System.out.println(1 + a);
        System.out.println(a.toUpperCase());
        System.out.println("Libertad".indexOf("r"));
        System.out.println("Universidad".lastIndexOf('i'));
        System.out.println("Quilmes".substring(2,4));
        System.out.println((a.length() + a).startsWith("a"));
        System.out.println(s == a);
        System.out.println(a.substring(1,3).equals("bc"));  
    }

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
	
}




//Ej 4.

// s.length() -> 3
// t.length() -> error
// 1 + a -> 1abc creo 
// .toUpperCase() -> ABC
// "Libertad".indexOf("r") -> 4 (la posicion de la leta r)
// "Universidad".lastIndexOf('i') -> 7
// "Quilmes".substring(2,4) -> il (retorna la subcadena desde el indice 2 (i) hasta el indice 4 (excluido))
// (a.length() + a).startsWith("a") -> False (priemro suma a la cadena abc + a y luego pregunta si es acadena comienza con "a")
// s == a -> True (evalua si las variables apuntan a la mismo objeto en memoria y es correcto) PREGUNTAR BIEN
// a.substring(1,3).equals("bc") -> True (comapra si la subcadena "bc" es igual a "bc")

//Ej 5.
//1)- Los tipos de datos primitivos son aquellos que vienen con el lenguaje y no requieren de crear una calss para usarlos
//2)- El int es primitivo y el integger es como una extension del int (calss envolvente)
//3)- int valor default 0 ya que es un valor primitivo numerico, integer valor default null ya que integger es un objeto no un tipo numero 
//4)- 













