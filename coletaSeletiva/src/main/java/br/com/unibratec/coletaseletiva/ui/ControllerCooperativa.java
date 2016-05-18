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

import br.com.unibratec.coletaseletiva.entidades.Cooperativa;
import br.com.unibratec.coletaseletiva.excecoes.CooperativaExistenteException;
import br.com.unibratec.coletaseletiva.negocios.Error;
import br.com.unibratec.coletaseletiva.negocios.Fachada;

@RequestMapping("/cooperativas")
@RestController
public class ControllerCooperativa {
	@Autowired
	private Fachada fachada;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listarTodasCooperativas() {

		return new ResponseEntity<List<Cooperativa>>(fachada.listarTodasCooperativas(), HttpStatus.OK);
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> salvar(@RequestBody Cooperativa cooperativa) {
		try {
			fachada.salvarCooperativa(cooperativa);
			return new ResponseEntity<Cooperativa>(cooperativa, HttpStatus.OK);
		} catch (CooperativaExistenteException e) {
			return new ResponseEntity<Error>(new Error(1, e.getMessage()), HttpStatus.OK);
		}
	}
}
