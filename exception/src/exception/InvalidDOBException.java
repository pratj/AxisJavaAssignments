package exception;

public class InvalidDOBException extends Exception {
	public String getMessage() {
		return "Date of Birth cannot be after current date";
	}
}
