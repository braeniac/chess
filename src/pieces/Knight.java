package pieces;

import board.Color;

public class Knight extends Piece {
	
	private Color color; 

	public Knight(Color color, int rank, int file) {
		super(color, rank, file);
		this.color = color; 
	}
	
	@Override 
	public String toString() {
		return (color == Color.B) ? "N" : "n";	
	}
}
