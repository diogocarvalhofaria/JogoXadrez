package chess;

import boardgame.BoardEXception;

public class ChessException extends BoardEXception {
    private static long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
