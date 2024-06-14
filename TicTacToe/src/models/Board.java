package models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final int size;

    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public int getSize() { return this.size; }

    public boolean canPlace(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> emptyCell = new Pair<>(i, j);
                    freeCells.add(emptyCell);
                }
            }
        }
        return freeCells;
    }

    public void display() {
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

}
