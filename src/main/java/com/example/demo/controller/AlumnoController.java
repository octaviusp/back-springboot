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

import com.example.demo.service.AlumnoService;
import com.example.demo.entity.Alumno;

@CrossOrigin(origins = "*") // Permitir cualquier origen
@RestController
public class AlumnoController {
	@Autowired
	AlumnoService alumnoService;

	@RequestMapping(value = "/alumnos", method = RequestMethod.GET, produces = "application/json")
	public List<Alumno> getAlumnos() {
		return alumnoService.findAllAlumno();
	}

	@RequestMapping(value = "/alumnos/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Alumno> getAlumno(@PathVariable Long id) {
		return alumnoService.findAlumnoById(id);
	}

	@RequestMapping(value = "/alumnos", method = RequestMethod.PUT, consumes = "application/json")
	public String updateAlumno(@RequestBody Alumno alumno) {
		return alumnoService.updateAlumno(alumno);
	}

	@RequestMapping(value = "/alumnos", method = RequestMethod.POST, produces = "application/json")
	public Alumno addPostPost(@RequestBody Alumno alumno) {
		return alumnoService.saveAlumno(alumno);
	}

	@RequestMapping(value = "/alumnos/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deletePost(@PathVariable Long id) {
		return alumnoService.deleteAlumno(id);
	}

}