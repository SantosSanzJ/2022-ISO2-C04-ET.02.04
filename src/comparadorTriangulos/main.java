package comparadorTriangulos;
import comparadorTriangulos.*;
/*
Escriba y pruebe un método que, aceptando un objeto triángulo (atributos lados y ángulos), 
determine el tipo de triángulo que es. En caso de que se les pasen números negativos
o letras se tiene que lanzar una excepción que indique esta situación.
*/

public class main {
	public static void main(String[] args) {
		double lados[] = {10.00,10.00,10.00};
		double angulos[] = {60.00,60.00,60.00};
		crearTriangulo(lados,angulos);
	}
	public static void crearTriangulo(double lados[], double angulos[]){
		Triangulo t = new Triangulo(lados,angulos);
		System.out.println(t.tipos[0]);
		System.out.println(t.tipos[1]);
	}
}