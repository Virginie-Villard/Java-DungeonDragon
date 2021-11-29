package dungeonDragon.gameBoard;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.exceptions.OutOfBoard;
import dungeonDragon.gameBoard.bonus.attack.weapons.Sword;
import dungeonDragon.gameBoard.bonus.potions.LittlePotion;
import dungeonDragon.gameBoard.enemy.Dragon;
import dungeonDragon.gameBoard.enemy.Goblin;
import dungeonDragon.gameBoard.enemy.Witch;

import java.util.ArrayList;
import java.util.Random;

public class GameBoard {

	private ArrayList<Cell> cells = new ArrayList<Cell>();
	// protected int idObject;
	private Goblin goblin = new Goblin();

	/** @link: http://tutorials.jenkov.com/java-collections/set.html */
	// private Set<Integer> enemies = Set.of(2, 5);

	private final int COUNT = 64;

	/**
	 * Gameboard constructor
	 */
	public GameBoard() {
		initializeCells();
	}

	/**
	 * Affichage
	 */
	private void initializeCells()
	{
		for (int i = 0; i < COUNT; i++)
		{
			cells.add(new EmptyCell());
		}

		this.spawnGoblin(1,25, 10);
		this.spawnWitch(20, 45, 10);
		this.spawnDragon(40, 63, 4);

		for (int i = 0; i < cells.size(); i++) {
			System.out.println(i + " - " + cells.get(i).getClass().getName());
		}

		this.spawnWitch(20, 45, 10);
	}

	private void spawnGoblin(int min, int max, int qty) {
		int spawned = 0;

		while(spawned < qty) {

			int index = new Random().nextInt(max - min) + min;
			Cell c = cells.get(index);

			if (c instanceof EmptyCell) {

				cells.set(index, new Goblin());
				spawned++;
			}
		}
	}

	private void spawnWitch(int min, int max,int qty) {
		int spawned = 0;

		while(spawned <qty) {

			int index = new Random().nextInt(max - min) + min;
			Cell c = cells.get(index);

			if (c instanceof EmptyCell) {
				cells.set(index, new Witch());
				spawned++;
			}
		}
	}

	private void spawnDragon(int min, int max,int qty) {
		int spawned = 0;

		while(spawned <qty) {

			int index = new Random().nextInt(max - min) + min;
			Cell c = cells.get(index);

			if (c instanceof EmptyCell) {
				cells.set(index, new Dragon());
				spawned++;
			}
		}
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
