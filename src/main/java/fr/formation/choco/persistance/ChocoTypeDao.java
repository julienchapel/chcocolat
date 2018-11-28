package fr.formation.choco.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import fr.formation.choco.metier.ChocoType;

/**
 * Gestion de toutes les requêtes SQL la table 'choco_type'.
 * 
 * @author Adminl
 *
 */
public class ChocoTypeDao implements Dao<ChocoType> {

	private static final Logger LOGGER = Logger.getLogger(ChocoTypeDao.class);

	private MySqlConnection mysqlConn;

	public ChocoTypeDao() {
		this.mysqlConn = new MySqlConnection();
	}

	@Override
	public ChocoType create(ChocoType entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Lecture d'un type de chocolat.
	 */
	@Override
	public ChocoType read(Integer id) {
		ChocoType result = null;
		try {
			Statement st = this.mysqlConn.getConn().createStatement();
			ResultSet rs = st
					.executeQuery(String.format(SqlQueries.READ_CHOCOTYPE, id));
			if (rs != null) {
				rs.next();
				result = this.transformToChocoType(rs);
			}
		} catch (SQLException e) {
			LOGGER.error(
					"Impossible de récupérer la liste des types de chocolats"
							+ " à cause d'une SqlException : ",
					e);
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Récupère tous les types de chocolats.
	 */
	@Override
	public List<ChocoType> readAll() {
		List<ChocoType> types = new ArrayList<>();
		try {
			Statement st = this.mysqlConn.getConn().createStatement();
			ResultSet rs = st.executeQuery(SqlQueries.READ_ALL_CHOCOTYPE);
			while (rs != null && rs.next()) {
				types.add(this.transformToChocoType(rs));
			}
		} catch (SQLException e) {
			LOGGER.error(
					"Impossible de récupérer la liste des types de chocolats"
							+ " à cause d'une SqlException : ",
					e);
		}
		return types;
	}

	/**
	 * Récupère les informations dans le ResultSet pour construire un nouvel
	 * objet ChocoType.
	 * 
	 * @param rs le ResultSet duquel récupérer les données.
	 * @return ChocoType l'objet créé.
	 * @throws SQLException si la colonne 'id', 'label', ou 'value' n'existe pas
	 *                      ou si elle n'est pas du type attendu.
	 */
	private ChocoType transformToChocoType(ResultSet rs) throws SQLException {
		Integer id = rs.getInt("id");
		String label = rs.getString("label");
		String value = rs.getString("value");
		return new ChocoType(id, label, value);
	}

	@Override
	public ChocoType update(ChocoType entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
