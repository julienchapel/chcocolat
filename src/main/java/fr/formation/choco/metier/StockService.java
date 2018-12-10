package fr.formation.choco.metier;

import java.util.List;

import fr.formation.choco.persistance.ChocoStockDao;


public class StockService {

	private static final StockService INSTANCE = new StockService();

	public static StockService getInstance() {
		return StockService.INSTANCE;
	}

	private ChocoStockDao dao;

	public StockService() {
		this.dao = new ChocoStockDao();
	}

	public List<ChocoStock> getChocoStocks() {
		return this.dao.readAll();
	}
}
