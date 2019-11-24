package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private  static final int SIDE = 9;
    private  int  countMinesOnField = 0;
    private boolean mine;
    private GameObject[][]  gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for(int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField[0].length; y++) {

                if (getRandomNumber(10) == 0) {
                    mine = true;
                    countMinesOnField++;
                } else {
                    mine = false;
                }
                gameField[y][x] = new GameObject(x, y, mine);
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
}

