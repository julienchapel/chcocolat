package fr.formation.choco.persistance;


/**
 * Classe contenant sous forme de constantes l'ensemble des requetes necessaires aux manipulations de la base de donnees.
 * 
 * @author Adminl
 *
 */
public class JpqlQueries {
	
	public static final String SELECT_ALL_CHOCOTYPE = "SELECT ct FROM ChocoType ct";
	
	public static final String SELECT_ALL_CHOCOSTOCK = "SELECT cs FROM ChocoStock cs";
}
