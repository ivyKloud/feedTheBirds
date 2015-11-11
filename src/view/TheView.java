package view;

import simulation.Simulation;
import simulation.world.Bird;
import simulation.world.Food;
import simulation.world.Position;
import view.worldView.BirdView;
import view.worldView.FoodView;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

/**
 * Created by Leelo on 10/11/2015.
 */
public class TheView {

    private MainFrame main;
    private BirdView birdView;
    private FoodView foodView;
    private Simulation sim;

    public TheView(int width,int height,Simulation sim){
        this.main = new MainFrame(width,height);
        this.birdView = new BirdView(Color.LIGHT_GRAY,20);
        this.foodView = new FoodView();
        this.sim = sim;

        this.main.getPanel().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point p = e.getPoint();
                TheView.this.sim.addFood(new Position((int)(p.getX()),(int)(p.getY())));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public void paint(){
        printMain();
    }

    private void printMain() {
        Graphics g = this.main.getPanel().getGraphics();

        // Background = carre plein blanc
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.sim.getPosMax().getX(), this.sim.getPosMax().getY());

        for(Bird b : this.sim.getBirds()){
            this.birdView.paintBird(g,b);
        }

        for(Food f : this.sim.getFood()){
            this.foodView.paintFood(g,f);
        }
    }
}
