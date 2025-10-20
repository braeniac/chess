package pieces;

import board.Color;

public class Rook extends Piece {

	public Rook(Color color, int rank, int file) {
		super(color, rank, file);
	}
	
	@Override 
	public String toString() {
		return "R";	
	}
}
