package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excecoes.EmailJaCadastradoException;
import br.com.unibratec.coletaseletiva.excecoes.UsuarioInexistenteException;
import br.com.unibratec.coletaseletiva.persistencia.UsuarioDAO;

@Service
public class UsuarioBusinessImpl implements UsuarioBusiness{
	
	@Autowired 
	private UsuarioDAO usuarioDAO; 
	
	public List<Usuario> listarTodos(){
		return (List<Usuario>) this.usuarioDAO.findAll();
	}
	
	public Usuario buscarUsuario(String codigo) throws UsuarioInexistenteException{
		Usuario usuario = this.usuarioDAO.findByCodigo(Long.parseLong(codigo));
		if (usuario == null) {
			throw new UsuarioInexistenteException();
		}
		return usuario;
	}
	
	public void remover(String codigo) throws UsuarioInexistenteException {
		Usuario usuario = buscarUsuario(codigo);
		this.usuarioDAO.delete(usuario);
	}
	
	public void salvar(Usuario usuario) throws EmailJaCadastradoException{
		verificaEmailCadastrado(usuario);
		usuarioDAO.save(usuario);
	}
	
	private void verificaEmailCadastrado(Usuario usuario) throws EmailJaCadastradoException{
		Usuario usuarioEmail = usuarioDAO.findByEmail(usuario.getEmail());		
		if(usuarioEmail!=null && !usuarioEmail.equals(usuario))
			throw new EmailJaCadastradoException("O Email informado já está sendo usado");
	}
}
