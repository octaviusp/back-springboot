package com.example.demo.service;

import java.util.List;
import java.util.Optional;

//import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Docente;

public interface DocenteService {
	public List<Docente> findAllDocente();
    public Optional<Docente> findDocenteById(long id);
    public Docente saveDocente(Docente docente);
    public Boolean deleteDocentes(Iterable<Docente> docentes);
}