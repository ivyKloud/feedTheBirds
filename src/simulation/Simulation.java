package simulation;

import simulation.world.Bird;
import simulation.world.Food;
import simulation.world.Position;

import java.util.ArrayList;

/**
 * Created by Leelo on 10/11/2015.
 */
public class Simulation {

    private Position posMax;
    private ArrayList<Bird> birds;
    private ArrayList<Food> food;

    public Simulation(int xMax, int yMax){
        this.posMax = new Position(xMax,yMax);
        this.birds = new ArrayList<Bird>();
        this.food = new ArrayList<Food>();
    }

    public Position getPosMax(){
        return this.posMax;
    }

    public void nextStep() {

    }

    public void setBirds(int nbBirds){
        for(int i = 0 ; i < nbBirds ; i++){
            this.birds.add(new Bird(Position.getRandomPos(posMax)));
        }

    }

    public ArrayList<Bird> getBirds(){
        return this.birds;
    }

    public void addFood(Position p){
        this.food.add(new Food(p));
    }

    public ArrayList<Food> getFood(){
        return this.food;
    }
}
