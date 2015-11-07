package models;

import java.awt.Color;

public class Bird implements Runnable {
	
	private BirdState state;
	
	private int dimensions; // Diameter
	private int positionX;
	private int positionY;
	private static Color color = Color.DARK_GRAY;
	
	public Bird (int positionX, int positionY) {
		
		this.dimensions = 40;
		this.positionX = positionX;
		this.positionY = positionY;
		
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

	@Override
	public void run() {
		
		
		
	}


}
