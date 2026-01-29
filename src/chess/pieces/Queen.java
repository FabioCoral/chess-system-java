package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        p.setValues(position.getRow() - 1, position.getCollum());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setRow(p.getRow() - 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Left
        p.setValues(position.getRow(), position.getCollum() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setCollum(p.getCollum() - 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Right
        p.setValues(position.getRow(), position.getCollum() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setCollum(p.getCollum() + 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Below
        p.setValues(position.getRow() + 1, position.getCollum());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setRow(p.getRow() + 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Top right
        p.setValues(position.getRow() - 1, position.getCollum() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow() - 1, p.getCollum() + 1);

        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Top left
        p.setValues(position.getRow() - 1, position.getCollum() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow() - 1, p.getCollum() - 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Down right
        p.setValues(position.getRow() + 1, position.getCollum() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow() + 1, p.getCollum() + 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Down left
        p.setValues(position.getRow() + 1, position.getCollum() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow() + 1, p.getCollum() - 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        return mat;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
