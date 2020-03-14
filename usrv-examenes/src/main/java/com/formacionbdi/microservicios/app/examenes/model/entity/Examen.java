package com.formacionbdi.microservicios.app.examenes.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="examenes")
public class Examen {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_at")
	private Date createAt;
	// cascade = CascadeType.ALL:  cuando elimina el examen, tambien debe eliminar sus preguntas
	//  orphanRemoval = true:  cuando eliminamos una pregunta de la lista, esta pregunta debe asignar la referencia del examen el null
	// mappedBy = "atributo de la entidad pregunta private Examen examen;"
	// @JsonIgnoreProperties:  ignora la relacion bidireccional
	@JsonIgnoreProperties(value = {"examen"}, allowSetters = true)
	@OneToMany(mappedBy = "examen", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true) 
	private List<Pregunta> preguntas;

	
	
	public Examen() {
		this.preguntas = new ArrayList<>();
	}

	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<Pregunta> preguntas) {
		// cuando se cree un examen con sus preguntas, se envia en el request o en el cuerpo se envia un JSON completo 
		// el examen y la lista preguntas.
	   // de forma automatica cuando se recibe en el controlador de tipo POST, se asignan las preguntas en este metodo set, pero solo con 
		//  this.preguntas = preguntas; solo asigna preguntas y no examen, de este modo la foreign key de examen va quedar en null
		
		
	
		// this.preguntas = preguntas; //incompleto
		
		
		// de este modo agrega pregunta  y el examen
		preguntas.forEach( p -> this.addPregunta(p));
	}
	public void addPregunta(Pregunta pregunta) {
		this.preguntas.add(pregunta);
		// relacion inversa, por cada examen que se agrega se tiene que agregar la pregunta
		// se asigna this ya que estamos dentro de la clase examen, si no se hace esto 
		// cuando se cree un examen con sus preguntas, crea el examen pero  las preguntas crea con un foreign key en null 
		// porque no se establece la relacion inversa,
		pregunta.setExamen(this);
		
	}
	public void removePregunta(Pregunta pregunta) {
		this.preguntas.remove(pregunta);
		// cuando se quita la referencia con null, la foreign key quena en null y no esta asignado a ninguna
		pregunta.setExamen(null);
	}
	
}
