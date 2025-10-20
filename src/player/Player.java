package player;

import java.util.ArrayList;
import java.util.Scanner;

import pieces.Piece;

public class Player {
	
	private ArrayList<Piece> playable; 
	private ArrayList<Piece> removed;
	private Scanner scanner;
	
	public Player() {
		scanner = new Scanner(System.in);	
		removed = null;
	}
	
	public void parseMove() {
		System.out.print("> "); 
		String input = scanner.nextLine().toLowerCase(); 
		String[] res = input.trim().split(","); 
		
		for (int i=0; i<res.length; i++) {
			System.out.println(res[i].trim()); 
		}
		
		
	}

	public void setPlayablePieces(ArrayList<Piece> playable) {
		this.playable = playable; 
	}
	
	public ArrayList<Piece> getPlayablePieces() {
		return this.playable; 
	}
	
	 

}
