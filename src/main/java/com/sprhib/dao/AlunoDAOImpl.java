package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Aluno;
import com.sprhib.model.Universidade;

@Repository
public class AlunoDAOImpl implements AlunoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addAluno(Aluno aluno) {
		getCurrentSession().save(aluno);
	}

	public void updateAluno(Aluno aluno) {
		Aluno alunoToUpdate = getAluno(aluno.getCPF());
		alunoToUpdate.setNome(aluno.getNome());
		alunoToUpdate.setCurso(aluno.getCurso());
		alunoToUpdate.setEndereco(aluno.getEndereco());
		alunoToUpdate.setTelefone(aluno.getTelefone());
		alunoToUpdate.setCoordinador(aluno.getCoordinador());
		alunoToUpdate.setUniversidade(aluno.getUniversidade());
		alunoToUpdate.setIntercambio(aluno.getIntercambio());
		getCurrentSession().update(alunoToUpdate);
	}

	public Aluno getAluno(int cpf) {
		Aluno aluno = (Aluno) getCurrentSession().get(Aluno.class, cpf);
		return aluno;
	}

	public void deleteAluno(int cpf) {
		Aluno aluno = getAluno(cpf);
		if (aluno != null)
			getCurrentSession().delete(aluno);
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> getAlunos() {
		return getCurrentSession().createQuery("from Aluno").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Universidade> getUniversidades() {
		return getCurrentSession().createQuery("from Universidade").list();
	}

}
