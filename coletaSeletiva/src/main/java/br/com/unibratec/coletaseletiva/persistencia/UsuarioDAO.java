package br.com.unibratec.coletaseletiva.persistencia;

import org.springframework.data.repository.CrudRepository;

import br.com.unibratec.coletaseletiva.entidades.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Long>{
	public Usuario findByEmail(String email);

	public Usuario findByCodigo(long codigo);
}
