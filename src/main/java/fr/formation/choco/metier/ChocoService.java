package fr.formation.choco.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.choco.persistance.ChocoTypeDao;

@Service
public class ChocoService {

	@Autowired
	private ChocoTypeDao dao;

	public List<ChocoType> getChocoTypes() {
		return this.dao.readAll();
	}
}
