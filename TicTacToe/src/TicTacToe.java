import models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    Deque<Player> players;

    Board playingBoard;

    public void initGame() {
        players = new LinkedList<>();
        playingBoard = new Board(3);

        PlayingPiece x = new PlayingPieceX();
        PlayingPiece o = new PlayingPieceO();

        Player p1 = new Player("Player 1", x);
        Player p2 = new Player("Player 2", o);

        players.add(p1);
        players.add(p2);
    }

    public String startGame() {
        boolean noWinner = true;

        while (noWinner) {
            // Get the player
            Player curPlayer = players.removeFirst();

            // Display the board
            playingBoard.display();

            // Input the row & column
            System.out.println("Player " + curPlayer.getName() + " turn!");
            System.out.print("Please enter row, col:");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);

            List<Pair<Integer, Integer>> freeCells = playingBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Check if you can insert
            boolean canPlacePiece = playingBoard.canPlace(row, col, curPlayer.getPlayingPiece());
            if (!canPlacePiece) {
                System.out.println("You have chosen an incorrect cell, please try again");
                players.addLast(curPlayer);
                continue;
            }

            // check if there is a winner
            boolean isWinner = isWinner(row, col, curPlayer.getPlayingPiece());
            if (isWinner) {
                playingBoard.display();
                System.out.println("Winner is " + curPlayer.getName() + "!");
                break;
            }
            players.addLast(curPlayer);

        }

        return "Tie";
    }

    public boolean isWinner(int row, int col, PlayingPiece playingPiece) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // check for row match
        for (int i = 0; i < playingBoard.getSize(); i ++) {
            if (playingBoard.board[i][col] == null || playingBoard.board[i][col].getPieceType() != playingPiece.getPieceType()) {
                rowMatch = false;
                break;
            }
        }

        // check for column match
        for (int i = 0; i < playingBoard.getSize(); i ++) {
            if (playingBoard.board[row][i] == null || playingBoard.board[row][i].getPieceType() != playingPiece.getPieceType()) {
                columnMatch = false;
                break;
            }
        }

        // check for main diagonal
        for (int i = 0, j = 0; i < playingBoard.getSize(); i ++) {
            if (playingBoard.board[i][j] == null || playingBoard.board[i][j].getPieceType() != playingPiece.getPieceType()) {
                diagonalMatch = false;
                break;
            }
        }

        for (int i = 0, j = playingBoard.getSize() - 1; i < playingBoard.getSize(); i ++, j --) {
            if (playingBoard.board[i][j] == null || playingBoard.board[i][j].getPieceType() != playingPiece.getPieceType()) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return (rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch);
    }


}
