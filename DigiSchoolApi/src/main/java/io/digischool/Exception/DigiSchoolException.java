package io.digischool.Exception;

public class DigiSchoolException extends Exception {
	private static final long serialVersionUID = 1997753363232807009L;

	public DigiSchoolException(String message) {
		super(message);
	}

	public DigiSchoolException(Throwable cause) {
		super(cause);
	}

	public DigiSchoolException(String message, Throwable cause) {
		super(message, cause);
	}

}
