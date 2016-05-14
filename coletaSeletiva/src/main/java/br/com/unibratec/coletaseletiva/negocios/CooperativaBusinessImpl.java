package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaInexistenteException;
import br.com.unibratec.coletaseletiva.persistencia.CooperativaDAO;

@Service
public class CooperativaBusinessImpl implements CooperativaBusiness {

	@Autowired
	private CooperativaDAO cooperativaDAO;

	public List<Cooperativa> listarTodos() {
		return (List<Cooperativa>) this.cooperativaDAO.findAll();
	}

	public Cooperativa buscarCooperativa(String cnpj) throws CooperativaInexistenteException {
		Cooperativa cooperativa = this.cooperativaDAO.findByCnpj(cnpj);
		if (cooperativa == null) {
			throw new CooperativaInexistenteException();
		}
		return cooperativa;
	}

	public void remover(String cnpj) throws CooperativaInexistenteException {
		Cooperativa cooperativa = buscarCooperativa(cnpj);
		this.cooperativaDAO.delete(cooperativa);
	}

	public void salvar(Cooperativa cooperativa) throws CooperativaExistenteException {
		verificaCnpjCadastrado(cooperativa);
		cooperativaDAO.save(cooperativa);
	}

	private void verificaCnpjCadastrado(Cooperativa cooperativa) throws CooperativaExistenteException {
		Cooperativa cnpj = cooperativaDAO.findByCnpj(cooperativa.getCnpj());
		if (cnpj != null && !cnpj.equals(cooperativa))
			throw new CooperativaExistenteException("O CNPJ informado já existe!");
	}

}
