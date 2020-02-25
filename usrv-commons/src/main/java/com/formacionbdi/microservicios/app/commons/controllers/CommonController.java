package com.formacionbdi.microservicios.app.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.formacionbdi.microservicios.app.commons.services.CommonService;


public class CommonController<E, commonService extends CommonService<E>> {
	
	@Autowired
	protected commonService service;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?>  ver(@PathVariable Long id){ // si el nombre fuere distinto de GetMappping /{id} con Long id, se debe especificar en @PathVariable( name "nombreVariableIngresa")
		Optional<E> o = service.findById(id);
		if( o.isEmpty() ) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(o.get());
	}
	
	@PostMapping()
	public ResponseEntity<?>  crear(@RequestBody E entity){ 
		E entityDb = service.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entityDb);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar( @PathVariable Long id ){
		service.deletebyId(id);
		return ResponseEntity.noContent().build(); // status 204
		
	}
}
