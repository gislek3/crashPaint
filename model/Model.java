package model;

import java.awt.Color;

import model.grid.Grid;
import model.grid.GridCell;
import model.grid.GridDimension;
import view.ViewableModel;

public class Model extends Grid<Color> implements ViewableModel {

    ColorFactory colorFactory;

    public Model(int rows, int cols) {
        super(rows, cols);
        colorFactory = new RandomColorFactory();
    }

    @Override
    public GridDimension getDimension() {
        return this;
    }

    @Override
    public Iterable<GridCell<Color>> getBoard() {
        return this;
    }
    
}
