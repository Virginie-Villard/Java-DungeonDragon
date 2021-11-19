package dungeonDragon.gameBoard;

public class Cell extends GameBoard {

	protected int cellNumber;

	public Cell() {}

	public Cell(int cellNumber) {
		this.setCellNumber(cellNumber);
	}

	public String toString() {
		return ("Cell " + cellNumber + " : ");
	}

	// GETTERS et SETTERS ___________________________________________________________________________


	public int getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}
}
