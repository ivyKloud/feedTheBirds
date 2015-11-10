package simulation.world;

/**
 * Created by Leelo on 29/10/2015.
 */
public class Food {

    private Position position;
    private FoodState state;

    public Food(Position position){
        this.position = position;
        this.state = FoodState.Fresh;

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public FoodState getState() {
        return state;
    }

    public void setState(FoodState state) {
        this.state = state;
    }
}
