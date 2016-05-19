package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excecoes.EmailJaCadastradoException;
import br.com.unibratec.coletaseletiva.excecoes.UsuarioInexistenteException;

public interface UsuarioBusiness {
	public List<Usuario> listarTodos();
	public void remover(String email) throws UsuarioInexistenteException;
	public Usuario buscarUsuario(String codigo) throws UsuarioInexistenteException;
	public void salvar (Usuario usuario) throws EmailJaCadastradoException;
	public void editar(Usuario usuario);
}
