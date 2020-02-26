package com.formacionbdi.microservicios.app.cursos.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.app.commons.services.CommonServiceImpl;
import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;
import com.formacionbdi.microservicios.app.cursos.models.repository.CoursoRepository;
@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CoursoRepository>implements CursoService {



}
