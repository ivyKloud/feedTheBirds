package models;

import java.awt.Color;
import java.awt.Graphics;
 /**
  *	Class representing a bird 
  * @author major
  *
  */
public class Bird extends Entity {
	
	private static int numberBird = 0; // Number of birds created
	private int numBird; // Number of this particular bird
	private BirdState state;
	private Position targetPosition;
	private Food foodLocked;
	private long beginEating;
	
	public static final long TIME_EATING = 1000;
	
	/**
	 * Initializing a Bird with a dimension of 50 (diameter), 
	 * a DARK_GRAY color and an Immobile state
	 * Each bird is represented by a number
	 * @param positionX
	 * @param positionY
	 */
	public Bird (int positionX, int positionY) {
		super(50, positionX, positionY, Color.DARK_GRAY);
		
		this.state = BirdState.IMMOBILE;
		numberBird++;
		this.numBird = numberBird;
		this.targetPosition = null;
		this.foodLocked = null;
	}
	
	/**
	 * Method for drawing a bird on a panel : 
	 * it will be a full circle with a number inside
	 * @param g
	 */
	@Override
	public void draw(Graphics g) {
		
		g.setColor(this.color);
		g.fillOval(this.position.getX() - (this.dimension / 2), this.position.getY() - (this.dimension / 2), this.dimension, this.dimension);
		g.setColor(Color.WHITE);
		g.drawString(String.valueOf(this.numBird), this.position.getX(), this.position.getY());
	
	}
	
	/**
	 * Move 1 step toward the target Position
	 */
	public void moveToTarget() {
		if (this.position.getX() < this.targetPosition.getX()) {
			this.position.setX(this.position.getX() + 1);
		} else if (this.position.getX() > this.targetPosition.getX()) {
			this.position.setX(this.position.getX() - 1);
		}
		
		if (this.position.getY() < this.targetPosition.getY()) {
			this.position.setY(this.position.getY() + 1);
		} else if (this.position.getY() > this.targetPosition.getY()) {
			this.position.setY(this.position.getY() - 1);
		}
	}
	
	// Getters and Setters //
	public int getNumBird() {
		return this.numBird;
	}
	
	public BirdState getState() {
		return state;
	}

	public void setState(BirdState state) {
		this.state = state;
		if (state == BirdState.EAT) {
			this.setBeginEating(System.currentTimeMillis());
		}
	}

	public Position getTargetPosition() {
		return targetPosition;
	}

	public void setTargetPosition(Position targetPosition) {
		this.targetPosition = targetPosition;
	}

	public Food getFoodLocked() {
		return foodLocked;
	}

	public void setFoodLocked(Food foodLocked) {
		this.foodLocked = foodLocked;
	}

	public long getBeginEating() {
		return beginEating;
	}

	public void setBeginEating(long beginEating) {
		this.beginEating = beginEating;
	}

}
