package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.excessoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.excessoes.CooperativaInexistenteException;

public interface CooperativaBusiness {
	public List<Cooperativa> listarTodos();
	public void remover(String cnpj) throws CooperativaInexistenteException;
	public Cooperativa buscarCooperativa(String cnpj) throws CooperativaInexistenteException;
	public void salvar (Cooperativa cooperativa) throws CooperativaExistenteException;

}
