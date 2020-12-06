package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuarioporinmersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_usuarioPorInmersion;

	@Column(name="num_inmersiones")
	private int numInmersiones;

	//bi-directional many-to-one association to Inmersion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_inmersion")
	private Inmersion inmersion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Usuarioporinmersion() {
	}

	public int getId_usuarioPorInmersion() {
		return this.id_usuarioPorInmersion;
	}

	public void setId_usuarioPorInmersion(int id_usuarioPorInmersion) {
		this.id_usuarioPorInmersion = id_usuarioPorInmersion;
	}

	public int getNumInmersiones() {
		return this.numInmersiones;
	}

	public void setNumInmersiones(int numInmersiones) {
		this.numInmersiones = numInmersiones;
	}

	public Inmersion getInmersion() {
		return this.inmersion;
	}

	public void setInmersion(Inmersion inmersion) {
		this.inmersion = inmersion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}