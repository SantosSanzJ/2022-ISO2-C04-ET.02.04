package comparadorTriangulos;
import comparadorTriangulos.*;
/*
Escriba y pruebe un método que, aceptando un objeto triángulo (atributos lados y ángulos), 
determine el tipo de triángulo que es. En caso de que se les pasen números negativos
o letras se tiene que lanzar una excepción que indique esta situación.
*/

public class main {
	public static void main(String[] args) {
		double lados[] = {24.00,24.00,24.00};
		double angulos[] = {40.00,50.00,100.00};
		Triangulo t = new Triangulo(lados,angulos);
		System.out.println(t.tipos[0]);
		System.out.println(t.tipos[1]);
	}
	public static void crearTriangulo(double lados[], double angulos[]){
		
	}
}