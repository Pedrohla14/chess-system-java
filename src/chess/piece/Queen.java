package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above acima da pe?a
		p.setValues(position.getRow() - 1, position.getColum());
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// left
		p.setValues(position.getRow(), position.getColum() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setColum(p.getColum() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// right
		p.setValues(position.getRow(), position.getColum() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setColum(p.getColum() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		// below para baixo
		p.setValues(position.getRow() + 1, position.getColum());
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// nw noroeste
		p.setValues(position.getRow() - 1, position.getColum() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() - 1, p.getColum() - 1);
			;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// ne nordeste
		p.setValues(position.getRow() - 1, position.getColum() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() - 1, p.getColum() + 1);
			;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// se sudeste
		p.setValues(position.getRow() + 1, position.getColum() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() + 1, p.getColum() + 1);
			;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		// sw sudoeste
		p.setValues(position.getRow() + 1, position.getColum() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() + 1, p.getColum() - 1);
			;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		return mat;
	}
}