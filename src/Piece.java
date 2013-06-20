
public interface Piece {
	
	//駒を動かすメソッド
	public abstract void pieceMove();
	
	//駒を裏返すメソッド
	public abstract void pieceReverse();
	
	//駒を失うメソッド
	public abstract void pieceLose();
	
	//駒を得るメソッド
	public abstract void pieceGain();
	
	//駒を送り出すメソッド
	public abstract void pieceSend();
}
