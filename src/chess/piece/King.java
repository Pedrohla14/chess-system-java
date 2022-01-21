package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString () {
		return "K";
	}
	private boolean canMove(Position position) {
		ChessPiece p= (ChessPiece)getBoard().piece(position);
		return p==null || p.getColor() !=getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		//above acima
		p.setValues(position.getRow()-1, position.getColum());
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		// below abaixo
		p.setValues(position.getRow()+1, position.getColum());
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		//left
		p.setValues(position.getRow(), position.getColum()-1);
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		//right
		p.setValues(position.getRow(), position.getColum()+1);
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		//nw noroeste
		p.setValues(position.getRow()-1, position.getColum()-1);
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		//ne nordeste
		p.setValues(position.getRow()-1, position.getColum()+1);
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		//sw sudoeste
		p.setValues(position.getRow()+1, position.getColum()-1);
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		//se sudeste
		p.setValues(position.getRow()+1, position.getColum()+1);
		if(getBoard().positionExists(p) &&canMove(p)) {
			mat[p.getRow()][p.getColum()]= true;
		}
		return mat;
	}


}
