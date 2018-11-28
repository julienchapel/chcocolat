package fr.formation.choco.metier;

/**
 * Classe qui représente un type de chocolat qu'il est possible de commander
 * dans la boutique.
 */
public class ChocoType {

	private String label;

	private String value;
	
	public ChocoType() {
	}

	public ChocoType(String label, String value) {
		this.label = label;
		this.value = value;
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
