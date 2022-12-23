package C04.C04_ISO2_ET02;

/**
 * Es una excepción que saltará si la suma de los angulos no es 180º.
 * 
 * @author Javier Santos Sanz y Gonzalo Prieto de la Barreda
 * @version 1.1
 */
public class SumaAnguloInvalidaException extends Exception {
	public SumaAnguloInvalidaException(String errorMessage) {
		super(errorMessage);
	}
}
