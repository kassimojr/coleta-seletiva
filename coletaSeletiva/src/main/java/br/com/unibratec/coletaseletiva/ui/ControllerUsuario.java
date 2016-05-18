package br.com.unibratec.coletaseletiva.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unibratec.coletaseletiva.entidades.Usuario;
import br.com.unibratec.coletaseletiva.excecoes.EmailJaCadastradoException;
import br.com.unibratec.coletaseletiva.negocios.Error;
import br.com.unibratec.coletaseletiva.negocios.Fachada;

@RequestMapping("/usuarios")
@RestController
public class ControllerUsuario {
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listarTodosUsuarios(){
		
		return new ResponseEntity<List<Usuario>>(fachada.listarTodosUsuarios(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> salvar(@RequestBody Usuario usuario){
		try {
			fachada.salvarUsuario(usuario);
			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		} catch (EmailJaCadastradoException e) {
			return new ResponseEntity<Error>(new Error(1,e.getMessage()), HttpStatus.OK);
		}
	}		
}
