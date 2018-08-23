package com.sprhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.AlunoDAO;
import com.sprhib.model.Aluno;
import com.sprhib.model.Universidade;

@Service
@Transactional
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoDAO alunoDAO;

	public void addAluno(Aluno aluno) {
		alunoDAO.addAluno(aluno);		
	}

	public void updateAluno(Aluno aluno) {
		alunoDAO.updateAluno(aluno);
	}

	public Aluno getAluno(int cpf) {
		return alunoDAO.getAluno(cpf);
	}

	public void deleteAluno(int cpf) {
		alunoDAO.deleteAluno(cpf);
	}

	public List<Aluno> getAlunos() {
		return alunoDAO.getAlunos();
	}
	
	public List<Universidade> getUniversidades() {
		return alunoDAO.getUniversidades();
	}

}
