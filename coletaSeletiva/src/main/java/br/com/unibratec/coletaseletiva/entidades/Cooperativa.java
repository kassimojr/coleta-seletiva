package br.com.unibratec.coletaseletiva.entidades;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cooperativa implements Serializable{	
	private static final long serialVersionUID = 1L;

	private long codigo;
	private String cnpj;
	private String nomeFantasia;
	private String email;
	private Collection<Coleta> coletas;
	private Endereco endereco;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToMany(mappedBy="cooperativa")
	public Collection<Coleta> getColetas() {
		return coletas;
	}
	
	public void setColetas(Collection<Coleta> coletas) {
		this.coletas = coletas;
	}
	
	@Embedded
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
