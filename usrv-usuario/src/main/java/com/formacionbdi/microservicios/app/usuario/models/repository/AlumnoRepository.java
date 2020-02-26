package com.formacionbdi.microservicios.app.usuario.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.common.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
