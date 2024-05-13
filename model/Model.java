package model;

import java.awt.Color;

import model.grid.Grid;

public class Model extends Grid<Color> {

    ColorFactory colorFactory;

    public Model(int rows, int cols) {
        super(rows, cols);
        colorFactory = new RandomColorFactory();
    }
    
}
