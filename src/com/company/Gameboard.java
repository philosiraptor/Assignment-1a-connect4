package com.company;

/**
 * Created by matt on 5/16/2017.
 */

import java.util.*;

public class Gameboard {

    //instance variable
    private ArrayList<Pieces> boardGrid = new ArrayList<Pieces>();
    private int maxrow;
    private int maxcolumn;

    /**
     * @param rows sets a placeholder for the maxrow which is defined by the game class.
     * @param columns sets a placeholder for the maxcolumn which is defined by the game.
     */
    //constructor method
    public Gameboard(int rows, int columns) {
        this.maxcolumn = columns;
        this.maxrow = rows;
        for (int i = 0; i < maxrow * maxcolumn; i++) {
            boardGrid.add(null);
        }
    }
    //methods

    /**
     * @param row    row position of the piece
     * @param column column position of the piece
     * @return
     */
    public Pieces getPiece(int row, int column) {
        if (row <= maxrow || column <= maxcolumn) {
            //error

        }
        return boardGrid.get(row + (column * maxrow));
    }

    /**
     * @param row
     * @param column
     * @param piece
     * @return
     */
    public boolean setPiece(int row, int column, Pieces piece) {
        if (row <= maxrow || column <= maxcolumn) {
            //error
            return false;
        }
        boardGrid.set(row + (column * maxrow), piece);//replace null to piece object
        return true;
    }

}

