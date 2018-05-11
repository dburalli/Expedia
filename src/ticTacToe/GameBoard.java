package ticTacToe;


public class GameBoard {

	//tic tac toe size
	private char[][] gameBoard = new char[3][3];
	private int moveCount;
	
	public GameBoard() {
		//creates gameboard shaped like
		// 0 1 2
		// 0 1 2
		// 0 1 2 
		gameBoard = new char[][] {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
		moveCount = 0;
	}
	public int getMoveCount() {
		return moveCount;
	}
	//returns the Board
	public char[][] getGameBoard() {
		
		return gameBoard;
	}
	public void setGameBoard(int x, int y, char marker){
		gameBoard[x][y] = marker;
		moveCount++;
	}

	
	public void displayBoard() {

		String outputDisplay = "";
		for(int i = 0;i<gameBoard.length;i++) {
			for(int j = 0;j<gameBoard.length;j++){
				
				outputDisplay += gameBoard[i][j] + " ";

			}
			//after each row, new line
			outputDisplay +="\n";
		}
		System.out.println(outputDisplay);
	}
	
	public boolean submitMove(char marker, int x, int y) {
		if (validateMove(x,y) == true) {
			setGameBoard(x,y,marker);
			return true;
		}
		return false;
	}
	public boolean validateMove(int x, int y) {
		if(x < 0 || x > 2) {
			System.out.println("Incorrect X Coordinate");
			return false;
		}else if(y < 0 || y > 2) {
			System.out.println("Incorrect Y Coordinate");
			return false;
		}else if(getGameBoard()[x][y] != '-') {
			System.out.println("Space Taken");
			return false;
		}
		return true;
	}
	public boolean checkForWinner() {		
			
		for(int i = 0; i < gameBoard.length; i++) {
			//checks each row
			if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][2] == gameBoard[i][1] && gameBoard[i][0] != '-'){
				return true;
				//checks columns
			}else if(gameBoard[0][i] == gameBoard[1][i] && gameBoard[1][i] == gameBoard[2][i] && gameBoard[0][i] != '-') {
				return true;
				//checks cross
			}else if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[2][2] == gameBoard[1][1] && gameBoard[1][1] != '-') {
				return true;
				//checks other cross
			}else if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] != '-') {
				return true;
			}
		}
		
		
		return false;
	}
	
}
