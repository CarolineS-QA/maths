package com.qa.main;

public class BigBoiFirstException extends Exception {
	// exceptions like having an ID
	private static final long serialVersionUID = -6159273108740933355L;

	/**
	 * Constructs a "BigBoiFirstException" with no detail message
	 * 
	 */
	public BigBoiFirstException() {
		super();
	}

	// Constructs the exception with an error message

	public BigBoiFirstException(String message) {
		super(message);

	}

}
