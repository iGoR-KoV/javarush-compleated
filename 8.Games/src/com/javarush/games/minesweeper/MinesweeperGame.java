package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void setScreenSize(int width, int height) {
    }

    @Override
    public void initialize() {
        super.initialize();
        super.setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        super.setCellColor(x, y, Color.ORANGE);
    }

    private void createGame() {

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                gameField[j][i] = new GameObject(i, j);
                setCellColor(i, j, Color.ORANGE);
            }
        }
    }
}

