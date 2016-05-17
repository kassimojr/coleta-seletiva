package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unibratec.coletaseletiva.entidades.Coleta;
import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaInexistenteException;
import br.com.unibratec.coletaseletiva.excecoes.EmailJaCadastradoException;
import br.com.unibratec.coletaseletiva.excecoes.UsuarioInexistenteException;
import br.com.unibratec.coletaseletiva.persistencia.ColetaDAO;

@Service
public class FachadaImpl implements Fachada{

	@Autowired
	private UsuarioBusiness usuario;
	
	@Autowired
	private CooperativaBusiness cooperativa;
	
	//private ColetaBu
	
	@Override
	public void salvarUsuario(Usuario usuario) throws EmailJaCadastradoException {
		this.usuario.salvar(usuario);
	}

	@Override
	public void removerUsuario(String email) throws UsuarioInexistenteException {
		this.usuario.remover(email);
	}

	@Override
	public List<Usuario> listarTodosUsuarios() {
		return this.usuario.listarTodos();
	}

	@Override
	public Usuario buscarUsuario(String email) throws UsuarioInexistenteException {
		return this.usuario.buscarUsuario(email);
	}

	@Override
	public void salvarCooperativa(Cooperativa cooperativa) throws CooperativaExistenteException {
		this.cooperativa.salvar(cooperativa);
	}

	@Override
	public void removerCooperativa(String email) throws CooperativaInexistenteException {
		this.cooperativa.remover(email);
	}

	@Override
	public List<Cooperativa> listarTodasCooperativas() {
		return this.listarTodasCooperativas();
	}

	@Override
	public Cooperativa buscarCooperativa(String email) throws CooperativaInexistenteException {
		return this.cooperativa.buscarCooperativa(email);
	}

	@Override
	public void salvarColeta(Coleta coleta) {
	//	return this.
	}
}
