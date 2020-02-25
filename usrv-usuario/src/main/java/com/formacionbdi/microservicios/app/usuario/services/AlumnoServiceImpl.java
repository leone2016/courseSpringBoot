package com.formacionbdi.microservicios.app.usuario.services;


import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.app.commons.services.CommonServiceImpl;
import com.formacionbdi.microservicios.app.usuario.models.entity.Alumno;
import com.formacionbdi.microservicios.app.usuario.models.repository.AlumnoRepository;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{
	
	
}
