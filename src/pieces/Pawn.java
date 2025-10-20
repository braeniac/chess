package pieces;

import board.Color;

public class Pawn extends Piece {

	public Pawn(Color color, int rank, int file) {
		super(color, rank, file);
	}

	
	@Override 
	public String toString() {
		return "P";	
	}
}
