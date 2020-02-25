package com.formacionbdi.microservicios.app.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public class CommonServiceImpl<E, R extends CrudRepository<E, Long>> implements CommonService<E>{
	
	@Autowired
	protected R repository; // protected para que se pueda reautilizar en las clases hijas que heredan de commonServiceImpl, por ej. AlumnoServiceImpl
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	@Transactional()
	public E save(E entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	@Transactional()
	public void deletebyId(Long id) {
		 repository.deleteById(id);
		
	}

}
