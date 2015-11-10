package simulation.world;

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

}
