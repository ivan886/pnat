package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
public class Avistamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_avistamiento")
	private int idAvistamiento;

	@Column(name="comportamiento_final")
	private String comportamientoFinal;

	@Column(name="comportamiento_inicial")
	private String comportamientoInicial;

	private String descripcion;

	private float profundidad;

	private int puntuacion;

	private String tamanio;

	@Column(name="url_foto")
	private String urlFoto;

	private String visibilidad;

	//bi-directional many-to-one association to Especy
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_especie")
	private Especie especie;

	//bi-directional many-to-one association to Avistaporinmersion
	@OneToMany(mappedBy="avistamiento")
	private List<Avistaporinmersion> avistaporinmersions;

	public Avistamiento() {
	}

	public int getIdAvistamiento() {
		return this.idAvistamiento;
	}

	public void setIdAvistamiento(int idAvistamiento) {
		this.idAvistamiento = idAvistamiento;
	}

	public String getComportamientoFinal() {
		return this.comportamientoFinal;
	}

	public void setComportamientoFinal(String comportamientoFinal) {
		this.comportamientoFinal = comportamientoFinal;
	}

	public String getComportamientoInicial() {
		return this.comportamientoInicial;
	}

	public void setComportamientoInicial(String comportamientoInicial) {
		this.comportamientoInicial = comportamientoInicial;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getProfundidad() {
		return this.profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public int getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getUrlFoto() {
		return this.urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public String getVisibilidad() {
		return this.visibilidad;
	}

	public void setVisibilidad(String visibilidad) {
		this.visibilidad = visibilidad;
	}

	public Especie getEspecie() {
		return this.especie;
	}

	public void setEspecie(Especie especy) {
		this.especie = especie;
	}

	public List<Avistaporinmersion> getAvistaporinmersions() {
		return this.avistaporinmersions;
	}

	public void setAvistaporinmersions(List<Avistaporinmersion> avistaporinmersions) {
		this.avistaporinmersions = avistaporinmersions;
	}

	public Avistaporinmersion addAvistaporinmersion(Avistaporinmersion avistaporinmersion) {
		getAvistaporinmersions().add(avistaporinmersion);
		avistaporinmersion.setAvistamiento(this);

		return avistaporinmersion;
	}

	public Avistaporinmersion removeAvistaporinmersion(Avistaporinmersion avistaporinmersion) {
		getAvistaporinmersions().remove(avistaporinmersion);
		avistaporinmersion.setAvistamiento(null);

		return avistaporinmersion;
	}

}