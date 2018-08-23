package com.sprhib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
		
	@Id
	private Integer cpf;
	
	private String nome;
	
	private String curso;
	
	private String endereco;
	
	
	private String telefone;
	
	private Integer coordinador;
	
	//http://www.codejava.net/frameworks/hibernate/hibernate-one-to-many-association-annotations-example
    @JoinColumn(name = "id")
	private Integer universidade;
	
	
	private Integer intercambio;
	
	
	public Aluno() {
		
	}
	
	
	public Integer getCPF() {
		return cpf;
	}
	public void setCPF(Integer cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(Integer coordinador) {
		this.coordinador = coordinador;
	}
	public Integer getUniversidade() {
		return universidade;
	}
	public void setUniversidade(Integer universidade) {
		this.universidade = universidade;
	}
	public Integer getIntercambio() {
		return intercambio;
	}
	public void setIntercambio(Integer intercambio) {
		this.intercambio = intercambio;
	}
	
	
}
