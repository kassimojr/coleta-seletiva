package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import br.com.unibratec.coletaseletiva.entidades.Coleta;

public interface ColetaBusiness {
	public List<Coleta> listarTodos();
	public void salvar (Coleta coleta);
	public void remover (Coleta coleta);
}
