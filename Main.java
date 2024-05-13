import javax.swing.JFrame;

import controller.Controller;
import model.Model;
import view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model(9, 9);
    
        View view = new View(model);
        new Controller(model, view);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(view);
        frame.pack();
        frame.setVisible(true);
    }
}