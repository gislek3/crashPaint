import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;
import model.Model;
import view.View;


public class Main {
    public static void main(String[] args) {
        Model model = new Model(64, 64);
        View view = new View(model);
        new Controller(model, view);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(view);
        frame.pack();
        frame.setVisible(true);
    }
}