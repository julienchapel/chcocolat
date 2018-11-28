package fr.formation.choco.persistance;

import java.util.ArrayList;
import java.util.List;

import fr.formation.choco.metier.ChocoType;

/**
 * ChocoData représente une simulation de stockage de données (persistence).
 */
public class ChocoData {

	private List<ChocoType> chocoTypes;
	
	public List<ChocoType> getChocoTypes() {
		return chocoTypes;
	}

	public ChocoData() {
		this.chocoTypes = new ArrayList<>();
	}
	
	public void loadTestData() {
		this.chocoTypes.add(new ChocoType("Noir 70%", "black-70"));
		this.chocoTypes.add(new ChocoType("Noir 80%", "black-80"));
		this.chocoTypes.add(new ChocoType("Noir 90%", "black-90"));
		this.chocoTypes.add(new ChocoType("Lait", "milk"));
		this.chocoTypes.add(new ChocoType("Lait et biscuit", "milk-biscuit"));
		this.chocoTypes.add(new ChocoType("Blanc", "white"));
	}
}
