package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColorGenerator {
    private static final List<Color> SELECTION = new ArrayList<>(
        Arrays.asList(Color.RED, Color.YELLOW, Color.BLUE, Color.GREEN, Color.PINK)
    );
    
    private Random random = new Random();


    public final Color getRandom() {
        return SELECTION.get(random.nextInt(0, SELECTION.size()));
    }
}
