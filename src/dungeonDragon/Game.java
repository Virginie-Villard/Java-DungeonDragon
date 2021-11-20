package dungeonDragon;

import java.util.ArrayList;
import dungeonDragon.character.AbstractCharacter;

public class Game {
	
	private ArrayList<AbstractCharacter> characterList = new ArrayList<AbstractCharacter>();
	Menu menu = new Menu();
	
	public Game() {}
	
	public void startGame() {
		boolean exit = false;
		
		do {
			int choice = menu.userChoice();
			if(choice == 1) {
			menu.exitGame();
			exit = true;
			}
			else if(choice == 2) {
				chooseCharacter();
			}
			else if(choice == 3) {
				menu.displayList(characterList);
			}
			else if(choice == 4) {
				playGame();
			}
		}
		while (exit == false);	
	}
	
	public void chooseCharacter() {
		AbstractCharacter character = menu.chooseCharacter();
		characterList.add(character);
	}
	
//	public boolean charactersReady() {
//		boolean isReady = false;
//		
//		if(characterList.isEmpty()) {
//			System.out.println("You have to create a character to start the game...");
//			return isReady;
//		}
//		else if(!characterList.isEmpty()) {
//			System.out.println("Your character is in position 1");
//			return isReady = true;
//		}
//		else {
//			System.out.println("Critical error you will self-destruct !!!");
//			return isReady;
//		}
//    }
	
	public void playGame() { // (boolean isReady) (Paramètre)
		int position = 0;
//		charactersReady();

//		if(isReady) {
//			System.out.println("isReady = " + isReady);

			do {
				System.out.print("\nPosition " + position + ", press Enter to launch 1 dice : ");
				menu.getClavier().nextLine();
				int diceRoll = Dice.roll(1);

				position += diceRoll;
			}
			while (position <= 3); // TODO repasser à 64 !

			System.out.print("\nYou win ! ");
			}
//		else {
//			System.out.print("\nCreate a character to play : ");
//			System.out.println("isReady is meant not to be ready : " + isReady);
//		}
//	}
}



