package com.formacionbdi.microservicios.app.usuario.services;

import java.util.List;

import com.formacionbdi.microservicios.app.commons.services.CommonService;
import com.formacionbdi.microservicios.common.alumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{

	public List<Alumno> findByNombreorApellido(String term);
}
