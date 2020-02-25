package com.formacionbdi.microservicios.app.usuario.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.microservicios.app.commons.controllers.CommonController;
import com.formacionbdi.microservicios.app.usuario.models.entity.Alumno;
import com.formacionbdi.microservicios.app.usuario.services.AlumnoService;

@RestController()
public class AlumnoController extends CommonController<Alumno, AlumnoService>{
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id ){ 
		Optional<Alumno> o = service.findById(id);
		if(o.isEmpty() ) {
			return ResponseEntity.notFound().build();
		}
		Alumno alumnoDb = o.get();
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumnoDb.getApellido());
		alumnoDb.setEmail(alumno.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDb));
		
	}
	

}
