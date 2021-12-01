package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.gameBoard.Cell;

public abstract class HealingPotion implements Cell {

    protected String name;
    protected int healing;

    public HealingPotion(String name, int healing) {
        this.setName(name);
        this.setHealing(healing);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
        System.out.println("Glowing in the dark, a healing potion is here.");
    }

    // GETTERS et SETTERS ___________________________________________________________________________

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }
}
