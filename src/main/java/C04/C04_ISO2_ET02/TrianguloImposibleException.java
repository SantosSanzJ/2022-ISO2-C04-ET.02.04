package C04.C04_ISO2_ET02;

/**
 * Es una excepción que saltará si el triangulo no cumple el teorema del coseno.
 * 
 * @author Javier Santos Sanz y Gonzalo Prieto de la Barreda
 * @version 1.1
 */
public class TrianguloImposibleException extends Exception {
	public TrianguloImposibleException(String errorMessage) {
		super(errorMessage);
	}
}
