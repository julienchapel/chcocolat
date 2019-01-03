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
	
	public boolean deleteChocoType(Integer id) {
		return this.dao.delete(id);
	}
	
	public ChocoType readChocoType(Integer id) {
		return this.dao.read(id);
	}
	
	public boolean updateChocoType(Integer id, String label, String value) {
		boolean result = false;
		
		if (id != null) {
		ChocoType chocoType = new ChocoType(id, label, value);
		this.dao.update(chocoType);
		result = true;
		}
		return result;
	}
	
	public boolean addChocoType(String label, String value) {
		boolean result = false;
		ChocoType chocoType = new ChocoType();
		chocoType.setLabel(label);
		chocoType.setValue(value);
		this.dao.create(chocoType);
		result = true;
		
		return result;
	}
	
	
	
	
	
	
}
