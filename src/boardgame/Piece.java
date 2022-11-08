package boardgame;

public class Piece {

	protected Position position ;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;// não há necessidade
	}

	protected Board getBoard() {
		return board;
	}

}
