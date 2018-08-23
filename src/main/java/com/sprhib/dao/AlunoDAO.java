package com.sprhib.dao;

import java.util.List;
import com.sprhib.model.Aluno;
import com.sprhib.model.Universidade;

public interface AlunoDAO {
	
	public void addAluno(Aluno aluno);
	public void updateAluno(Aluno aluno);
	public Aluno getAluno(int cpf);
	public void deleteAluno(int cpf);
	public List<Aluno> getAlunos();
	public List<Universidade> getUniversidades();

}
