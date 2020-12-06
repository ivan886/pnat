package com.colsubsidio.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario")
	private int idUsuario;

	private String contrasena;

	private String correo;

	private String nacionalidad;

	@Column(name="nombre_usuario")
	private String nombreUsuario;

	@Column(name="tipo_usuario")
	private String tipoUsuario;

	private String urlFoto;

	//bi-directional many-to-one association to Usuarioporinmersion
	@OneToMany(mappedBy="usuario")
	private List<Usuarioporinmersion> usuarioporinmersions;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getUrlFoto() {
		return this.urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public List<Usuarioporinmersion> getUsuarioporinmersions() {
		return this.usuarioporinmersions;
	}

	public void setUsuarioporinmersions(List<Usuarioporinmersion> usuarioporinmersions) {
		this.usuarioporinmersions = usuarioporinmersions;
	}

	public Usuarioporinmersion addUsuarioporinmersion(Usuarioporinmersion usuarioporinmersion) {
		getUsuarioporinmersions().add(usuarioporinmersion);
		usuarioporinmersion.setUsuario(this);

		return usuarioporinmersion;
	}

	public Usuarioporinmersion removeUsuarioporinmersion(Usuarioporinmersion usuarioporinmersion) {
		getUsuarioporinmersions().remove(usuarioporinmersion);
		usuarioporinmersion.setUsuario(null);

		return usuarioporinmersion;
	}

}