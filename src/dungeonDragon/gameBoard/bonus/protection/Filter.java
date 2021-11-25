package dungeonDragon.gameBoard.bonus.protection;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Wizard;

public class Filter extends DefenseItem {

	public Filter(String protectionName, int protectionLvl) {
		super(protectionName, protectionLvl);
	}

	@Override
	public void interaction(AbstractCharacter abstractCharacter) {
		System.out.println("You found a very old book containing a defensive filter");

		if (abstractCharacter instanceof Wizard) {
			System.out.println("Let's try it!");
		}
		else {
			System.out.println("It's useless, you're a warrior! you can't use magic");
		}
	}
}
