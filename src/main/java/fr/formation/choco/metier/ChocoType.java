package fr.formation.choco.metier;

/**
 * Classe qui représente un type de chocolat qu'il est possible de commander
 * dans la boutique.
 */
public class ChocoType {

	private Integer id;

	private String label;

	private String value;

	public ChocoType() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ChocoType(String label, String value) {
		this.label = label;
		this.value = value;
	}
	
	public ChocoType(Integer id, String label, String value) {
		this(label, value);
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
