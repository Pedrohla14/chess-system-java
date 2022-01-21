package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	

	public Bishop(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString () {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		
		Position p= new Position(0, 0);
		
		//nw noroeste
		p.setValues(position.getRow()-1, position.getColum()-1);
		while(getBoard().positionExists(p)&& !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()]=true;
			p.setValues(p.getRow()-1, p.getColum()-1);;
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColum()]=true;
		}
		//ne nordeste 
		p.setValues(position.getRow()-1, position.getColum()+1);
		while(getBoard().positionExists(p)&& !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()]=true;
			p.setValues(p.getRow()-1, p.getColum()+1);;
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColum()]=true;
		}
		// se sudeste
		p.setValues(position.getRow()+1, position.getColum()+1);
		while(getBoard().positionExists(p)&& !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()]=true;
			p.setValues(p.getRow()+1, p.getColum()+1);;
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColum()]=true;
		}
		
		//sw sudoeste
				p.setValues(position.getRow()+1, position.getColum()-1);
				while(getBoard().positionExists(p)&& !getBoard().thereIsPiece(p)) {
					mat[p.getRow()][p.getColum()]=true;
					p.setValues(p.getRow()+1, p.getColum()-1);;
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
					mat[p.getRow()][p.getColum()]=true;
				}
		
		
		return mat;
	}
}

