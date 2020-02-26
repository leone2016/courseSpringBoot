package com.formacionbdi.microservicios.app.usuario.services;


import java.util.List;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.commons.services.CommonServiceImpl;
import com.formacionbdi.microservicios.app.usuario.models.repository.AlumnoRepository;
import com.formacionbdi.microservicios.common.alumnos.models.entity.Alumno;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{

	@Override
	@Transactional(readOnly = true) //xq solo es consulta
	public List<Alumno> findByNombreorApellido(String term) {
		return repository.findByNombreorApellido(term);
	}
	
	
}
