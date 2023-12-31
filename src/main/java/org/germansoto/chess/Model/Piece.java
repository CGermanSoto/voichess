package org.germansoto.chess.Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Piece extends ImageView {

    public Piece(String imagePath) {
        super(new Image(imagePath));
    }

    private String color;

    private int row;

    private int col;

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract boolean isValidMove(int targetRow, int targetCol);

    // Otros métodos comunes a todas las piezas


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
