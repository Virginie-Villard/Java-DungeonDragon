package dungeonDragon.gameBoard.enemy;

import dungeonDragon.gameBoard.Cell;

public abstract class Enemy extends Cell {

	protected String name;
	protected String defaultName = "Jean Villain";

	protected int life;
	protected int force;

	public Enemy() {
		this("Undefined enemy");
	}

	public Enemy(String name) {
		this(name, 9, 10);
	}


	public Enemy(String name, int life, int force) {
		this.setName(name);
		this.setLife(life);
		this.setForce(force);
	}

	public String toString() {
		return ("Enemy -- " + name + " --" +
				"\tLife : " + this.life);
	}


	// GETTERS et SETTERS ___________________________________________________________________________

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}
