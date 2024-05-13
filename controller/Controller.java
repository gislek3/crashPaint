package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.View;

public class Controller extends MouseAdapter {
    private ControllableModel model;
    private View view;

    public Controller(ControllableModel model, View view) {
        this.model = model;
        this.view = view;
        this.view.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        model.set(view.getPixelConverter().pointToCellPosition(e.getPoint()));
        view.repaint();
    }
}
