package models;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
	
	private ArrayList<Food> foods;
	private ArrayList<Bird> birds;
	
	public Model () {
		
		this.foods = new ArrayList<Food>();
		this.birds = new ArrayList<Bird>();
		
		Food food = new Food(150, 150);
		foods.add(food);
		
		Bird bird1 = new Bird(20, 20);
		Bird bird2 = new Bird(400, 400);
		birds.add(bird1);
		birds.add(bird2);
	}
	
	public void moveBirds (int positionX, int positionY) {
		
		Bird bird = birds.get(0);
		
		// Moving the bird while we are not a the desired position
		while (bird.getPositionX() != positionX || bird.getPositionY() != positionY) {
			
			
			if (bird.getPositionX() < positionX)
				bird.setPositionX(bird.getPositionX() + 1);
			else if (bird.getPositionX() > positionX)
				bird.setPositionX(bird.getPositionX() - 1);
			
			if (bird.getPositionY() < positionY)
				bird.setPositionY(bird.getPositionY() + 1);
			else if (bird.getPositionY() > positionY)
				bird.setPositionY(bird.getPositionY() - 1);
			
			birds.set(0, bird);
			
			this.setChanged();
			this.notifyObservers();
			
		}
		
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

	public ArrayList<Bird> getBirds() {
		return birds;
	}

	public void setBirds(ArrayList<Bird> birds) {
		this.birds = birds;
	}
	
	
}
