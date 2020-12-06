package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Avistaporinmersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_avisPorInmersion;

	//bi-directional many-to-one association to Avistamiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_avistamiento")
	private Avistamiento avistamiento;

	//bi-directional many-to-one association to Inmersion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_inmersion")
	private Inmersion inmersion;

	public Avistaporinmersion() {
	}

	public int getId_avisPorInmersion() {
		return this.id_avisPorInmersion;
	}

	public void setId_avisPorInmersion(int id_avisPorInmersion) {
		this.id_avisPorInmersion = id_avisPorInmersion;
	}

	public Avistamiento getAvistamiento() {
		return this.avistamiento;
	}

	public void setAvistamiento(Avistamiento avistamiento) {
		this.avistamiento = avistamiento;
	}

	public Inmersion getInmersion() {
		return this.inmersion;
	}

	public void setInmersion(Inmersion inmersion) {
		this.inmersion = inmersion;
	}

}