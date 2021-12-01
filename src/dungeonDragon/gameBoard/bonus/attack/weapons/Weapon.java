package dungeonDragon.gameBoard.bonus.attack.weapons;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.gameBoard.bonus.attack.AttackItem;

public abstract class Weapon extends AttackItem {
	
	public Weapon(String name, int attackLvl) {
		super(name, attackLvl);
	}

	@Override
	public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
		System.out.println("Undefined Weapon");
	}
}
