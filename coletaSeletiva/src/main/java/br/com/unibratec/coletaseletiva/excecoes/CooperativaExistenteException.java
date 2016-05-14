package br.com.unibratec.coletaseletiva.excecoes;

public class CooperativaExistenteException extends Exception{
	private static final long serialVersionUID = -1200334436272988545L;

	public CooperativaExistenteException(String message) {
		super(message);
	}
}
