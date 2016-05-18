package br.com.unibratec.coletaseletiva.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unibratec.coletaseletiva.entidades.Coleta;
import br.com.unibratec.coletaseletiva.negocios.Fachada;

@RequestMapping("/coletas")
@RestController
public class ControllerColeta {
	@Autowired
	private Fachada fachada;

	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> salvar(@RequestBody Coleta coleta) {
		fachada.salvarColeta(coleta);
		return new ResponseEntity<Coleta>(coleta, HttpStatus.OK);
	}
}
