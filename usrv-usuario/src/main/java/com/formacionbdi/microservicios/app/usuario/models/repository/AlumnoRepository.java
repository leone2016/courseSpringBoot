package com.formacionbdi.microservicios.app.usuario.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.app.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
