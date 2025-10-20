package board;

import java.util.ArrayList;
import java.util.Collections;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;
import player.Player;

public class Board {
	
	private static Board instance;
	
	private Tile[][] board; 
	private Piece piece;
	private int rank; 
	private int file; 
	
	private ArrayList<Piece> blackPieces; 
	private ArrayList<Piece> whitePieces; 
	
	public static final String RED = "\u001B[31m";
	public static final String RESET = "\u001B[30m";
	   
	
	private Board() { 	
		rank = 8; 
		file = 8; 
		
		board = new Tile[rank][file]; 
		blackPieces = new ArrayList<>(); 
		whitePieces = new ArrayList<>(); 
		
		//create chess board
		for (int i=0; i<rank; i++) {
			for (int j=0; j<file; j++) {
				Color color = (i+j) % 2 == 0 ? Color.W : Color.B;
				board[i][j] = new Tile(color, i, j);
			}
		}	
		//populate chess board
		populateChessBoard(); 
	}
	
	public void makeTurn(Player player) {
		
		player.parseMove();
		
	}
	
	private void populateChessBoard() {	
		
		//create black pieces 
		Piece rbl = new Rook	(Color.B,7,0);
		Piece nbl = new Knight	(Color.B,7,1); 
		Piece bbl = new Bishop	(Color.B,7,2); 
		Piece bq = 	new Queen	(Color.B,7,3); 
		Piece bk = 	new King	(Color.B,7,4); 
		Piece bbr = new Bishop	(Color.B,7,5);
		Piece nbr = new Knight 	(Color.B,7,6); 
		Piece rbr = new Rook	(Color.B,7,7); 
		
		Piece pa = new Pawn		(Color.B,6,0);
		Piece pb = new Pawn		(Color.B,6,1); 
		Piece pc = new Pawn		(Color.B,6,2); 
		Piece pd = new Pawn		(Color.B,6,3); 
		Piece pe = new Pawn		(Color.B,6,4); 
		Piece pf = new Pawn		(Color.B,6,5);
		Piece pg = new Pawn 	(Color.B,6,6); 
		Piece ph = new Pawn		(Color.B,6,7); 
		
		//populate board with pieces 
		board[7][0].setPiece(rbl);
		board[7][1].setPiece(nbl);
		board[7][2].setPiece(bbl);
		board[7][3].setPiece(bq);
		board[7][4].setPiece(bk);
		board[7][5].setPiece(bbr);
		board[7][6].setPiece(nbr);
		board[7][7].setPiece(rbr);
		
		board[6][0].setPiece(pa);
		board[6][1].setPiece(pb);
		board[6][2].setPiece(pc);
		board[6][3].setPiece(pd);
		board[6][4].setPiece(pe);
		board[6][5].setPiece(pf);
		board[6][6].setPiece(pg);
		board[6][7].setPiece(ph);
		
		//keep track of black players available pieces
		Collections.addAll(blackPieces, rbl, nbl, bbl, bq, bk, bbr, rbr, pa, pb, pc, pd, pe, pf, pg, ph);
		
		
		//create white pieces 
		Piece rwl = new Rook	(Color.W,0,0);
		Piece nwl = new Knight	(Color.W,0,1); 
		Piece bwl = new Bishop	(Color.W,0,2); 
		Piece wq = 	new Queen	(Color.W,0,3); 
		Piece wk = 	new King	(Color.W,0,4); 
		Piece bwr = new Bishop	(Color.W,0,5);
		Piece nwr = new Knight 	(Color.W,0,6); 
		Piece rwr = new Rook	(Color.W,0,7); 
				
		Piece paw = new Pawn	(Color.W,1,0);
		Piece pbw = new Pawn	(Color.W,1,1); 
		Piece pcw = new Pawn	(Color.W,1,2); 
		Piece pdw = new Pawn	(Color.W,1,3); 
		Piece pew = new Pawn	(Color.W,1,4); 
		Piece pfw = new Pawn	(Color.W,1,5);
		Piece pgw = new Pawn 	(Color.W,1,6); 
		Piece phw = new Pawn	(Color.W,1,7); 
				
		//populate board with pieces 
		board[0][0].setPiece(rwl);
		board[0][1].setPiece(nwl);
		board[0][2].setPiece(bwl);
		board[0][3].setPiece(wq);
		board[0][4].setPiece(wk);
		board[0][5].setPiece(bwr);
		board[0][6].setPiece(nwr);
		board[0][7].setPiece(rwr);
				
		board[1][0].setPiece(pa);
		board[1][1].setPiece(pb);
		board[1][2].setPiece(pc);
		board[1][3].setPiece(pd);
		board[1][4].setPiece(pe);
		board[1][5].setPiece(pf);
		board[1][6].setPiece(pg);
		board[1][7].setPiece(ph);
				
		//keep track of white players available pieces
		Collections.addAll(whitePieces, rwl, nwl, bwl, wq, wk, bwr, rwr, paw, pbw, pcw, pdw, pew, pfw, pgw, phw);
	}
	
	public void display() {
		for (int i=rank-1; i>=0; i--) {
			for (int j=0; j<file; j++) {
				
				if (j== 0) {
					System.out.print(RED+(i+1) + "   "+RESET);
				}
				
				if (board[i][j].getStatus() == Status.O) {					
					System.out.print(board[i][j].getPiece().toString() + "  ");  
				} else {
					System.out.print("-" + "  ");  
				}
			}
			System.out.println(" \n"); 
		}
	    System.out.println(RED+"    a  b  c  d  e  f  g  h"+RESET);
	}
	
	public ArrayList<Piece> getBlackPieces() {
		return this.blackPieces; 
	}
	
	public ArrayList<Piece> getWhitePieces() {
		return this.whitePieces; 
	}

	public static Board getInstance() {
        if (instance == null) instance = new Board();
        return instance;
    }

}
