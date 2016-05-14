package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excessoes.UsuarioInexistenteException;
import br.com.unibratec.coletaseletiva.excessoes.UsuarioJaCadastradoException;

public interface UsuarioBusiness {
	public List<Usuario> listarTodos();
	public void remover(String email) throws UsuarioInexistenteException;
	public Usuario buscarUsuario(String email) throws UsuarioInexistenteException;
	public void salvar (Usuario usuario) throws UsuarioJaCadastradoException;

}
