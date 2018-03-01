package br.com.flat.flatapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profissao")
public class Profissao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8768582886809696684L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String descricao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
