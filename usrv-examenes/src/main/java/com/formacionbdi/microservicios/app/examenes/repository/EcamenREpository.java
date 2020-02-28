package com.formacionbdi.microservicios.app.examenes.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.app.examenes.model.entity.Examen;

public interface EcamenREpository extends CrudRepository<Examen, Long>{

}
