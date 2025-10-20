package board;

public class Board {
	
	private static Board instance;
	private Tile[][] board; 
	
	private Board() {
		
		int row = 8; 
		int col = 8; 
		
		board = new Tile[row][col]; 
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				Color color = ((i+j) % 2 == 0) ? Color.W : Color.B; 
				board[i][j] = new Tile(color, i, j);
			}
		}
		
	}
	
	
	public void print() {
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				System.out.print(board[i][j].getLabel() + " "); 
			}
			System.out.println(); 
		}
	}
	
	public static Board getInstance() {
        if (instance == null) instance = new Board();
        return instance;
    }

}
