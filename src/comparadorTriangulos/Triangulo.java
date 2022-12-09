package comparadorTriangulos;

public class Triangulo {
	//Declaramos las variables para evitar los "números mágicos".
	static final double ANGULOTOTAL = 180.0;
	static final double ANGULORECTO = 90.0;
	static final double MARGENERROR = 0.01;
	//Dentro de la definición de requisitos, los triángulos pueden ser incorrectos
	//o imposibles donde de verdad sabremos si lo que hacen es correcto es en el método a implementar.
	String tipos[] = new String[2];
	private double lados[] = new double[3];
	private double angulos[] = new double[3]; 
	public Triangulo(double[] lados, double[] angulos){
		this.lados = lados;
		this.angulos = angulos;
		this.tipos = devolverTipo();
	}
	
	public double[] getLados() {
		return lados;
	}

	public double[] getAngulos() {
		return angulos;
	}
	
	public String[] devolverTipo(){
		//Primer valor para ver su tipo dependiendo de sus lados y el segundo depende de sus ángulos.
		String tipos[] = new String[2];
		tipos[0] = clasificarLado();
		tipos[1] = clasificarAngulo();
		return tipos;	
	}
	public String clasificarLado(){
		//Lanzar excepción si la raiz de los catetos al cuadrado es diferente de la hipotenusa.
		String tipoLado = new String();
		try {
			for(int i = 0; i < 3; i++) {
				if(this.lados[i] <= 0) throw new LadoInvalidoException("Existe un lado que es menor o igual a 0."); 
			}
		}catch(LadoInvalidoException e){
			System.out.println(e.getMessage());
		}
		if(this.lados[0] == this.lados[1] && this.lados[0] == this.lados[2]) {
			tipoLado = "Equilátero";
		}else if(this.lados[0] == this.lados[1] || this.lados[0] == this.lados[2] ||
		this.lados[1] == this.lados[2]) {
			tipoLado = "Isósceles";
		}else {
			tipoLado = "Escaleno";
		}
		return tipoLado;
	}

	public String clasificarAngulo() {
		String tipoAngulo = new String();
		double total = 0;
		double anguloMayor = 0.0;
		try {
			for(int i = 0; i < 3; i++) {
				total += this.angulos[i];
				if (this.angulos[i] > anguloMayor) anguloMayor = this.angulos[i];
				if(this.angulos[i] <= 0) throw new AnguloInvalidoException("El ángulo es menor o igual a 0."); 
			}
		}catch(AnguloInvalidoException e) {
			System.out.println(e.getMessage());
			return "Error Angulo Invalido";
		}
		try {
			if(total  - ANGULOTOTAL > MARGENERROR || total - ANGULOTOTAL < -MARGENERROR) 
				throw new SumaAnguloInvalidaException("El triángulo no suma 180º.");
		}catch(SumaAnguloInvalidaException e) {
			System.out.println(e.getMessage());
			return "Error Suma Angulos Invalidos";
		}
		if(anguloMayor > ANGULORECTO + MARGENERROR){
			tipoAngulo = "Obtusángulo";
		}else if(anguloMayor > ANGULORECTO - MARGENERROR){
			tipoAngulo = "Recto";
		}else {
			tipoAngulo = "Acutángulo";
		}			
		return tipoAngulo;
	}
}
