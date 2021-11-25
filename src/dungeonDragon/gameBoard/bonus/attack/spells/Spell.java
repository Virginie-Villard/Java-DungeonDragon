package dungeonDragon.gameBoard.bonus.attack.spells;

import dungeonDragon.character.AbstractCharacter;
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
		System.out.println("Undefined Spell");
	}
}
