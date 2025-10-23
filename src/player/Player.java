package player;

import java.util.ArrayList;
import java.util.Scanner;

import board.Color;
import game.GameState;

import pieces.Piece;

public class Player {
	
	private final Color color; 
	private ArrayList<Piece> playable; 
	private ArrayList<Piece> removed;
	private Scanner scanner;
	
	public Player(final Color color) { 
		this.color = color; 
	} 
	
	public void setPlayablePieces(ArrayList<Piece> playable) {
		this.playable = playable; 
	}
	
	
	public ArrayList<Piece> getPlayablePieces() {
		return this.playable; 
	}
	
	public void removePlayablePiece(Piece piece) { 
		playable.remove(piece); 
		removed.add(piece); 
	}
	
	public ArrayList<Piece> getNonPlayablePieces() {
		return this.removed;
	}
	
	public Color getColor() {
		return this.color; 
	}
	
	@Override
	public String toString() {
		return (color == Color.B) ? "Black" : "White"; 
	}
	 

}
