package pieces;

import board.Color;

public class Piece {
	
	private final Color color; 
	private int rank; 
	private int file; 
	
	private boolean hasMoved; 
	
	public Piece(final Color color, final int rank, final int file) {
		this.color = color; 
		this.rank = rank; 
		this.file = file; 
		hasMoved = false; 
	}
	
	public Color getColor() {
		return this.color; 
	}	
}
