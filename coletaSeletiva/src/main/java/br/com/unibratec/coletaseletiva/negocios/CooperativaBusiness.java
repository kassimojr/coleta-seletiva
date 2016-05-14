package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaInexistenteException;

public interface CooperativaBusiness {
	public List<Cooperativa> listarTodos();
	public void remover(String email) throws CooperativaInexistenteException;
	public Cooperativa buscarCooperativa(String email) throws CooperativaInexistenteException;
	public void salvar (Cooperativa cooperativa) throws CooperativaExistenteException;
}
