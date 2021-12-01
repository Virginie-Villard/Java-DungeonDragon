package dungeonDragon.gameBoard.enemy;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.gameBoard.Cell;

public abstract class Enemy implements Cell {

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

	// INTERACTION _________________________________________________________________________________

	@Override
	public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
		System.out.println("This cell is occupied by an enemy");

		Fight f = new Fight(menu, abstractCharacter, this);
	}

	// Fight _______________________________________________________________________________________

	public void receiveDamage(AbstractCharacter character) {
		this.life -= character.getDamage();
	}

	public boolean isAlive() {
		return life > 0;
	}

	// GETTERS et SETTERS __________________________________________________________________________

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
