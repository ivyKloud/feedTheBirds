package models;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {

	private ArrayList<Bird> birds;
	private ArrayList<Food> foods;
 	
	/**
	 * We initialize the model with 3 birds
	 */
	public Model () {
		this.birds = new ArrayList<Bird>();
		this.foods = new ArrayList<Food>();
		
		Bird bird = new Bird(200, 200);
		Bird bird2 = new Bird(500, 700);
		Bird bird3 = new Bird(100, 600);
		
		this.birds.add(bird);
		this.birds.add(bird2);
		this.birds.add(bird3);
	}
	
	/**
	 * Called by the controllers on click
	 * Add a new food at the point we clicked on
	 * Notify the view then
	 * @param x
	 * @param y
	 */
	public void newFood (int x, int y) {
		
		Food food = new Food(x, y);
		this.foods.add(food);
		
		this.setChanged();
		this.notifyObservers();
		
	}

	// Getters and Setters //
	public ArrayList<Bird> getBirds() {
		return birds;
	}

	public void addBirds(Bird bird) {
		this.birds.add(bird);
	}
	
	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void addFood (Food food) {
		this.foods.add(food);
	}
	
	public void removeFood (Food food) {
		if (this.foods.contains(food))
			this.foods.remove(food);
	}
	
	
	
}
