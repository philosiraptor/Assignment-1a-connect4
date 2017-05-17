package com.company;

/**
 * Created by matt on 5/16/2017.
 */
enum Player {
    PLAYER1, PLAYER2
}

enum Type {
    BLACK, RED
}

public class Pieces {
    //instance variables
    private Player player;
    private Type gamePiece;

    //constructor method
    public Pieces(Player player, Type gamePiece) {
        this.player = player;
        this.gamePiece = gamePiece;

    }


    //methods

    /**
     * @return
     */
    public Player getPlayer() {

        return player;
    }

    /**
     * @return
     */
    public Type getGamePiece() {
        return gamePiece;
    }


}
