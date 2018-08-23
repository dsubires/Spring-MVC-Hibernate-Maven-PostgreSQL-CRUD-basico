package com.sprhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.UniversidadeDAO;
import com.sprhib.model.Universidade;;

@Service
@Transactional
public class UniversidadeServiceImpl implements UniversidadeService {
	
	@Autowired
	private UniversidadeDAO uniDAO;

	public void addUniversidade(Universidade uni) {
		uniDAO.addUniversidade(uni);		
	}

	public void updateUniversidade(Universidade uni) {
		uniDAO.updateUniversidade(uni);
	}

	public Universidade getUniversidade(int id) {
		return uniDAO.getUniversidade(id);
	}

	public void deleteUniversidade(int id) {
		uniDAO.deleteUniversidade(id);
	}

	public List<Universidade> getUniversidades() {
		return uniDAO.getUniversidades();
	}

}
