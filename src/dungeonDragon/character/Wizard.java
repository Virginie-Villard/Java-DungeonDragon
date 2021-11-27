package dungeonDragon.character;

import dungeonDragon.gameBoard.bonus.protection.DefenseItem;
import dungeonDragon.gameBoard.bonus.protection.Filter;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;
import dungeonDragon.gameBoard.bonus.attack.spells.Spell;

public class Wizard extends AbstractCharacter {

	private String defaultName = "Sabrina";
	private Spell spell = null;
	// private Filter filter = filter;

	public Wizard() {
        this("");
    }

    public Wizard(String name) {
		super(name, 9, 2,4);
		this.setIntelligence(2);
    }
	
	public Wizard(String name, int life, int force, int intelligence) {
		super(name, life, force, intelligence);
	}

	// GETTERS et SETTERS ___________________________________________________________________________

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	public int getDamage() {
		int damage = 0;
		if (spell != null) damage = spell.getAttackLvl();
		return this.getIntelligence() + damage;
	}
}
