package com.sprhib.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="universidade")
public class Universidade {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "universidade_id_seq")
	@SequenceGenerator(name = "universidade_id_seq", sequenceName = "universidade_id_seq",allocationSize=1)
	@Column(name = "id")
	private Integer id;
	
	@NotNull
	@Size(min=3, max=45)
	private String nome;
	
	@NotNull
	@Size(min=4, max=45)
	private String endereco;
	
	@NotNull
	@Range(min=111111111, max=999999999)
	private Integer telefone;
	
	@NotNull
	@Size(min=4, max=25)
	private String pais;
	
	@NotNull
	@Size(min=4, max=25)
	private String idioma;
	
    @OneToMany(mappedBy = "universidade", cascade = CascadeType.ALL)
    private Set<Aluno> alunos;
    
	
	
	public Universidade() {
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Set<Aluno> getAlunos(){
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
