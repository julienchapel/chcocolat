package fr.formation.choco.metier;

import java.util.List;

import fr.formation.choco.persistance.ChocoTypeDao;

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

	private ChocoTypeDao dao;

	public ChocoService() {
		this.dao = new ChocoTypeDao();
	}

	public List<ChocoType> getChocoTypes() {
		return this.dao.readAll();
	}
}
