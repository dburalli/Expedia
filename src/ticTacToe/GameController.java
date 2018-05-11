package ticTacToe;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameController {

	//instructions didn't denote whether it was to be replayable?
	//If I had more time, I would probably do the following
	//Need to refactor some of these methods and place them in the proper class
	//Create a parent class Board that can be extended to multiple games (i.e. chess, checkers...)
	//If it was replayable, utilize the score variable in Player class
	//refactor/move some of the variables and their modifiers
	//write way more tests, would want to test all the limits/edges
	//make the computer moves smarter than randomization
	public GameBoard ticTacToe;
	private Player human;
	private Player computer;
	public static final char PLAYER_X = 'X';
	public static final char PLAYER_O = 'O';
	private boolean winner = false;
	
	public GameController() {
		ticTacToe = new GameBoard();
		human = new Player();
		computer = new Player();
	}
	
	public static void main(String[] args) {
		//create a game to start
		GameController gc = new GameController();
		
		//create scanner to read in input, print out instructions
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe!");
		System.out.println("Would you like the first turn? <Y/N>: ");
		
		char inputChoice = ' ';
		while(true){
			//grabbing first char should also cover the case of typing "yes or no"
			inputChoice = sc.nextLine().toUpperCase().charAt(0);
			
			if(inputChoice == 'Y' )
			{
				gc.human.setTurn(true);
				break;
			}else if(inputChoice == 'N') {
				gc.computer.setTurn(true);
				break;
			}

		}
		// set players, X goes first
		gc.SetPlayers(inputChoice);
		
		while(gc.winner == false) {
			
			
			
			if(gc.human.turn == true) {
				while(true) {
					System.out.println("Your move player: ");
					gc.ticTacToe.displayBoard();
					if(gc.ticTacToe.submitMove(gc.human.getMarker(),getUserInput(sc, "Row"),getUserInput(sc,"Column"))) {
						gc.human.setTurn(false);
						gc.winner = gc.ticTacToe.checkForWinner();
						if(gc.winner) {
							System.out.println("You've Won!");
						}else if(gc.winner == false && gc.ticTacToe.getMoveCount() > 8) {
							System.out.println("Its a draw!");
							gc.winner = true;
						}
						gc.ticTacToe.displayBoard();
						break;
					}
				}
			}else {
				System.out.println("HAL's move: ");
				while(true) {
					if(gc.ticTacToe.submitMove(gc.computer.getMarker(),ThreadLocalRandom.current().nextInt(0,2+1),ThreadLocalRandom.current().nextInt(0,2+1))) {
						gc.human.setTurn(true);
						gc.winner = gc.ticTacToe.checkForWinner();
						
						if(gc.winner) {
							System.out.println("HAL is the winner");
						}else if(gc.winner == false && gc.ticTacToe.getMoveCount() > 8) {
							System.out.println("Its a draw!");
							gc.winner = true;
						}
						gc.ticTacToe.displayBoard();
						break;
				}
			}
			}
			
			
			
		}
	}

	private static int getUserInput(Scanner sc, String label) {
		int coordinate;
		System.out.println(label + " Coordinate(1-3): ");
		while (!sc.hasNextInt()) sc.next();
				//0 isn't a coordinate, only an index, make it easy for user to understand
				coordinate = sc.nextInt()-1;
		
				return coordinate;
	}
	
	public void SetPlayers(char inputChoice) {
		if(inputChoice == 'Y') {
			human.setMarker(PLAYER_X);
			computer.setMarker(PLAYER_O);
		}else {
			human.setMarker(PLAYER_O);
			computer.setMarker(PLAYER_X);
		}
		
	}

	

}
