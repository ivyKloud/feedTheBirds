package models;

/**
 * Different states of a bird
 * @author major
 * 
 */
public enum BirdState {

	IMMOBILE("is sleeping"),
	EAT("is eating"),
	MOVE("is moving"),
	AFFRAID("is scared");
	
	private String action;
	
	BirdState (String action) {
		this.action = action;
	}
	
	public String toString () {
		return this.action;
	}
	
}
