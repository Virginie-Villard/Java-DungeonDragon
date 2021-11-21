package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.gameBoard.Cell;

public abstract class Potion extends Cell {

    private String name;
    private int healing;

    public Potion(int cellNumber) {
        super(cellNumber);
        this.setName(name);
        this.setHealing(healing);
    }

    public Potion(int cellNumber, String name, int healing) {
        super(cellNumber);
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
