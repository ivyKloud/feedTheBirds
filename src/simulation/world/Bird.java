package simulation.world;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/**
 * Created by Leelo on 29/10/2015.
 */
public class Bird {

    private Position position;
    private BirdState state;

    public Bird(Position position){
        this.position = position;
        this.state = BirdState.Sleep;

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BirdState getState() {
        return state;
    }

    public void setState(BirdState state) {
        this.state = state;
    }

    public void nextPos(Food food, Position posMax) {
        int newX = 0, newY = 0;
        if(this.getPosition().getX() > food.getPosition().getX()){
            newX = this.getPosition().getX() - 1;
        }else if(this.getPosition().getX() < food.getPosition().getX()){
            newX = this.getPosition().getX() + 1;
        }else{
            newX = this.getPosition().getX();
        }
        if(this.getPosition().getY() > food.getPosition().getY()){
            newY = this.getPosition().getY() - 1;
        }else if(this.getPosition().getY() < food.getPosition().getY()){
            newY = this.getPosition().getY() + 1;
        }else{
            newY = this.getPosition().getY();
        }

        this.setPosition(new Position(newX,newY));
    }

    public Food getCloserFood(ArrayList<Food> food){
        double min = 1000;
        double current;
        Food closerFood = null;
        for(Food f : food){
            if(f.getState().equals(FoodState.Fresh)){
                current = this.getPosition().getDistance(f.getPosition());
                if(current < min){
                    min = current;
                    closerFood = f;
                }
            }
        }

        return closerFood;


    }
}
