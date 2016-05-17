package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.excessoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.excessoes.CooperativaInexistenteException;
import br.com.unibratec.coletaseletiva.persistencia.RepositorioCooperativas;

@Service
public class CooperativaBusinessImpl implements CooperativaBusiness{
	
	@Autowired private RepositorioCooperativas cooperativas; 
	
	public List<Cooperativa> listarTodos(){
		return (List<Cooperativa>) this.cooperativas.findAll();
	}
	
	public Cooperativa buscarCooperativa(String cnpj) throws CooperativaInexistenteException{
		Cooperativa cooperativa = this.cooperativas.findByCnpj(cnpj);
		if (cooperativa == null) {
			throw new CooperativaInexistenteException();
		}
		return cooperativa;
	}
	
	public void remover(String cnpj) throws CooperativaInexistenteException {
		Cooperativa cooperativa = buscarCooperativa(cnpj);
		this.cooperativas.delete(cooperativa);
	}
	
	public void salvar(Cooperativa cooperativa) throws CooperativaExistenteException{
		verificaCnpjCadastrado(cooperativa);
		cooperativas.save(cooperativa);
	}
	
	private void verificaCnpjCadastrado(Cooperativa cooperativa) throws CooperativaExistenteException{
		Cooperativa cnpj = cooperativas.findByCnpj(cooperativa.getCnpj());		
		if(cnpj!=null && !cnpj.equals(cooperativa))
			throw new CooperativaExistenteException("O CNPJ informado já existe!");
	}

}
