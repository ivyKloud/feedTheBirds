package models;

import java.awt.Color;

public class Food {
	
	private boolean isFresh;
	private int dimensions;
	private int positionX;
	private int positionY;
	private static Color color = Color.BLUE;
	
	public Food (int positionX, int positionY) {
		
		this.isFresh = true;
		this.dimensions = 5;
		this.positionX = positionX;
		this.positionY = positionY;
		
	}
	
	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public int getDimensions() {
		return dimensions;
	}

	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public static Color getColor() {
		return color;
	}

}
