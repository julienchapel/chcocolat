package fr.formation.choco.persistance;

public class SqlQueries {

	public static final String CREATE_CHOCOTYPE = "INSERT INTO choco_type VALUES (null, %s, %s);";
	
	public static final String READ_CHOCOTYPE = "SELECT * FROM choco_type WHERE id=%s;";
	
	public static final String READ_ALL_CHOCOTYPE = "SELECT * FROM choco_type;";
	
	public static final String UPDATE_CHOCOTYPE = "UPDATE choco_type SET label='%s', value='%s' WHERE id=%s;";
	
	public static final String DELETE_CHOCOTYPE = "DELETE FROM choco_type WHERE id=%s;";
}
