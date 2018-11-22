package fr.formation.choco.metier;

import fr.formation.choco.persistance.ChocoData;

public class ChocoService {

	/**
	 * Déclaration d'un singleton : instance unique.
	 */
	private static final ChocoService INSTANCE = new ChocoService();
	
	/**
	 * Accès publique à l'instance unique de ChocoService.
	 * 
	 * @return ChocoService le singleton.
	 */
	public static ChocoService getInstance() {
		return ChocoService.INSTANCE;
	}
	
	private ChocoData data;
	
	public ChocoService() {
		this.data = new ChocoData();
		this.data.loadTestData();
	}

	public ChocoData getData() {
		return data;
	}
	
}
