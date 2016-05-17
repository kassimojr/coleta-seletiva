package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.unibratec.coletaseletiva.entidades.Coleta;
import br.com.unibratec.coletaseletiva.persistencia.ColetaDAO;

public class ColetaBusinessImpl implements ColetaBusiness{
	@Autowired
	private ColetaDAO coletaDAO;
	
	@Override
	public List<Coleta> listarTodos() {
		return (List<Coleta>) this.coletaDAO.findAll();
	}

	@Override
	public void salvar(Coleta coleta) {
		this.coletaDAO.save(coleta);
	}

	@Override
	public void remover(Coleta coleta) {
		this.coletaDAO.delete(coleta);
	}

}
