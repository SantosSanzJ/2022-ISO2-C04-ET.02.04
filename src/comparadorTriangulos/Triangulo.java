package comparadorTriangulos;

import javax.print.event.PrintEvent;

public class Triangulo {
	//Declaramos las variables para evitar los "números mágicos".
	static final double ANGULOTOTAL = 180.0;
	static final double ANGULORECTO = 90.0;
	static final double MARGENERROR = 0.1;
	//Dentro de la definición de requisitos, los triángulos pueden ser incorrectos
	//o imposibles donde de verdad sabremos si lo que hacen es correcto es en el método a implementar.
	String tipos[] = new String[2];
	private double lados[] = new double[3];
	private double angulos[] = new double[3]; 
	//this.angulos[1]=Math.trunc(this.angulos[1]);

	public Triangulo(double[] lados, double[] angulos){
		// Para formar un triangulo importan las posiciones por lo que asumiremos:
		// lados[0] es el lado a, angulos[0] es alfa, lados[1] es el lado b, 
		// angulos[1] es beta, lados[2] es el lado c, angulos[2] es ganma
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
		String trianguloValido = verificarTriangulo();

		// Si no es válido el triángulo, no puede ser de un tipo
		if (trianguloValido == "Triángulo Válido"){
			tipos[0] = clasificarAngulo();
			tipos[1] = clasificarLado();
		} else {
			tipos[0] = "Triángulo imposible";
			tipos[1] = "Triángulo imposible";
		}

		return tipos;	
	}
	public String clasificarLado(){
		//Lanzar excepción si la raiz de los catetos al cuadrado es diferente de la hipotenusa.
		String tipoLado = new String();
		System.out.println("Lados");
		System.out.println(this.lados[0] == this.lados[1]);
		System.out.println(this.lados[0] == this.lados[2]);
		System.out.println(this.lados[1] == this.lados[2]);
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
		double anguloMayor = 0.0;

		for(int i = 0; i < 3; i++) {
			if (this.angulos[i] > anguloMayor) anguloMayor = this.angulos[i];
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

	public String verificarTriangulo() {
		double total = 0;

		try {
			for(int i = 0; i < 3; i++) {
				if(this.lados[i] <= 0) throw new LadoInvalidoException("Existe un lado que es menor o igual a 0."); 
			}
		}catch(LadoInvalidoException e){
			System.out.println(e.getMessage());
			return "Error Lado Invalido";
		}
		try {
			for(int i = 0; i < 3; i++) {
				total += this.angulos[i];
				if(this.angulos[i] <= 0) throw new AnguloInvalidoException("El ángulo es menor o igual a 0."); 
			}
		}catch(AnguloInvalidoException e) {
			System.out.println(e.getMessage());
			return "Error Angulo Invalido";
		}
		try {
			System.out.println("Verificar Angulo");
			System.out.println(total  - ANGULOTOTAL > MARGENERROR);
			System.out.println(total - ANGULOTOTAL < -MARGENERROR);
			if(total  - ANGULOTOTAL > MARGENERROR || total - ANGULOTOTAL < -MARGENERROR) 
				throw new SumaAnguloInvalidaException("El triángulo no suma 180º.");
		}catch(SumaAnguloInvalidaException e) {
			System.out.println(e.getMessage());
			return "Error Suma Angulos Invalidos";
		}

		try {
			if(!(verificarTrianguloTeoremaSeno())) {
				throw new TrianguloImposibleException("El triángulo no cumple el teorema del seno");
			}
		}catch(TrianguloImposibleException e) {
			System.out.println(e.getMessage());
			return "Error Triángulo imposible";
		}
		return "Triángulo Válido";
	}

	public boolean verificarTrianguloTeoremaSeno() {
		//El teorema del seno es la mejor forma de verificar si un triángulo es posible o no
		//Para poder hacerlo usando estimaciones es necesario sacar valores inferiores y superiores
		//y ver si el valor está entre estos. El valor varía mucho en función de la cercanía/lejanía 
		//con respecto a pi/2 o 90º, por lo que el margen de error en algunas ocasiones es demasiado
		//y en otras demasiado poco.
		double angulosTruncados[] = new double[3];
		double constante[] = new double[3];
		double teoremaSenoExtremos[][] = new double[3][2];
		boolean valido = true;

		//Primero truncamos el valor de los angulos a 2 decimales que es sobre lo que trabajaremos
		for (int i = 0; i < 3; i++) {
			angulosTruncados[i] = Math.round(this.angulos[i]*100);
			angulosTruncados[i] = angulosTruncados[i]/100;
		}
		//Calculamos el teorema del seno correspondiente a cada lado/ángulo
		for (int i = 0; i < 3; i++) {
			constante[i] = this.lados[i]/Math.sin(Math.toRadians(this.angulos[i]));
		}
		//Calculamos los valores extremos para poder estimar, como en 90º está el extremo de la función
		//el menor/mayor cambiará en función del grado
		for (int i = 0; i < 3; i++) {
			if(angulosTruncados[i] >= 90.00) {
				if ((angulosTruncados[i]-MARGENERROR)<90.00) {
					teoremaSenoExtremos[i][0] = lados[i]-MARGENERROR;
				}else{
					teoremaSenoExtremos[i][0] = this.lados[i]/Math.sin(Math.toRadians(angulosTruncados[i])-MARGENERROR);
				}
				teoremaSenoExtremos[i][1] = this.lados[i]/Math.sin(Math.toRadians(angulosTruncados[i])+MARGENERROR);
			}else{
				if ((angulosTruncados[i]+MARGENERROR)>90.00) {
					teoremaSenoExtremos[i][0] = lados[i]-MARGENERROR;
				}else{
					teoremaSenoExtremos[i][0] = this.lados[i]/Math.sin(Math.toRadians(angulosTruncados[i])+MARGENERROR);
				}
				teoremaSenoExtremos[i][1] = this.lados[i]/Math.sin(Math.toRadians(angulosTruncados[i])-MARGENERROR);
			}
		}
		//Finalmente, se realiza la comparación, en caso de que algún valor no coincida se evaluará en falso
		//También se usa el calcular el módulo junto con sumar 1 y 2 para poder aplicarlo sin tener en cuenta el valor de i.
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println("Seno a "+(constante[i]>teoremaSenoExtremos[(i+1)%3][0])+".");
			System.out.println("Seno b "+(constante[i]>teoremaSenoExtremos[(i+2)%3][0])+".");
			System.out.println("Seno c "+(constante[i]<teoremaSenoExtremos[(i+1)%3][1])+".");
			System.out.println("Seno d "+(constante[i]<teoremaSenoExtremos[(i+2)%3][1])+".");
			if (!(((constante[i]>teoremaSenoExtremos[(i+1)%3][0]) && (constante[i]>teoremaSenoExtremos[(i+2)%3][0]))
			&& ((constante[i]<teoremaSenoExtremos[(i+1)%3][1]) && (constante[i]<teoremaSenoExtremos[(i+2)%3][1])))) {
				valido = false;
			}
		}
		return valido;
	}
}
