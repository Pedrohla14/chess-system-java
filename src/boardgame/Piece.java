package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position=null;
	}

	protected Board getBoard() {
		return board;
	}

	
	/*
public Board(int rows, int columns) {
	this.rows = rows;
	this.columns = columns;
	pieces= new Piece [rows][columns];
}
*/

}
