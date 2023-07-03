package es_3;

import java.io.Serializable;

public class BancaException extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;

	public BancaException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return getMessage();
	}
}
