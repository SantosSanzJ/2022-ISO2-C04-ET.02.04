package comparadorTriangulos;
import comparadorTriangulos.*;
/*
Escriba y pruebe un método que, aceptando un objeto triángulo (atributos lados y ángulos), 
determine el tipo de triángulo que es. En caso de que se les pasen números negativos
o letras se tiene que lanzar una excepción que indique esta situación.
*/
//Ejemplos de triángulos válidos
//{4.00,3.00,5.00}{53.13,36.87,90.00}
//{14.14,10.00,10.00}{90.00,45.00,45.00}
//{13.02,18.16,24.32}{31.67,47.09,101.24}
//{20.00,20.00,20.00}{60.00,60.00,60.00}
public class main {
	public static void main(String[] args) {
		double lados[] = {10.00,14.14,10.00};
		double angulos[] = {45.00,90.00,45.00};
		crearTriangulo(lados,angulos);
	}
	public static void crearTriangulo(double lados[], double angulos[]){
		Triangulo t = new Triangulo(lados,angulos);
		System.out.println(t.tipos[0]);
		System.out.println(t.tipos[1]);
	}
}