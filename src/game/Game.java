package game;

import java.util.Scanner;

import board.Board;
import board.Color;
import player.Player;
import pieces.Piece;
import utility.Message; 

public class Game {
	
	private Board board;
	private Player white; 
	private Player black;
	private Player current; 
	private GameState gameState;
	private Scanner scanner;
	
	Game() {
		board = Board.getInstance(); 
		white = new Player(Color.W); 
		black = new Player(Color.B); 	
	}
	
	public void start() {
		
		gameState = GameState.IN_PROGRESS;
		current = white;
		white.setPlayablePieces(board.getWhitePieces());
		black.setPlayablePieces(board.getBlackPieces());
		scanner = new Scanner(System.in); 
		run(); 
	
	}
	
	//game loop 
	private void run() {
		
		while(gameState == GameState.IN_PROGRESS) {	
			board.display(); 			
			System.out.println("\n Please make a move (e.g. a2,a3): "); 
			makeMove();
			if (gameState == GameState.ABORTED) {
				scanner.close();
				Message.concedeMsg(current);
				break; 
			}
			current = (current == white) ? black : white;
		}
		
	}
	
	private void makeMove() {
		
		while (true) {
			System.out.print("> "); 
			String input = scanner.nextLine();
			
			if (input.equals("q") || input.equals("quit")) { 
				gameState = GameState.ABORTED; 
				scanner.close(); 
				return;
			} 
			input = input.replace("\\s+", ""); 
			if (input.matches("^[a-h][1-8],?[a-h][1-8]$")) {
				String from = input.substring(0,2); 
				String to = input.substring(3,5); 
				board.performMove(from, to, current);
				return;
			} else {
				System.out.println("Please try again..."); 
			}
			System.out.println(""); 
		}
		
	}
	
}
