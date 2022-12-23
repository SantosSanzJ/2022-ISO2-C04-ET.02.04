package C04.C04_ISO2_ET02;

/**
 * Es una excepción que saltará si el ángulo es negativo.
 * 
 * @author Javier Santos Sanz y Gonzalo Prieto de la Barreda
 * @version 1.1
 */
public class AnguloInvalidoException extends Exception {
	public AnguloInvalidoException(String errorMessage) {
		super(errorMessage);
	}
}