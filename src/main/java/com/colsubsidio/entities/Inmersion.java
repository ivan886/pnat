package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Inmersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_inmersion")
	private int idInmersion;

	private float aire_final;

	private float aire_inicial;

	private byte avistamiento;

	@Temporal(TemporalType.DATE)
	@Column(name="fin_inmersion")
	private Date finInmersion;

	@Temporal(TemporalType.DATE)
	@Column(name="inicio_inmersion")
	private Date inicioInmersion;

	private float latitud;

	private float longitud;

	@Column(name="numero_avistamiento")
	private int numeroAvistamiento;

	private String observaciones;

	@Column(name="profundidad_maxima")
	private float profundidadMaxima;

	@Column(name="temperatura_agua")
	private int temperaturaAgua;

	private String visibilidad;

	//bi-directional many-to-one association to Avistaporinmersion
	@OneToMany(mappedBy="inmersion")
	private List<Avistaporinmersion> avistaporinmersions;

	//bi-directional many-to-one association to Lugare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_lugar")
	private Lugar lugare;

	//bi-directional many-to-one association to Usuarioporinmersion
	@OneToMany(mappedBy="inmersion")
	private List<Usuarioporinmersion> usuarioporinmersions;

	public Inmersion() {
	}

	public int getIdInmersion() {
		return this.idInmersion;
	}

	public void setIdInmersion(int idInmersion) {
		this.idInmersion = idInmersion;
	}

	public float getAire_final() {
		return this.aire_final;
	}

	public void setAire_final(float aire_final) {
		this.aire_final = aire_final;
	}

	public float getAire_inicial() {
		return this.aire_inicial;
	}

	public void setAire_inicial(float aire_inicial) {
		this.aire_inicial = aire_inicial;
	}

	public byte getAvistamiento() {
		return this.avistamiento;
	}

	public void setAvistamiento(byte avistamiento) {
		this.avistamiento = avistamiento;
	}

	public Date getFinInmersion() {
		return this.finInmersion;
	}

	public void setFinInmersion(Date finInmersion) {
		this.finInmersion = finInmersion;
	}

	public Date getInicioInmersion() {
		return this.inicioInmersion;
	}

	public void setInicioInmersion(Date inicioInmersion) {
		this.inicioInmersion = inicioInmersion;
	}

	public float getLatitud() {
		return this.latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return this.longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public int getNumeroAvistamiento() {
		return this.numeroAvistamiento;
	}

	public void setNumeroAvistamiento(int numeroAvistamiento) {
		this.numeroAvistamiento = numeroAvistamiento;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public float getProfundidadMaxima() {
		return this.profundidadMaxima;
	}

	public void setProfundidadMaxima(float profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}

	public int getTemperaturaAgua() {
		return this.temperaturaAgua;
	}

	public void setTemperaturaAgua(int temperaturaAgua) {
		this.temperaturaAgua = temperaturaAgua;
	}

	public String getVisibilidad() {
		return this.visibilidad;
	}

	public void setVisibilidad(String visibilidad) {
		this.visibilidad = visibilidad;
	}

	public List<Avistaporinmersion> getAvistaporinmersions() {
		return this.avistaporinmersions;
	}

	public void setAvistaporinmersions(List<Avistaporinmersion> avistaporinmersions) {
		this.avistaporinmersions = avistaporinmersions;
	}

	public Avistaporinmersion addAvistaporinmersion(Avistaporinmersion avistaporinmersion) {
		getAvistaporinmersions().add(avistaporinmersion);
		avistaporinmersion.setInmersion(this);

		return avistaporinmersion;
	}

	public Avistaporinmersion removeAvistaporinmersion(Avistaporinmersion avistaporinmersion) {
		getAvistaporinmersions().remove(avistaporinmersion);
		avistaporinmersion.setInmersion(null);

		return avistaporinmersion;
	}

	public Lugar getLugare() {
		return this.lugare;
	}

	public void setLugare(Lugar lugare) {
		this.lugare = lugare;
	}

	public List<Usuarioporinmersion> getUsuarioporinmersions() {
		return this.usuarioporinmersions;
	}

	public void setUsuarioporinmersions(List<Usuarioporinmersion> usuarioporinmersions) {
		this.usuarioporinmersions = usuarioporinmersions;
	}

	public Usuarioporinmersion addUsuarioporinmersion(Usuarioporinmersion usuarioporinmersion) {
		getUsuarioporinmersions().add(usuarioporinmersion);
		usuarioporinmersion.setInmersion(this);

		return usuarioporinmersion;
	}

	public Usuarioporinmersion removeUsuarioporinmersion(Usuarioporinmersion usuarioporinmersion) {
		getUsuarioporinmersions().remove(usuarioporinmersion);
		usuarioporinmersion.setInmersion(null);

		return usuarioporinmersion;
	}

}