package br.com.unibratec.coletaseletiva.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coleta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long codigo;
	private Usuario usuario;
	private Cooperativa cooperativa;
	private Date data;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	@ManyToOne
	@JoinColumn(name="cod_usuario")
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@ManyToOne
	@JoinColumn(name="cod_cooperativa")
	public Cooperativa getCooperativa() {
		return cooperativa;
	}
	
	public void setCooperativa(Cooperativa cooperativa) {
		this.cooperativa = cooperativa;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}	
}
