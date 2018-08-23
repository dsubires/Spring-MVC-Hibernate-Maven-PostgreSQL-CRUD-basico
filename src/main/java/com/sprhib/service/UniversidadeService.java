package com.sprhib.service;

import java.util.List;
import com.sprhib.model.Universidade;;

public interface UniversidadeService {
	
	public void addUniversidade(Universidade Universidade);
	public void updateUniversidade(Universidade Universidade);
	public Universidade getUniversidade(int id);
	public void deleteUniversidade(int id);
	public List<Universidade> getUniversidades();

}
