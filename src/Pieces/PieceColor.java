package Pieces;

public enum PieceColor {
    WHITE("\u001B[37m"),
    BLACK("\u001B[33m");

    private final String color;

    PieceColor(String color) {
        this.color = color;
    }

    public String getStringColor() {
        return this.color;
    }
}