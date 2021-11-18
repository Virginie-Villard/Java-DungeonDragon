package dungeonDragon;

// import java.util.Scanner;

public class Game {
	Menu menu = new Menu();
	
	public int startGame() {
		int choice = menu.userChoice();
		if(choice == 2) {
			chooseCharacter();
		}
		return 0;
	}
	public void chooseCharacter() {
//		Character character = menu.chooseCharacter();
//		characterList.add(character)
	}
	
//	menu.displayMenu();
}
