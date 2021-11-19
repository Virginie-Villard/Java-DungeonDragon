package dungeonDragon.character;


import dungeonDragon.gameBoard.protection.DefenseItem;
import dungeonDragon.gameBoard.attack.AttackItem;

public abstract class AbstractCharacter {

	private String name;
	private String defaultName = "Bob";

	private int life;
	private int force; //  TODO uniquement pour warrior !
	private int intel; // TODO uniquement pour wizard !
	protected AttackItem attackItem;
	protected DefenseItem defenseItem;

	public AbstractCharacter() {
        this("Undefined character");
    }
	
	public AbstractCharacter(String name) {
		this(name, 9, 10, null, null);
    }
	
	public AbstractCharacter(String name, int life, int force, 
			AttackItem attackItem, DefenseItem defenseItem) {
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
		return ("\n||-- " + name + " --" +
				"\n||Life : " + this.life +
				"\n||Force : " + this.force +
				"\n||AttackItem : " + this.getAttackItem() +
				"\n||DefenseItem : " + this.getDefenseItem());
	}
	
	
	// GETTERS et SETTERS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.


	protected int getLife() {
		return life;
	}

	protected void setLife(int life) {
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

	protected int getForce() {
		return force;
	}

	protected void setForce(int force) {
		this.force = force;
	}

	protected AttackItem getAttackItem() {
		return attackItem;
	}

	protected void setAttackItem(AttackItem attackItem) { // TODO change void to AttackItem
		//if(attackItem.equals(null) || attackItem.equals("")) {
		//	this.attackItem = this.defaultAttackItem;
		//} else {
			this.attackItem = attackItem;
		//}
	}

	protected DefenseItem getDefenseItem() {
		return defenseItem;
	}

	protected void setDefenseItem(DefenseItem defenseItem) {
		this.defenseItem = defenseItem;
	}
}
