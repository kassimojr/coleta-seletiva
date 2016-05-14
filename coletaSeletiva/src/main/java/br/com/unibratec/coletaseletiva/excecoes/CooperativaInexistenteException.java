package br.com.unibratec.coletaseletiva.excecoes;

public class CooperativaInexistenteException extends Exception{
	private static final long serialVersionUID = -1850622715957238616L;
	
	public CooperativaInexistenteException(String string) {
		super(string);
	}

	public CooperativaInexistenteException() {
		
	}
}
