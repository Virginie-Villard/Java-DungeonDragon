package dungeonDragon.gameBoard.bonus;

import dungeonDragon.gameBoard.Cell;

public abstract class Bonus implements Cell {

	protected String name;
	protected String defaultName = "Bonus";

	public Bonus() {
		this("Undefined bonus");
	}

	public Bonus(String name) {
		this.setName(name);
	}

	public String toString() {
		return ("Bonus " + name + " : ");
	}

	// GETTERS et SETTERS ___________________________________________________________________________

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
