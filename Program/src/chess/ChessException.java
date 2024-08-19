package chess;

public class ChessException extends RuntimeException{
    private static long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
