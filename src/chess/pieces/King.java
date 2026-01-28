package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //Above
        p.setValues(position.getRow() - 1, position.getCollum());
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Below
        p.setValues(position.getRow() + 1, position.getCollum());
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Left
        p.setValues(position.getRow(), position.getCollum() - 1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Right
        p.setValues(position.getRow(), position.getCollum() + 1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Top Right
        p.setValues(position.getRow() - 1, position.getCollum() + 1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Top Left
        p.setValues(position.getRow() - 1, position.getCollum() - 1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Down Right
        p.setValues(position.getRow() + 1, position.getCollum() + 1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //Down Left
        p.setValues(position.getRow() + 1, position.getCollum() - 1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }


        return mat;
    }
}
