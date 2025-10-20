package game;

import board.Board;
import board.Color;
import player.Player;
import pieces.Piece;

public class Game {
	
	private Board board;
	private Player white; 
	private Player black;
	private GameState gameState;
	private Color currentTurn;  
	
	public Game() {
		board = Board.getInstance(); 
		white = new Player(); 
		black = new Player(); 	
	}
	
	public void start() {
		gameState = GameState.IN_PROGRESS;
		currentTurn = Color.W;
		white.setPlayablePieces(board.getWhitePieces());
		black.setPlayablePieces(board.getBlackPieces());
		run(); 
	}
	
	
	//game loop 
	private void run() {
		while(gameState == GameState.IN_PROGRESS) {
			
			board.display(); 
			
			System.out.println("\n Please make a move (e.g. a2,a3): "); 
		
			if (currentTurn == Color.W) {
				board.makeTurn(white); 
				currentTurn = Color.B; 
			} else {
				board.makeTurn(black); 
				currentTurn = Color.W; 
			}
			break;
		}
	}

}
