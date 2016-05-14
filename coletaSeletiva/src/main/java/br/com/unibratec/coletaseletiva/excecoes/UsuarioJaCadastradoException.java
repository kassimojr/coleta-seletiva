package br.com.unibratec.coletaseletiva.excecoes;

public class UsuarioJaCadastradoException extends Exception {
	private static final long serialVersionUID = -1538912770439553702L;
	
	public UsuarioJaCadastradoException(String string) {
		super(string);
	}

}
