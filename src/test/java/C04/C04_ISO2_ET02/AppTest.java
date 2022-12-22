package C04.C04_ISO2_ET02;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void testExcepcionAmbosNegativos() {
		double[] lados = {-10.0,-10.0,-10.0};
		double[] angulos = {-10.0,-10.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testExcepcionNoSuma180() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {10.0,10.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC1LadoInvalido() {
		double[] lados = {0.0,10.0,10.0};
		double[] angulos = {60.0,60.0,60.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC2AnguloInvalido() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {0.0,60.0,60.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC3SumaAnguloInvalida() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {50.0,50.0,50.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC4() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {90.0,89.99,0.001};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC5AcutanguloEquilatero() {
		double[] lados = {20.0,20.0,20.0};
		double[] angulos = {60.0,60.0,60.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Acutángulo","Equilátero"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC6RectoIsosceles(){
		double[] lados = {14.14,10.0,10.0};
		double[] angulos = {90.0,45.0,45.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Recto","Isósceles"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC7ObtusanguloEscaleno() {
		double[] lados = {13.02,18.16,24.32};
		double[] angulos = {31.67,47.09,101.24};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Obtusángulo","Escaleno"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC8() {
		double[] lados = {10.00,10.00,10.00};
		double[] angulos = {80.00,80.00,80.00};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC9() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {90.0,60.0,30.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC10() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {120.0,30.0,30.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC11() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {30.0,75.0,75.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC12(){
		double[] lados = {10.0,14.14,10.0};
		double[] angulos = {45.0,90.0,45.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Recto","Isósceles"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testC13(){
		double[] lados = {10.0,10.0,14.14};
		double[] angulos = {45.0,45.0,90.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Recto","Isósceles"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	//Empieza los casos de prueba pairwise los enumeraremos como P1...P100
	@Test
	public void testP1() {
		double[] lados = {-10.0,-10.0,-10.0};
		double[] angulos = {-10.0,-10.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP2() {
		double[] lados = {-10.0,-1.0,-1.0};
		double[] angulos = {-1.0,-1.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP3() {
		double[] lados = {-10.0,0.0,0.0};
		double[] angulos = {0.0,0.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP4() {
		double[] lados = {-10.0,1.0, 1.0};
		double[] angulos = {1.0,1.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP5() {
		double[] lados = {-10.0,10.0,10.0};
		double[] angulos = {10.0,10.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP6() {
		double[] lados = {-10.0,10.0002304,10.0002304};
		double[] angulos = {10.0002304,10.0002304,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP7() {
		double[] lados = {-10.0,-10.0,-10.0};
		double[] angulos = {179.0,179.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP8() {
		double[] lados = {-10.0,-1.0,-1.0};
		double[] angulos = {180.0,180.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP9() {
		double[] lados = {-10.0,0.0,0.0};
		double[] angulos = {181.0,181.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP10() {
		double[] lados = {-10.0,1.0,1.0};
		double[] angulos = {200.0,200.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP11() {
		double[] lados = {-1.0,-1.0,0.0};
		double[] angulos = {1.0,10.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP12() {
		double[] lados = {-1.0,0.0,1.0};
		double[] angulos = {10.0,10.0002304,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP13() {
		double[] lados = {-1.0, 1.0, 10.0};
		double[] angulos = {10.0002304,179.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP14() {
		double[] lados = {-1.0,10.0,10.0002304};
		double[] angulos = {179.0,180.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP15() {
		double[] lados = {-1.0,10.0002304,-10.0};
		double[] angulos = {180.0,181.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP16() {
		double[] lados = {-1.0, -10.0, -1};
		double[] angulos = {181.0,200.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP17() {
		double[] lados = {-1.0,-1.0,0.0};
		double[] angulos = {200.0,-10.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP18() {
		double[] lados = {-1.0,0.0,1.0};
		double[] angulos = {-10.0,-1.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP19() {
		double[] lados = {-1.0,1.0,-10.0};
		double[] angulos = {-1.0,0.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	
	@Test
	public void testP20() {
		double[] lados = {-1.0,-10.0,-1.0};
		double[] angulos = {0.0,1.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP21() {
		double[] lados = {0.0,0.0,10.0};
		double[] angulos = {179.0,181.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	
	@Test
	public void testP22() {
		double[] lados = {0.0,1.0,10.0002304};
		double[] angulos = {180.0,200.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP23() {
		double[] lados = {0.0,10.0,-10.0};
		double[] angulos = {181.0,-10.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP24() {
		double[] lados = {0.0,10.0002304,-1.0};
		double[] angulos = {200.0,-1.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP25() {
		double[] lados = {0.0,-10.0,0.0};
		double[] angulos = {-10.0,0.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP26() {
		double[] lados = {0.0,-1.0,1.0};
		double[] angulos = {-1.0,1.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP27() {
		double[] lados = {0.0,0.0,-10.0};
		double[] angulos = {0.0,10.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP28() {
		double[] lados = {0.0,1.0,-1.0};
		double[] angulos = {1.0,10.0002304,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP29() {
		double[] lados = {0.0,-10.0,0.0};
		double[] angulos = {10.0,179.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP30() {
		double[] lados = {0.0,-1.0,1.0};
		double[] angulos = {10.0002304,180.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP31() {
		double[] lados = {1.0,1.0,-10.0};
		double[] angulos = {200.0,0.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP32() {
		double[] lados = {1.0,10.0,-1.0};
		double[] angulos = {-10.0,1.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP33() {
		double[] lados = {1.0,10.0002304,0.0};
		double[] angulos = {-1.0,10.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP34() {
		double[] lados = {1.0,-10.0,1.0};
		double[] angulos = {0.0,10.0002304,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP35() {
		double[] lados = {1.0,-1.0,-10.0};
		double[] angulos = {1.0,179.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP36() {
		double[] lados = {1.0,0.0,-1.0};
		double[] angulos = {10.0,180.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP37() {
		double[] lados = {1.0,1.0,0.0};
		double[] angulos = {10.0002304,181.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP38() {
		double[] lados = {1.0,-10.0,1.0};
		double[] angulos = {179.0,200.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP39() {
		double[] lados = {1.0,-1.0,10.0};
		double[] angulos = {180.0,-10.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP40() {
		double[] lados = {1.0,0.0,10.0002304};
		double[] angulos = {181.0,-1.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP41() {
		double[] lados = {10.0,10.0,0.0};
		double[] angulos = {0.0,179.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP42() {
		double[] lados = {10.0,10.0002304,1.0};
		double[] angulos = {1.0,180.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP43() {
		double[] lados = {10.0,-10.0,-10.0};
		double[] angulos = {10.0,181.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP44() {
		double[] lados = {10.0,-1.0,-1.0};
		double[] angulos = {10.0002304,200.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP45() {
		double[] lados = {10.0,0.0,0.0};
		double[] angulos = {179.0,-10.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP46() {
		double[] lados = {10.0,1.0,1.0};
		double[] angulos = {180.0,-1.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP47() {
		double[] lados = {10.0,-10.0,10.0};
		double[] angulos = {181.0,0.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP48() {
		double[] lados = {10.0,-1.0,10.0002304};
		double[] angulos = {200.0,1.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP49() {
		double[] lados = {10.0,0.0,-10.0};
		double[] angulos = {-10.0,10.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP50() {
		double[] lados = {10.0,1.0,-1.0};
		double[] angulos = {-1.0,10.0002304,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP51() {
		double[] lados = {10.0002304,10.0002304,-10.0};
		double[] angulos = {10.0002304,-10.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP52() {
		double[] lados = {10.0002304,-10.0,-1.0};
		double[] angulos = {179.0,-1.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP53() {
		double[] lados = {10.0002304,-1.0,0.0};
		double[] angulos = {180.0,0.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP54() {
		double[] lados = {10.0002304,0.0,1.0};
		double[] angulos = {181.0,1.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP55() {
		double[] lados = {10.0002304,1.0,10.0};
		double[] angulos = {200.0,10.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP56() {
		double[] lados = {10.0002304,-10.0,10.0002304};
		double[] angulos = {-10.0,10.0002304,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP57() {
		double[] lados = {10.0002304,-1.0,-10.0};
		double[] angulos = {-1.0,179.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP58() {
		double[] lados = {10.0002304,0.0,-1.0};
		double[] angulos = {0.0,180.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP59() {
		double[] lados = {10.0002304,1.0,0.0};
		double[] angulos = {1.0,181.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP60() {
		double[] lados = {10.0002304,10.0,1.0};
		double[] angulos = {10.0,200.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP61() {
		double[] lados = {-10.0,-10.0,0.0};
		double[] angulos = {181.0,10.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP62() {
		double[] lados = {-10.0,-1.0,1.0};
		double[] angulos = {200.0,10.0002304,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP63() {
		double[] lados = {-10.0,0.0,10.0};
		double[] angulos = {-10.0,179.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP64() {
		double[] lados = {-10.0,1.0,10.0002304};
		double[] angulos = {-1.0,180.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP65() {
		double[] lados = {-10.0,-10.0,-10.0};
		double[] angulos = {0.0,181.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP66() {
		double[] lados = {-10.0,-1.0,-1.0};
		double[] angulos = {1.0,200.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}@Test
	public void testP67() {
		double[] lados = {-10.0,0.0,0.0};
		double[] angulos = {10.0,-10.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP68() {
		double[] lados = {-10.0,1.0,1.0};
		double[] angulos = {10.0002304,-1.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP69() {
		double[] lados = {-10.0,10.0,-10.0};
		double[] angulos = {179.0,0.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP70() {
		double[] lados = {-10.0,10.0002304,-1.0};
		double[] angulos = {180.0,1.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP71() {
		double[] lados = {-1.0,-1.0,10.0};
		double[] angulos = {-1.0,181.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP72() {
		double[] lados = {-1.0,0.0,10.0002304};
		double[] angulos = {0.0,200.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP73() {
		double[] lados = {-1.0,1.0,-10.0};
		double[] angulos = {1.0,-10.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP74() {
		double[] lados = {-1.0,-10.0,-1.0};
		double[] angulos = {10.0,-1.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP75() {
		double[] lados = {-1.0,-1.0,0.0};
		double[] angulos = {10.0002304,0.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP76() {
		double[] lados = {-1.0,0.0,1.0};
		double[] angulos = {179.0,1.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP77() {
		double[] lados = {-1.0,1.0,-10.0};
		double[] angulos = {180.0,10.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP78() {
		double[] lados = {-1.0,10.0,-1.0};
		double[] angulos = {181.0,10.0002304,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP79() {
		double[] lados = {-1.0,10.0002304,0.0};
		double[] angulos = {200.0,179.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP80() {
		double[] lados = {-1.0,-10.0,1.0};
		double[] angulos = {-10.0,180.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP81() {
		double[] lados = {0.0,0.0,-10.0};
		double[] angulos = {10.0,0.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP82() {
		double[] lados = {0.0,1.0,-1.0};
		double[] angulos = {10.0002304,1.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP83() {
		double[] lados = {0.0,-10.0,0.0};
		double[] angulos = {179.0,10.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP84() {
		double[] lados = {0.0,-1.0,1.0};
		double[] angulos = {180.0,10.0002304,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP85() {
		double[] lados = {0.0,0.0,-10.0};
		double[] angulos = {181.0,179.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP86() {
		double[] lados = {0.0,1.0,-1.0};
		double[] angulos = {200.0,180.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP87() {
		double[] lados = {0.0,10.0,0.0};
		double[] angulos = {-10.0,181.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP88() {
		double[] lados = {0.0,10.0002304,1.0};
		double[] angulos = {-1.0,200.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP89() {
		double[] lados = {0.0,-10.0,10.0};
		double[] angulos = {0.0,-10.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP90() {
		double[] lados = {0.0,-1.0,10.0002304};
		double[] angulos = {1.0,-1.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP91() {
		double[] lados = {1.0,1.0,0.0};
		double[] angulos = {180.0,179.0,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP92() {
		double[] lados = {1.0,-10.0,1.0};
		double[] angulos = {181.0,180.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP93() {
		double[] lados = {1.0,-1.0,-10.0};
		double[] angulos = {200.0,181.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP94() {
		double[] lados = {1.0,0.0,-1.0};
		double[] angulos = {-10.0,200.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP95() {
		double[] lados = {1.0,1.0,0.0};
		double[] angulos = {-1.0,-10.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP96() {
		double[] lados = {1.0,10.0,1.0};
		double[] angulos = {0.0,-1.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP97() {
		double[] lados = {1.0,10.0002304,10.0};
		double[] angulos = {1.0,0.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP98() {
		double[] lados = {1.0,-10.0,10.0002304};
		double[] angulos = {10.0,1.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP99() {
		double[] lados = {1.0,-1.0,-10.0};
		double[] angulos = {10.0002304,10.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testP100() {
		double[] lados = {1.0,0.0,-1.0};
		double[] angulos = {179.0,10.0002304,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	//Empieza los casos de prueba each use los enumeraremos como EU1...EU10
	@Test
	public void testEU1() {
		double[] lados = {-10.0,-10.0,-10.0};
		double[] angulos = {-10.0,-10.0,-10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU2() {
		double[] lados = {-1.0,-1.0,-1.0};
		double[] angulos = {-1.0,-1.0,-1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU3() {
		double[] lados = {0.0,0.0,0.0};
		double[] angulos = {0.0,0.0,0.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU4() {
		double[] lados = {1.0,1.0,1.0};
		double[] angulos = {1.0,1.0,1.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU5() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {10.0,10.0,10.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU6() {
		double[] lados = {10.0002304,10.0002304,10.0002304};
		double[] angulos = {10.0002304,10.0002304,10.0002304};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU7() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {179.0,179.0,179.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU8() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {180.0,180.0,180.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU9() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {181.0,181.0,181.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
	@Test
	public void testEU10() {
		double[] lados = {10.0,10.0,10.0};
		double[] angulos = {200.0,200.0,200.0};
		Triangulo t = new Triangulo (lados,angulos);
		String[] resultado = {"Triángulo imposible","Triángulo imposible"};
		assertArrayEquals(resultado,t.devolverTipo());
	}
}
