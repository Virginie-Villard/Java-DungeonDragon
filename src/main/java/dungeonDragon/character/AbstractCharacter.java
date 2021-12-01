package dungeonDragon.character;

import dungeonDragon.gameBoard.bonus.potions.HealingPotion;
import dungeonDragon.gameBoard.enemy.Enemy;

public abstract class AbstractCharacter {

	private String name;
	private String defaultName = "Bob";
	private int life;
	private int force;
	private int intelligence;

	public AbstractCharacter() {
        this("Undefined character");
    }
	
	public AbstractCharacter(String name) {
		this(name, 9, 10, 10);
    }
	
	public AbstractCharacter(String name, int life, int force, int intelligence) {
		this.setName(name);
		this.setLife(life);
		this.setForce(force);
		this.setIntelligence(intelligence);
	}

	/* Utilisation de la méthode toString() pour mettre en forme l'objet Character dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {

		return ("\n||\t -- " + name + " --" +
				"\n||\t Life : " + this.life +
				"\n||\t Force : " + this.force +
				"\n||\t Intelligence : " + intelligence
			);
	}

	public void usePotion(HealingPotion potion) {
		this.life += potion.getHealing();
	}

	// FIGHT _________________________________________________________________________________

	public void receiveDamage(Enemy enemy) {
		this.life -= enemy.getForce();
	}

	public boolean isAlive() {
		return life > 0;
	}

	public int getDamage() {
		return getDamage();
	}
	
	// GETTERS et SETTERS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.


	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		if(name.isEmpty() || name == null) {
			this.name = this.defaultName;
		} else {
			this.name = name;
		}
		// System.out.println("Set character name: "+this.name);
	}

	public int getForce() {
		return force;
	}

	protected void setForce(int force) {
		this.force = force;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
}
