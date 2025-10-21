package pieces;

import board.Color;

public class Queen extends Piece {
	
	public Queen(Color color, int rank, int file) {
		super(color, rank, file);
	}

	@Override 
	public String toString() {
		return "Q"; 
	}
}
