package ar.edu.unq.po2.tp3;


public class String {
	
	java.lang.String saludo = "hola";
	
	java.lang.String a = "abc";
	
	java.lang.String s = a;
	
	String t;
	 
	public int retornaAlgo() {
		return s.length();
	}
}
//Ej 4.

// s.length() -> da 1 ya que el largo del striung es solo a
// t.length() -> vacio ya que no esta declarardo ni inicializada
// 1 + a -> abc1 creo 
// .toUpperCase() -> ABC
// "Libertad".indexOf("r") -> 4 (la posicion de la leta r)
// "Universidad".lastIndexOf('i') -> 2
// "Quilmes".substring(2,4) -> il (retorna la subcadena desde el indice 2 (i) hasta el indice 4 (excluido))
// (a.length() + a).startsWith("a") -> True (priemro suma a la cadena abc + a y luego pregunta si es acadena comienza con "a")
// s == a -> True (evalua si las variables apuntan a la mismo objeto en memoria y es correcto) PREGUNTAR BIEN
// a.substring(1,3).equals("bc") -> True (comapra si la subcadena "bc" es igual a "bc")

//Ej 5.
//1)- Los tipos de datos primitivos son aquellos que vienen con el lenguaje y no requieren de crear una calss para usarlos
//2)- El int es primitivo y el integger es como una extension del int (calss envolvente) -> PREGUNTAR
//3)- int valor default 0 ya que es un valor primitivo numerico, integer valor default null ya que integger es un objeto no un tipo numero 
//4)- 













