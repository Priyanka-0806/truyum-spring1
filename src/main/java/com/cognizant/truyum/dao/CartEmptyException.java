package com.cognizant.truyum.dao;

public class CartEmptyException extends Exception {

	private static final long serialVersionUID = 100L;

	// Constructs a new exception with {@code null} as its detail message.
	public CartEmptyException() {
		super();
	}

	// Constructs a new exception with the specified detail message.
	public CartEmptyException(final String message) {
		super(message);
	}

}