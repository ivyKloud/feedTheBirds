package view;

import simulation.Simulation;
import simulation.world.Bird;
import simulation.world.Food;
import view.worldView.BirdView;
import view.worldView.FoodView;

import java.awt.*;

import javax.swing.JLabel;

/**
 * Created by Leelo on 10/11/2015.
 */
public class TheView {

    private MainFrame main;
    private BirdView birdView;
    private FoodView foodView;

    public TheView(int width,int height){
        this.main = new MainFrame(width,height);
        this.birdView = new BirdView(Color.LIGHT_GRAY,20);
        this.foodView = new FoodView();
    }

    public void paint(Simulation sim){
        printMain(sim);
    }

    private void printMain(Simulation sim) {
        Graphics g = this.main.getPanel().getGraphics();

        // Background = carre plein blanc
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, sim.getPosMax().getX(), sim.getPosMax().getY());

        for(Bird b : sim.getBirds()){
            this.birdView.paintBird(g,b);
        }

        for(Food f : sim.getFood()){
            this.foodView.paintFood(g,f);
        }
    }
}
