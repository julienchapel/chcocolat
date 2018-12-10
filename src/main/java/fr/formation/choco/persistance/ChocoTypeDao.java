package fr.formation.choco.persistance;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import fr.formation.choco.metier.ChocoType;

/**
 * Gestion de toutes les requêtes SQL la table 'choco_type'.
 * 
 * @author Adminl
 *
 */
public class ChocoTypeDao extends AbstractDao<ChocoType> {

	private static final Logger LOGGER = Logger.getLogger(ChocoTypeDao.class);

	@Override
	public ChocoType read(Integer id) {
		return this.read(id, new ChocoType());
	}

	@Override
	public List<ChocoType> readAll() {
		List<ChocoType> types = new ArrayList<>();
		TypedQuery<ChocoType> query = this.em
				.createQuery(JpqlQueries.SELECT_ALL_CHOCOTYPE, ChocoType.class);
		types.addAll(query.getResultList());
		return types;
	}

}
