package com.formacionbdi.microservicios.app.cursos.services;

import com.formacionbdi.microservicios.app.commons.services.CommonService;
import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
}
