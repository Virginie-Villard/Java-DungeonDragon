package dugeonDragon.character;

import dugeonDragon.attack.AttackItem;
import dugeonDragon.attack.Spell;
import dugeonDragon.attack.Weapon;
import dugeonDragon.protection.DefenseItem;
import dugeonDragon.protection.Filter;
import dugeonDragon.protection.Shield;

public class Warrior extends Character {

	protected String defaultName = "Michel";

	// 3 Constructors
	public Warrior() {
        this("");
    }
	
    public Warrior(String name) {
        super(name, 9, 10, null, null);
    }
	
	public Warrior(String name, int life, int force, AttackItem attackItem, DefenseItem defenseItem) {
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

	private Weapon getWeapon() {
		// type casting to Weapon
		// @see: https://www.w3schools.com/java/java_type_casting.asp
		return (Weapon) this.attackItem;
	}

	private void setWeapon(Weapon weapon) {
		// A Weapon is an AttackItem so it's ok
		this.attackItem = weapon;
	}

	private Shield getShield() {
		// On vérifie que le defenceItem est bien de type Shield. Je le retourne en le castant.
		// Sinon je retourne null.
		// Pour ne pas permettre à un Warrior de prendre un Filter.
		// @see https://www.javatpoint.com/downcasting-with-instanceof-operator
		if (this.defenseItem instanceof Shield) {
			return (Shield) this.defenseItem;
		}
		return null;
	}

	private void setShield(Shield shield) {
		if(shield == null) {
			this.defenseItem = new Shield("Trash can lid", 1);
		}
		else {
			this.defenseItem = shield;
		}

		System.out.println("Set Shield name : " + this.defenseItem);
	}
}
