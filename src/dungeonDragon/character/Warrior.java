package dungeonDragon.character;

import dungeonDragon.gameBoard.bonus.protection.DefenseItem;
import dungeonDragon.gameBoard.bonus.protection.Shield;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;
import dungeonDragon.gameBoard.bonus.attack.weapons.Weapon;

public class Warrior extends AbstractCharacter {

	private String defaultName = "Michel";
	private int strength;

	// 3 Constructors
	public Warrior() {
        this("");
    }
	
    public Warrior(String name) {
        super(name, 9, 2);
		this.setStrength(2);
    }
	
	public Warrior(String name, int life,
				   int force, int strength) {
		super(name, life, force);
		this.setStrength(strength);
	}



	// GETTERS et SETTERS _____________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.


	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
}
