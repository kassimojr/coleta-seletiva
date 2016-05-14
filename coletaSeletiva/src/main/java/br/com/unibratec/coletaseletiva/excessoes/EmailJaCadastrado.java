package br.com.unibratec.coletaseletiva.excessoes;

public class EmailJaCadastrado extends Exception {
	private static final long serialVersionUID = -1538912770439553702L;
	
	public EmailJaCadastrado(String string) {
		super(string);
	}

}
