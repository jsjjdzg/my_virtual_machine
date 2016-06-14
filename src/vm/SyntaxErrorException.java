package vm;

public class SyntaxErrorException extends RuntimeException {

	private String message;

	public SyntaxErrorException(String message) {
		super();
		this.message = "语法错误" + message;
	}
	
	public String toString() {
		return message;
	}
}
