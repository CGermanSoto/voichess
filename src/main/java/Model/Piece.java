package Model;

import Constants.Color;
public abstract class Piece {
    private Color color;
    private int row;
    private int col;

    public Piece() {
        this.color = color;
    }

    public Piece(Color color) {
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract boolean isValidMove(int targetRow, int targetCol);

    // Otros métodos comunes a todas las piezas
    public Color getColor() {
        return color;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
