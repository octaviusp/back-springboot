package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Docente;
import com.example.demo.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	DocenteRepository docenteRepository; 
									

	@Override
	public List<Docente> findAllDocente() {
		return docenteRepository.findAll();
	}

    @Override
	public Optional<Docente> findDocenteById(long id) {
		return docenteRepository.findById(id);
	}

	@Override
	public Boolean deleteDocentes(Iterable<Docente> docentes) {
		try {
			docenteRepository.deleteAllInBatch(docentes);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Docente saveDocente(Docente docente) {
		return docenteRepository.save(docente);
	}


}
