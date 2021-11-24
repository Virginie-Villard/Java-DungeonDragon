package dungeonDragon.character;

import dungeonDragon.gameBoard.bonus.protection.DefenseItem;
import dungeonDragon.gameBoard.bonus.protection.Filter;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;
import dungeonDragon.gameBoard.bonus.attack.spells.Spell;

public class Wizard extends AbstractCharacter {

	private String defaultName = "Sabrina";
	private int intelligence;

	public Wizard() {
        this("");
    }

    public Wizard(String name) {
		super(name, 9, 2);
		this.setIntelligence(2);
    }
	
	public Wizard(String name, int life, int force, int intelligence) {
		super(name, life, force);
		this.setIntelligence(intelligence);
	}

	// GETTERS et SETTERS ___________________________________________________________________________

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		intelligence = intelligence;
	}


}
