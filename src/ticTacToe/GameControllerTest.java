package ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameControllerTest {

	@Test
	void validMoveTest() {

		GameController gc = new GameController();
		Player player1 = new Player('X');
		int x = 1;
		int y = 1;
		
		assertEquals(true,gc.ticTacToe.submitMove(player1.getMarker(), x, y));
	}
	
	void invalidMoveTestOutOfXBounds() {
		GameController gc = new GameController();
		Player player1 = new Player('X');
		int x = 3;
		int y = 1;
		
		assertEquals(false,gc.ticTacToe.submitMove(player1.getMarker(), x, y));
	}
	
	void invalidMoveTestOutOfYBounds() {
		GameController gc = new GameController();
		Player player1 = new Player('X');
		int x = 1;
		int y = 3;
		
		assertEquals(false,gc.ticTacToe.submitMove(player1.getMarker(), x, y));
	}
	
	void invalidMoveExistingMark() {
		GameController gc = new GameController();
		Player player1 = new Player('X');
		int x = 1;
		int y = 1;
		

		assertEquals(false,gc.ticTacToe.submitMove(player1.getMarker(), x, y));

	}
	
	//add test for draw

}
