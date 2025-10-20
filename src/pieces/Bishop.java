package pieces;

import board.Color;

public class Bishop extends Piece {

	public Bishop(Color color, int rank, int file) {
		super(color, rank, file);
	}
	
	@Override 
	public String toString() {
		return "B";	
	}
}
