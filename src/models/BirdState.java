package models;

public enum BirdState {
	Eat("is eating"),
	Immobile("doing nothing"),
	Move("is moving"),
	Affraid("is scared");
	
	private String state = "";
	   
	BirdState(String state){
		this.state = state;
	}
	   
	public String toString(){
		return state;
	}
}
