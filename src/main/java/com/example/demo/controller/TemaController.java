package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tema;
import com.example.demo.service.TemaService;


@CrossOrigin(origins = "*") // Permitir cualquier origen
@RestController

public class TemaController {
	@Autowired
	TemaService temaService;

	@RequestMapping(value = "/temas", method = RequestMethod.GET, produces = "application/json")
	public List<Tema> getTema() {
		return temaService.findAllTema();
	}

	@RequestMapping(value = "/temas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Tema> getTema(@PathVariable("id") Long id) {
		return temaService.findTemaById(id);
	}

	@RequestMapping(value = "/temas", method = RequestMethod.PUT, produces = "application/json")
	public String updateTema(@RequestBody Tema tema) {
		return temaService.updateTema(tema);
	}

	@RequestMapping(value = "/temas", method = RequestMethod.POST, produces = "application/json")
	public Tema addPostPost(@RequestBody Tema tema) {
		return temaService.saveTema(tema);
	}

	@RequestMapping(value = "/temas", method = RequestMethod.DELETE, produces = "application/json")
	public Boolean deleteTema(@RequestBody Iterable<Tema> temas) {
		return temaService.deleteTema(temas);
	}


}
