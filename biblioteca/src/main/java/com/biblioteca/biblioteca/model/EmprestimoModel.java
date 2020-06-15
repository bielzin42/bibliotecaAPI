package com.biblioteca.biblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimos")
public class EmprestimoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn
	@ManyToOne(fetch = FetchType.EAGER)
	private ClienteModel cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private LivroModel livro;

	
	
	public EmprestimoModel() {
		
	}

	public EmprestimoModel(ClienteModel cliente, LivroModel livro) {
		super();
		this.cliente = cliente;
		this.livro = livro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public LivroModel getLivro() {
		return livro;
	}

	public void setLivro(LivroModel livro) {
		this.livro = livro;
	}
	
}
