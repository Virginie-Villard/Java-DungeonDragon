package dungeonDragon.gameBoard.bonus.protection;

import dungeonDragon.character.AbstractCharacter;

public class Shield extends DefenseItem {
	
	public Shield(String name, int lvl) {
		super(name, lvl);
	}


	@Override
	public void interaction(AbstractCharacter abstractCharacter) {
		System.out.println("You find a Shield here, you can fight harder now!");
	}
}
