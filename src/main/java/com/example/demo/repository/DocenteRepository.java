package com.example.demo.repository;

import java.util.List;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Long> {
	
	List<Docente> findAll();
	
}