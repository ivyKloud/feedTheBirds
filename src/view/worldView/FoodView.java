package view.worldView;

import simulation.world.Food;
import simulation.world.FoodState;
import simulation.world.Position;

import java.awt.*;

/**
 * Created by Leelo on 10/11/2015.
 */
public class FoodView {

    private int d;
    private Position position;

    public FoodView(){
        this.d = 5;
    }

    public void paintFood(Graphics g, Food food){
        Color c = (food.getState().equals(FoodState.Fresh)) ? Color.GREEN : Color.RED;

        g.setColor(c);
        g.fillRect(food.getPosition().getX(),food.getPosition().getY(),d,d);

    }
}
