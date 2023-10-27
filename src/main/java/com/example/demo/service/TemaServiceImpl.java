package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Curso;
import com.example.demo.entity.Tema;
import com.example.demo.repository.TemaRepository;

@Service
public class TemaServiceImpl implements TemaService {

	@Autowired
	TemaRepository temaRepository;

	@Override
	public List<Tema> findAllTema() {
		return temaRepository.findAll();
	}

	@Override
	public Optional<Tema> findTemaById(Long id) {
		return temaRepository.findById(id);
	}

	@Override
	public Tema saveTema(Tema newTema) {
		return temaRepository.save(newTema);
	}

	@Override
	public Boolean deleteTema(Iterable<Tema> temas) {
		try {
			System.out.println(temas);
			temaRepository.deleteAllInBatch(temas);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String updateTema(Tema tema) {
		if (temaRepository.findById(tema.getId()) != null) {
			temaRepository.save(tema);
			return "OK";
		}
		return "ERROR: el id no existe";
	}


}
