package view.worldView;

import simulation.world.Bird;
import simulation.world.Position;

import java.awt.*;

/**
 * Created by Leelo on 10/11/2015.
 */
public class BirdView {

    private Color color;
    private int d;
    private Position position;

    public BirdView(Color color, int diameter){
        this.color = color;
        this.d = diameter;
    }

    public void paintBird(Graphics g, Bird b){
        g.setColor(this.color);
        g.fillOval(b.getPosition().getX(),b.getPosition().getY(),d,d);

    }

}
