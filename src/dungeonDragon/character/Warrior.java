package dungeonDragon.character;

import dungeonDragon.gameBoard.bonus.protection.DefenseItem;
import dungeonDragon.gameBoard.bonus.protection.Shield;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;
import dungeonDragon.gameBoard.bonus.attack.weapons.Weapon;

public class Warrior extends AbstractCharacter {

	private String defaultName = "Michel";

	// 3 Constructors
	public Warrior() {
        this("");
    }
	
    public Warrior(String name) {
        super(name, 9, 10, null, null);
    }
	
	public Warrior(String name, int life, int force, 
			AttackItem attackItem, DefenseItem defenseItem) {
		super(name, life, force, attackItem, defenseItem);
	}
	
	public Warrior(String name, int life,
				   int force, String weaponName, int weaponLvl,
				   String protectionName, int protectionDefenseLvl) {

		super(name, life, force,
				new Weapon(weaponName, weaponLvl),
				new Shield(protectionName, protectionDefenseLvl));
	}

	// GETTERS et SETTERS _____________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.

	protected Weapon getWeapon() {
		// type casting to Weapon
		// @see: https://www.w3schools.com/java/java_type_casting.asp
		return (Weapon) this.attackItem;
	}

	protected void setWeapon(Weapon weapon) {
		// A Weapon is an AttackItem so it's ok
		this.attackItem = weapon;
	}

	protected Shield getShield() {
		// On vÃ©rifie que le defenceItem est bien de type Shield. Je le retourne en le castant.
		// Sinon je retourne null.
		// Pour ne pas permettre à  un Warrior de prendre un Filter.
		// @see https://www.javatpoint.com/downcasting-with-instanceof-operator
		if (this.defenseItem instanceof Shield) {
			return (Shield) this.defenseItem;
		}
		return null;
	}

	protected void setShield(Shield shield) {
		if(shield == null) {
			this.defenseItem = new Shield("Trash can lid", 1);
		}
		else {
			this.defenseItem = shield;
		}

		System.out.println("Set Shield name : " + this.defenseItem);
	}
}
