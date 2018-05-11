package ticTacToe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class GameBoardTest {

	@Test
	void getEmptyBoard() {
		GameBoard ticTacToe = new GameBoard();
		assertNotNull(ticTacToe.getGameBoard());
	}
	
	@Test
	void checkForWinnerRowZero() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 0, 'X');
		winningBoard.setGameBoard(0, 1, 'X');
		winningBoard.setGameBoard(0, 2, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerRowOne() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(1, 0, 'X');
		winningBoard.setGameBoard(1, 1, 'X');
		winningBoard.setGameBoard(1, 2, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerRowTwo() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(2, 0, 'X');
		winningBoard.setGameBoard(2, 1, 'X');
		winningBoard.setGameBoard(2, 2, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerColumnZero() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 0, 'X');
		winningBoard.setGameBoard(1, 0, 'X');
		winningBoard.setGameBoard(2, 0, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerColumnOne() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 1, 'X');
		winningBoard.setGameBoard(1, 1, 'X');
		winningBoard.setGameBoard(2, 1, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerColumnTwo() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 2, 'X');
		winningBoard.setGameBoard(1, 2, 'X');
		winningBoard.setGameBoard(2, 2, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerBackSlash() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 0, 'X');
		winningBoard.setGameBoard(1, 1, 'X');
		winningBoard.setGameBoard(2, 2, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForWinnerForwardSlash() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 2, 'X');
		winningBoard.setGameBoard(1, 1, 'X');
		winningBoard.setGameBoard(2, 0, 'X');
		assertEquals(true,winningBoard.checkForWinner());
	}
	
	
	
	@Test
	void checkForLoser() {
		GameBoard winningBoard = new GameBoard();
		winningBoard.setGameBoard(0, 0, 'X');
		winningBoard.setGameBoard(1, 0, 'X');
		winningBoard.setGameBoard(0, 2, 'X');
		assertEquals(false,winningBoard.checkForWinner());
	}
	
	@Test
	void checkForEmptyBoardNotWinner() {
		GameBoard winningBoard = new GameBoard();

		assertEquals(false,winningBoard.checkForWinner());
	}
	
	


}
