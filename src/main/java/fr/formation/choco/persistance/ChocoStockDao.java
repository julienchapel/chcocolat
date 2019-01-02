package fr.formation.choco.persistance;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import fr.formation.choco.metier.ChocoStock;

/**
 * Gestion de toutes les requêtes SQL la table 'choco_type'.
 * 
 * @author Adminl
 *
 */
@Component
public class ChocoStockDao extends AbstractDao<ChocoStock> {

	private static final Logger LOGGER = Logger.getLogger(ChocoStockDao.class);

	@Override
	public ChocoStock read(Integer id) {
		return this.read(id, new ChocoStock());
	}

	@Override
	public List<ChocoStock> readAll() {
		List<ChocoStock> stocks = new ArrayList<>();
		TypedQuery<ChocoStock> query = this.em
				.createQuery(JpqlQueries.SELECT_ALL_CHOCOSTOCK, ChocoStock.class);
		stocks.addAll(query.getResultList());
		LOGGER.debug(stocks.size() + " stocks de chocolats chargé depuis la BDD.");
		return stocks;
	}

}
