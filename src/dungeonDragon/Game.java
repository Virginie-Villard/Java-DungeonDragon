package dungeonDragon;

import java.util.ArrayList;

import dungeonDragon.character.AbstractCharacter;

// import java.util.Scanner;

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
		}
		while (exit == false);	
	}
	
	public void chooseCharacter() {
		AbstractCharacter character = menu.chooseCharacter();
		characterList.add(character);
	}
	
		public boolean charactersReady() {
		boolean isReady = false;
		
		if(characterList.isEmpty()) {
			System.out.println("You have to create a character to start the game...");
			return isReady;
		}
		else if(!characterList.isEmpty()) {
			System.out.println("Your warrior is in position 1");
			return isReady = true;
		}
		else {
			System.out.println("Critical error you will self-destruct !!!");
			return isReady;
		}
    }
}



