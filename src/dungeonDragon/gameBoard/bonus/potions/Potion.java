package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.gameBoard.Cell;

public abstract class Potion extends Cell {

    protected String name;
    protected int healing;

    public Potion(String name, int healing) {
        this.setName(name);
        this.setHealing(healing);

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
