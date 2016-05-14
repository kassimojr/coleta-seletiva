package br.com.unibratec.coletaseletiva.excessoes;

public class UsuarioJaCadastrado extends Exception {
	private static final long serialVersionUID = -1538912770439553702L;
	
	public UsuarioJaCadastrado(String string) {
		super(string);
	}

}
