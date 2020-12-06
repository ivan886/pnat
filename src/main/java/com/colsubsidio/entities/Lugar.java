package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lugar")
	private int idLugar;

	private String descripcion;

	@Column(name="id_padre")
	private int idPadre;

	@Column(name="nombre_lugar")
	private String nombreLugar;

	@Column(name="tipo_lugar")
	private String tipoLugar;

	@OneToMany(mappedBy="lugare")
	private List<Inmersion> inmersions;

	public Lugar() {
	}

	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdPadre() {
		return this.idPadre;
	}

	public void setIdPadre(int idPadre) {
		this.idPadre = idPadre;
	}

	public String getNombreLugar() {
		return this.nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	public String getTipoLugar() {
		return this.tipoLugar;
	}

	public void setTipoLugar(String tipoLugar) {
		this.tipoLugar = tipoLugar;
	}

	public List<Inmersion> getInmersions() {
		return this.inmersions;
	}

	public void setInmersions(List<Inmersion> inmersions) {
		this.inmersions = inmersions;
	}

	public Inmersion addInmersion(Inmersion inmersion) {
		getInmersions().add(inmersion);
		inmersion.setLugare(this);

		return inmersion;
	}

	public Inmersion removeInmersion(Inmersion inmersion) {
		getInmersions().remove(inmersion);
		inmersion.setLugare(null);

		return inmersion;
	}

}