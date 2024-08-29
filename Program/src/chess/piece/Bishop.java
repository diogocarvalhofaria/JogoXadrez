package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

    public Bishop (Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //NE
        p.setValues(position.getRow() - 1 , position.getColumn() + 1 );
        while (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1  , position.getColumn() + 1);
        }
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //NW
        p.setValues(position.getRow() - 1 , position.getColumn());
        while (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1  , position.getColumn() - 1);
        }
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //SE
        p.setValues(position.getRow() + 1, position.getColumn()  + 1 );
        while (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1  , position.getColumn() + 1);
        }
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //SW
        p.setValues(position.getRow() + 1 , position.getColumn() - 1);
        while (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1  , position.getColumn() - 1);
        }
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
