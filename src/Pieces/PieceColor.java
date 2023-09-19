package Pieces;

import java.awt.*;

public enum PieceColor {
    WHITE(Color.WHITE),
    BLACK(Color.BLACK);

    private final Color color;

    PieceColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}