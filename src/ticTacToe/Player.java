package ticTacToe;

public class Player {
	
	private char marker;
	public boolean turn;

	public Player() {
		turn = false;
	}
	public Player(char marker) {
		this.marker = marker;
		turn = false;
	}
	
	public char getMarker() {
		return marker;
	}
	public void setMarker(char marker) {
		this.marker = marker;
	}
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	public boolean getTurn(boolean turn) {
		return turn;
	}

}
