package br.com.unibratec.coletaseletiva.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Coleta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long codigo;
	private Usuario usuario;
	private Cooperativa cooperativa;
	private Date data;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}	
}
