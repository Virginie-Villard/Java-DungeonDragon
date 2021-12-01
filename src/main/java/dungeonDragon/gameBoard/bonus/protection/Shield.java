package dungeonDragon.gameBoard.bonus.protection;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Warrior;

public class Shield extends DefenseItem {
	
	public Shield(String name, int lvl) {
		super(name, lvl);
	}


	@Override
	public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
		System.out.println("You find a Shield here.");

		if (abstractCharacter instanceof Warrior) {
			System.out.println("You can fight harder now! Let's go go go !");
		}
		else {
			System.out.println("Damn, it's useless");
		}
	}
}
