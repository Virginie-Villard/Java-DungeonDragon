package dungeonDragon.gameBoard;

import java.util.*;

import dungeonDragon.gameBoard.enemy.Goblin;

public class GameBoard {

	private ArrayList<Cell> cells = new ArrayList<Cell>();

	// @see: http://tutorials.jenkov.com/java-collections/set.html
	// private Set<Integer> enemies = Set.of(2, 5);

	private final int COUNT = 4;

	public GameBoard() {
		initializeCells();
	}

	private void initializeCells()
	{
		cells.add(new Cell(0));
		cells.add(new Goblin(1));
		//gameBoard.add(new Sword(2));
		//gameBoard.add(new LittlePotion(3));

//		for(int i = 0; i < COUNT; i++)
//		{
//			if (enemies.contains(i))
//			{
//				cells.add(new Goblin(i));
//			}
//			else
//			{
//				cells.add(new EmptyCell(i));
//			}
//		}
	}

/*	public void gameBoard(int cellNumber) {
		gameBoard.add(new EmptyCell(cellNumber));
//		gameBoard.add(new Goblin(cellNumber));
// 		gameBoard.add(new Sword(cellNumber));
//		gameBoard.add(new LittlePotion(cellNumber));
	}*/
	
}
