package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import br.com.unibratec.coletaseletiva.entidades.Coleta;
import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaInexistenteException;
import br.com.unibratec.coletaseletiva.excecoes.EmailJaCadastradoException;
import br.com.unibratec.coletaseletiva.excecoes.UsuarioInexistenteException;

public interface Fachada {
	public void salvarUsuario(Usuario usuario) throws EmailJaCadastradoException;
	public void removerUsuario(String codigo) throws UsuarioInexistenteException;
	public List<Usuario> listarTodosUsuarios();
	public Usuario buscarUsuario(String email) throws UsuarioInexistenteException;
	
	public void salvarCooperativa(Cooperativa cooperativa) throws CooperativaExistenteException;
	public void removerCooperativa(String email) throws CooperativaInexistenteException;
	public List<Cooperativa> listarTodasCooperativas();
	public Cooperativa buscarCooperativa(String email) throws CooperativaInexistenteException;
	public void salvarColeta(Coleta coleta);
}
