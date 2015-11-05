package models;

public class Bird {
	
	private int dimensions;
	private int positionX;
	private int positionY;
	
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
	
	

}
