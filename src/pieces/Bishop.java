package pieces;

import board.Color;

public class Bishop extends Piece {

	private Color color; 
	
	public Bishop(Color color, int rank, int file) {
		super(color, rank, file);
		this.color = color; 
	}
	
	@Override 
	public String toString() {
		return (color == Color.B) ? "B" : "b";	
	}
}
