package models;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Abstract class representing an entity (Children will be Bird and Food)
 * @author major
 *
 */
public abstract class Entity {

	protected int dimension;
	protected Position position;
	protected Color color;
	
	public Entity (int dimension, int positionX, int positionY, Color color) {
		this.dimension = dimension;
		this.position = new Position(positionX, positionY);
		this.color = color;
	}

	// Getters and Setters //
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// Abstract methods //
	abstract void draw (Graphics g);
	
}