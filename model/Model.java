package model;

import java.awt.Color;

import controller.ControllableModel;
import model.grid.CellPosition;
import model.grid.Grid;
import model.grid.GridCell;
import model.grid.GridDimension;
import view.ViewableModel;

public class Model extends Grid<Color> implements ViewableModel, ControllableModel {

    private ColorGenerator generator;

    public Model(int rows, int cols) {
        super(rows, cols);
        generator = new ColorGenerator();   
    }

    @Override
    public void set(CellPosition pos) {
        this.set(pos, generator.getRandom());
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
