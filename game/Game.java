package game;

import enums.*;
import board.Board;

public class Game {

    boolean winW = false;
    boolean winB = false;

    Color turn = Color.WHITE;

    int halfMoveCounter = 0;
    int wholeMoveCounter = 1;

    Board board;

    public Game() {
        this.board = new Board();
    }

    


    
    
}