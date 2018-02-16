package br.com.flat.flatapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "pessoa")
@EntityListeners(AuditingEntityListener.class)
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	@Column(name = "imagem_perfil")
	private String avatar;
	@Column(name = "tipo_img")
	private String tipoImg;
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Situacao situacao;
	
		
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipoImg() {
		return tipoImg;
	}

	public void setTipoImg(String tipoImg) {
		this.tipoImg = tipoImg;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
