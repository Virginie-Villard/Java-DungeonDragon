package dungeonDragon.gameBoard;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.exceptions.OutOfBoard;
import dungeonDragon.gameBoard.bonus.attack.weapons.Sword;
import dungeonDragon.gameBoard.bonus.potions.LittlePotion;
import dungeonDragon.gameBoard.enemy.Goblin;

import java.util.ArrayList;

public class GameBoard {

	private ArrayList<Cell> cells = new ArrayList<Cell>();
	protected int idObject;
	private Goblin goblin = new Goblin();

	/** @link: http://tutorials.jenkov.com/java-collections/set.html */
	// private Set<Integer> enemies = Set.of(2, 5);

	// private final int COUNT = 4;

	/**
	 * Gameboard constructor
	 */
	public GameBoard() {
		initializeCells();
	}

	private void initializeCells()
	{
		Cell cell1 = new EmptyCell();
		cells.add(cell1);
		Cell cell2 = new Goblin();
		cells.add(cell2);
		Cell cell3 = new Sword();
		cells.add(cell3);
		Cell cell4 = new LittlePotion();
		cells.add(cell4);


//		for(int i = 0; i < COUNT; i++)
//		{
//			if (enemies.contains(i))
//			{
//				cells.add(new Goblin(i));
//			}
//			else if(enemies.contains(i))
//			{
//				cells.add(new Witch(i));
//			}
//			else if(enemies.contains(i))
//			{
//				cells.add(new Dragon(i));
//			}
//			else
//			{
//				cells.add(new EmptyCell(i));
//			}
//		}
	}

	/**
	 * @param position
	 * @return the character position
	 * @throws OutOfBoard
	 * error management if character is out oh the Board.
	 */
	public Cell getCell(int position) throws OutOfBoard {
		if(position >= cells.size()) {
			throw new OutOfBoard();
		}
		return cells.get(position);
	}
}
