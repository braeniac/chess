package game;

import board.Board;

public class Main {
	
	public void run() { 
		
		Board board = Board.getInstance(); 
		board.print();
		
	}
	
	public static void main(String[] args) {
		new Main().run(); 
	}

}
