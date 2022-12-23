package C04.C04_ISO2_ET02;
/**
 * Es una excepción que saltará si el lado es negativo.
 * @author Javier Santos Sanz y Gonzalo Prieto de la Barreda
 * @version 1.1
 */
public class LadoInvalidoException extends Exception {
	public LadoInvalidoException(String errorMessage) {
        super(errorMessage);
    }
}
