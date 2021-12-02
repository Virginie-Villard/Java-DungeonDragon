package dungeonDragon;

import java.util.ArrayList;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.exceptions.OutOfBoard;
import dungeonDragon.gameBoard.Cell;
import dungeonDragon.gameBoard.GameBoard;

/**
 * <b>La classe Game gère le déroulé du jeu.</b>
 */
public class Game {

    /**
     * Initialisation d'une nouvelle liste de personnages, "charachterList".
     */
    private ArrayList<AbstractCharacter> characterList = new ArrayList<AbstractCharacter>();
    /**
     * Initialisation du nouveau menu.
     * @see Menu
     */
    Menu menu = new Menu();
    /**
     * Initialisation du nouveau plateau de jeu.
     * @see GameBoard
     */
    GameBoard gameBoard = new GameBoard();
    /**
     * On donne au game un attribut currentCharacter qui est le personnage avec lequel on joue.
     * @see AbstractCharacter
     */
    private AbstractCharacter currentCharacter;

    /**
     * Constructeur vide de Game.
     */
    public Game() {}

    /**
     * Fonction startGame qui gère les résultats des choix de l'utilisateur
     * @see Menu (userchoice()).
     */
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
                /**
                 * @throw le personnage sort du plateau de jeu (lancer de dé)
                 */
                try {
                    playGame();
                } catch (OutOfBoard e) {
                    System.out.println("You Win !");
                }

            }
        }
        while (!exit);
    }

    /**
     * chooseCharacter gère le choix de l'utilisateur pour la création de son personnage
     * @see Menu
     */
    public void chooseCharacter() {
        this.currentCharacter = menu.chooseCharacter();
        characterList.add(this.currentCharacter);
    }

    /**
     * charactersReady vérifie l'existence d'un personnage avant de pouvoir autoriser le jeu.
     * @return boolean siReady
     */
    public boolean charactersReady() {
        boolean isReady = false;

        if(characterList.isEmpty()) {
            System.out.println("You have to create a character to start the game...");
            isReady = false;
            // return false;
        }
        else if(!characterList.isEmpty()) {
            isReady = true;
        }
        else {
            System.out.println("Critical error you will self-destruct !!!");
            isReady = false;
        }

        return isReady;
    }

    /**
     * Better isReady function
     * @return
     */
    private boolean hasCharacter()
    {
        return !characterList.isEmpty();
    }

    /**
     * playGame gère les déplacement du personnage
     * par lancés de dé.
     * et appelle la fonction interaction.
     * @throws OutOfBoard :
     * @link #startGame()
     */
    public void playGame() throws OutOfBoard { // (boolean isReady) (Paramètre)
        int position = 0;
        System.out.print("\nPosition " + position + ", press Enter to launch 1 dice : ");
        menu.getClavier().nextLine();

        if(charactersReady()) {

            do {
                menu.getClavier().nextLine();
                int diceRoll = Dice.roll(1);

                position += diceRoll;
                System.out.print("\nPosition " + position + ", press Enter to launch 1 dice : ");
                Cell currentCell = gameBoard.getCell(position);

                currentCell.interaction(this.currentCharacter, this.menu);
            }
            while(true);

        }
    }
}



