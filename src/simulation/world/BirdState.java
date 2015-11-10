package simulation.world;

/**
 * Created by Leelo on 10/11/2015.
 */
public enum BirdState {
    Eat("is eating"),
    Sleep("is asleep"),
    Move("is moving"),
    Afraid("is scared");

    private String state = "";

    BirdState(String state){
        this.state = state;
    }

    public String toString(){
        return state;
    }
}
