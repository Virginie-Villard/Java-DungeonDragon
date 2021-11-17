package dugeonDragon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Super jeu");
		Scanner clavier = new Scanner(System.in);
		TestGame tGame = new TestGame();
		tGame.userChoice(clavier);
    }
}
