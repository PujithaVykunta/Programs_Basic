package sample;

public class InvalidRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		
		return "age should be less than 8 to join primary school  ";
	}
}
