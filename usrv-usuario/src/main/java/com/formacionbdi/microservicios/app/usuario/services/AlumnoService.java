package com.formacionbdi.microservicios.app.usuario.services;

import java.util.Optional;

import com.formacionbdi.microservicios.app.usuario.models.entity.Alumno;

public interface AlumnoService {
	public Iterable<Alumno> findAll();
	
	public Optional<Alumno> findById(Long id);
	
	public Alumno save(Alumno alumno);
	
	public void deletebyId(Long id);
	
}
