package board;

import pieces.Piece;

public class Tile {
	
	private final Color color; 
	private Status status;
	
	private final int rank; 
	private final int file; 
	private final String label; 
	
	private Piece piece;
	
	public Tile(final Color color, final int rank, final int file) {
		this.color = color; 
		this.status = Status.E; 
		this.piece = null;
		this.rank = rank; 
		this.file = file;
		this.label = " " + (char)('a' + this.rank) + ((int)(1+this.file));
	}
	

	public Color getColor() {
		return this.color; 
	}
	
	public Status getStatus() {
		return this.status; 
	}
	
	public String getLabel() {
		return this.label; 
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
		this.status = Status.O;
	}
	
	public Piece getPiece() {
		return this.piece; 
	}
	
	

}
