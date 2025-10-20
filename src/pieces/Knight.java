package pieces;

import board.Color;

public class Knight extends Piece {

	public Knight(Color color, int rank, int file) {
		super(color, rank, file);
	}
	
	@Override 
	public String toString() {
		return "N";	
	}
}
