package br.com.unibratec.coletaseletiva.persistencia;

import org.springframework.data.repository.CrudRepository;

import br.com.unibratec.coletaseletiva.entidades.Cooperativa;

public interface CooperativaDAO extends CrudRepository<Cooperativa, Long>{
	public Cooperativa findByCnpj(String cnpj);
}
