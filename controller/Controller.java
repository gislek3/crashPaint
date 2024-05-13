package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller extends MouseAdapter {
    private ControllableModel model;
    private View view;

    public Controller(ControllableModel model, View view) {
        this.model = model;
        this.view = view;
        this.view.addMouseListener(this);
    }

}
