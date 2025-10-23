package pieces;

import board.Color;

public class Rook extends Piece {
	
	private Color color; 

	public Rook(Color color, int rank, int file) {
		super(color, rank, file);
		this.color = color; 
	}
	
	@Override 
	public String toString() {
		return (color == Color.B) ? "R" : "r";	
	}
}
