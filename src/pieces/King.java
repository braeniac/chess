package pieces;

import board.Color;

public class King extends Piece {
	
	private Color color; 

	public King(Color color, int rank, int file) {
		super(color, rank, file);
		this.color = color; 
	}
	
	
	@Override 
	public String toString() {
		return (color == Color.B) ? "K" : "k";	
	}
}
