package com.biblioteca.biblioteca.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.aspectj.lang.annotation.DeclareError;

@Entity
@Table(name = "livro")
public class LivroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	
	@Column(name = "isbn_13", nullable = false)
	@Size(min = 13, max = 13)	
	private String ISBN13;
	
	
	@Column(name = "titulo", nullable = false)
	@Size(min = 1, max = 100)
	private String titulo;
	
	@Column(name = "descricao", nullable = false)
	@Size(min = 1, max = 2000)
	private String descricao;
	
	@Column(name = "quantidade_paginas", nullable = false)
	@Max(7000)
	private int quantidadePaginas;
	
	@Column(name = "quantidade_estoque")
	@NotNull(message = "Não pode ser nulo")
	private int estoque;
	
	@Column(name = "foto1", nullable = false)
	private String foto1;
	
	@Column(name = "foto2")
	private String foto2;
	
	@Column(name = "preco", nullable = false)
	private BigDecimal preco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getISBN13() {
		return ISBN13;
	}

	public void setISBN13(String iSBN13) {
		ISBN13 = iSBN13;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getFoto1() {
		return foto1;
	}

	public void setFoto1(String foto1) {
		this.foto1 = foto1;
	}

	public String getFoto2() {
		return foto2;
	}

	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
}
