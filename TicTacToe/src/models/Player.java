package models;

public class Player {

    private String name;

    private PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return this.name;
    }

    public PlayingPiece getPlayingPiece() {
        return this.playingPiece;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPlayingPiece(PlayingPiece newPlayingPiece) {
        this.playingPiece = newPlayingPiece;
    }


}
