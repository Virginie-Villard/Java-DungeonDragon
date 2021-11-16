package dugeonDragon.character;


import dugeonDragon.attack.AttackItem;
import dugeonDragon.protection.DefenseItem;

public class Character {

	protected String name;
	protected String defaultName = "Bob";

	protected int life;
	protected int force;
	protected int intel;
	protected AttackItem attackItem;
	protected DefenseItem defenseItem;

	public Character() {
        this("Undefined character");
    }
	
	public Character(String name) {
		this(name, 9, 10, null, null);
    }
	
	public Character(String name, int life, int force, AttackItem attackItem, DefenseItem defenseItem) {
		this.setName(name);
		this.setLife(life);
		this.setForce(force);
		this.setAttackItem(attackItem);
		this.setDefenseItem(defenseItem);
	}

	/* Utilisation de la méthode toString() pour mettre en forme l'objet Character dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("-- " + name + " --" +
				"\nLife : " + this.life +
				"\nForce : " + this.force +
				"\nAttackItem : " + this.getAttackItem() +
				"\nDefenseItem : " + this.getDefenseItem());
	}
	
	
	// GETTERS et SETTERS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.


	private int getLife() {
		return life;
	}

	private void setLife(int life) {
		this.life = life;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		if(name.isEmpty() || name == null) {
			this.name = this.defaultName;
		} else {
			this.name = name;
		}
		System.out.println("Set character name: "+this.name);
	}

	private int getForce() {
		return force;
	}

	private void setForce(int force) {
		this.force = force;
	}

	private AttackItem getAttackItem() {
		return attackItem;
	}

	private void setAttackItem(AttackItem attackItem) {
		this.attackItem = attackItem;
	}

	private DefenseItem getDefenseItem() {
		return defenseItem;
	}

	private void setDefenseItem(DefenseItem defenseItem) {
		this.defenseItem = defenseItem;
	}
}
