package pieces;

import board.Color;

public class Queen extends Piece {
	
	private Color color; 
	
	public Queen(Color color, int rank, int file) {
		super(color, rank, file);
		this.color = color; 
	}

	@Override 
	public String toString() {
		return (color == Color.B) ? "Q" : "q";	
	}
}
