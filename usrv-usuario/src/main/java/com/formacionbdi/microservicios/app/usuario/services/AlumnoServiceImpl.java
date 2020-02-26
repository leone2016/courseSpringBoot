package com.formacionbdi.microservicios.app.usuario.services;


import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.app.commons.services.CommonServiceImpl;
import com.formacionbdi.microservicios.app.usuario.models.repository.AlumnoRepository;
import com.formacionbdi.microservicios.common.alumnos.models.entity.Alumno;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{
	
	
}
