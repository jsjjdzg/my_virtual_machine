package vm;

public class TypeErrorException extends RuntimeException {

	private String message;



	public TypeErrorException(String expecting, String encoutered, String context) {
		super();
		message = "类型错误：Expecting " + expecting + " Type, but encoutered "
				+ encoutered + " Type, at " + context;
	}

	
	public String toString() {
		return message;
	}
	
	
}
