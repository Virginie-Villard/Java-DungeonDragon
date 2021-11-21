package dungeonDragon.gameBoard.bonus.potions;

public class LittlePotion extends Potion {

    public LittlePotion(int cellNumber) {
        super(cellNumber, "Little healing potion", 2);
    }

    public LittlePotion(int cellNumber, String name, int healing) {
        super(cellNumber, name, healing);
    }
}
