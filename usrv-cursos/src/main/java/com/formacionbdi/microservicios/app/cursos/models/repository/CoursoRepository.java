package com.formacionbdi.microservicios.app.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;

public interface CoursoRepository extends CrudRepository<Curso, Long>{

}
