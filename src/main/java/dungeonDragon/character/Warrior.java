package dungeonDragon.character;

import dungeonDragon.gameBoard.bonus.protection.DefenseItem;
import dungeonDragon.gameBoard.bonus.protection.Shield;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;
import dungeonDragon.gameBoard.bonus.attack.weapons.Weapon;
import dungeonDragon.gameBoard.enemy.Enemy;

public class Warrior extends AbstractCharacter {

	private String defaultName = "Michel";
	private Weapon weapon = null;

	// 3 Constructors
	public Warrior() {
        this("");
    }
	
    public Warrior(String name) {
        super(name, 9, 4, 2);
    }
	
	public Warrior(String name, int life,
				   int force, int intelligence) {
		super(name, life, force, intelligence);
	}

//	@Override
//	public int getForce() {
////		int weaponDamage = 0;
////
////		if(weapon != null) {
////			weaponDamage = weapon.getAttackLvl();
////		}
////		return super.getForce() + weaponDamage;
//	}

// GETTERS et SETTERS _____________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.


	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public int getDamage() {
		int damage = 0;
		if (weapon != null) damage = weapon.getAttackLvl();
		return this.getForce() + damage;
	}
}
