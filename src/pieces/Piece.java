package pieces;

import board.Color;

public class Piece {
	
	private final Color color; 
	private int rank; 
	private int file; 
	
	public Piece(final Color color, final int rank, final int file) {
		this.color = color; 
		this.rank = rank; 
		this.file = file; 
	}
	


}
