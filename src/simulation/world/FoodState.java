package simulation.world;

/**
 * Created by Leelo on 10/11/2015.
 */
public enum FoodState {
    Fresh("is fresh"),
    Rotten("is rotten");


    private String state = "";

    FoodState(String state){
        this.state = state;
    }

    public String toString(){
        return state;
    }
}
