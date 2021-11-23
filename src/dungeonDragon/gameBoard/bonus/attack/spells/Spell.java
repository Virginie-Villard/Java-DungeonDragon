package dungeonDragon.gameBoard.bonus.attack.spells;

import dungeonDragon.gameBoard.bonus.attack.AttackItem;

public class Spell extends AttackItem {

	public Spell(int cellNumber) {
		super(cellNumber, "Fire Blast", 2);
	}

	public Spell(int cellNumber, String name, int attackLvl) {
		super(cellNumber, name, attackLvl);
	}
}
