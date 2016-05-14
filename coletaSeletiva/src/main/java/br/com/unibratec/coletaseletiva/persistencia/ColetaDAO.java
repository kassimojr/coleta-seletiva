package br.com.unibratec.coletaseletiva.persistencia;

import org.springframework.data.repository.CrudRepository;

import br.com.unibratec.coletaseletiva.entidades.Coleta;

public interface ColetaDAO extends CrudRepository<Coleta, Long>{
	
}
