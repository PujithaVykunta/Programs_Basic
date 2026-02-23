package sample;

public class InvalidAgeException  extends Exception{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public String getMessage() {
	
	return "the age should be greater than 18";
}
}
