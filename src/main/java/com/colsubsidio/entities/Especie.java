package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Especie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_especie")
	private int idEspecie;

	private String descripcion;

	@Column(name="nombre_especie")
	private String nombreEspecie;

	@Column(name="tamanio_maximo")
	private String tamanioMaximo;

	@Column(name="tamanio_minimo")
	private String tamanioMinimo;

	//bi-directional many-to-one association to Avistamiento
	@OneToMany(mappedBy="especie")
	private List<Avistamiento> avistamientos;

	public Especie() {
	}

	public int getIdEspecie() {
		return this.idEspecie;
	}

	public void setIdEspecie(int idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreEspecie() {
		return this.nombreEspecie;
	}

	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}

	public String getTamanioMaximo() {
		return this.tamanioMaximo;
	}

	public void setTamanioMaximo(String tamanioMaximo) {
		this.tamanioMaximo = tamanioMaximo;
	}

	public String getTamanioMinimo() {
		return this.tamanioMinimo;
	}

	public void setTamanioMinimo(String tamanioMinimo) {
		this.tamanioMinimo = tamanioMinimo;
	}

	public List<Avistamiento> getAvistamientos() {
		return this.avistamientos;
	}

	public void setAvistamientos(List<Avistamiento> avistamientos) {
		this.avistamientos = avistamientos;
	}

	public Avistamiento addAvistamiento(Avistamiento avistamiento) {
		getAvistamientos().add(avistamiento);
		avistamiento.setEspecie(this);

		return avistamiento;
	}

	public Avistamiento removeAvistamiento(Avistamiento avistamiento) {
		getAvistamientos().remove(avistamiento);
		avistamiento.setEspecie(null);

		return avistamiento;
	}

}