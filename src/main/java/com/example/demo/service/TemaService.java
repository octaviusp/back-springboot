package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Tema;

public interface TemaService {
	public List<Tema> findAllTema();

	public Optional<Tema> findTemaById(Long id);

	public Tema saveTema(Tema newTema);

	public Boolean deleteTema(Iterable<Tema> temas);

	public String updateTema(Tema tema);
	
}
