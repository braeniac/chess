package pieces;

import board.Color;

public class King extends Piece {

	public King(Color color, int rank, int file) {
		super(color, rank, file);
	}

	
	@Override 
	public String toString() {
		return "K";	
	}
}
