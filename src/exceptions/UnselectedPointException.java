package exceptions;

public class UnselectedPointException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnselectedPointException() {
		super("You have to select two points first");
	}
	
}
