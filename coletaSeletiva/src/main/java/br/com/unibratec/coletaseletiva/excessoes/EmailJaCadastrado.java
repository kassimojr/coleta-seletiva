package br.com.unibratec.coletaseletiva.excessoes;

public class EmailJaCadastrado extends Exception {
	private static final long serialVersionUID = 8224671813673387163L;

	public EmailJaCadastrado(String string) {
		super(string);
	}

}
