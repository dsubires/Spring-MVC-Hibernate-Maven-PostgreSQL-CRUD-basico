package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Universidade;;

@Repository
public class UniversidadeDAOImpl implements UniversidadeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addUniversidade(Universidade uni) {
		getCurrentSession().save(uni);
	}

	public void updateUniversidade(Universidade uni) {
		Universidade uniToUpdate = getUniversidade(uni.getId());
		uniToUpdate.setNome(uni.getNome());
		uniToUpdate.setEndereco(uni.getEndereco());
		uniToUpdate.setTelefone(uni.getTelefone());
		uniToUpdate.setPais(uni.getPais());
		uniToUpdate.setIdioma(uni.getIdioma());
		getCurrentSession().update(uniToUpdate);
		
	}

	public Universidade getUniversidade(int id) {
		Universidade uni = (Universidade) getCurrentSession().get(Universidade.class, id);
		return uni;
	}

	public void deleteUniversidade(int id) {
		Universidade uni = getUniversidade(id);
		if (uni != null)
			getCurrentSession().delete(uni);
	}

	@SuppressWarnings("unchecked")
	public List<Universidade> getUniversidades() {
		return getCurrentSession().createQuery("from Universidade").list();
	}

}
