package dungeonDragon.gameBoard.bonus.attack.spells;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Warrior;
import dungeonDragon.character.Wizard;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;

public class Spell extends AttackItem {

	public Spell() {
		super("Fire Blast", 2);
	}

	public Spell(String name, int attackLvl) {
		super(name, attackLvl);
	}

	@Override
	public void interaction(AbstractCharacter abstractCharacter) {
		System.out.println("You find a book on a lectern, you open it and...");

		if (abstractCharacter instanceof Wizard) {
			((Wizard) abstractCharacter).setSpell(this);
			System.out.println("You can read it because you are a Wizard and learn the attack spell it contains");
		}
		else {
			System.out.println("As you are a Warrior you can't understand the language it is written in and leave this old book behind.");
		}
	}
}
