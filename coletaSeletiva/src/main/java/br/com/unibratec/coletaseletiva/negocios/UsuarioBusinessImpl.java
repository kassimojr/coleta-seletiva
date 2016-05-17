package br.com.unibratec.coletaseletiva.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excessoes.EmailJaCadastrado;
import br.com.unibratec.coletaseletiva.excessoes.UsuarioInexistenteException;
import br.com.unibratec.coletaseletiva.persistencia.RepositorioUsuarios;

@Service
public class UsuarioBusinessImpl implements UsuarioBusiness{
	
	@Autowired private RepositorioUsuarios usuarios; 
	
	public List<Usuario> listarTodos(){
		return (List<Usuario>) this.usuarios.findAll();
	}
	
	public Usuario buscarUsuario(String email) throws UsuarioInexistenteException{
		Usuario usuario = this.usuarios.findByEmail(email);
		if (usuario == null) {
			throw new UsuarioInexistenteException();
		}
		return usuario;
	}
	
	public void remover(String email) throws UsuarioInexistenteException {
		Usuario usuario = buscarUsuario(email);
		this.usuarios.delete(usuario);
	}
	
	public void salvar(Usuario usuario) throws EmailJaCadastrado{
		verificaEmailCadastrado(usuario);
		usuarios.save(usuario);
	}
	
	private void verificaEmailCadastrado(Usuario usuario) throws EmailJaCadastrado{
		Usuario usuarioEmail = usuarios.findByEmail(usuario.getEmail());		
		if(usuarioEmail!=null && !usuarioEmail.equals(usuario))
			throw new EmailJaCadastrado("O Email informado já está sendo usado");
	}

}
