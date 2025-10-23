package pieces;

import board.Color;

public class Pawn extends Piece {
	
	private Color color; 

	public Pawn(Color color, int rank, int file) {
		super(color, rank, file);
		this.color = color; 
	}

	
	@Override 
	public String toString() {
		return (color == Color.B) ? "P" : "p";	
	}
}
