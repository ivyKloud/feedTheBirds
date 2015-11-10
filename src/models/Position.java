package models;

public class Position {
	
	private int x;
	private int y;
	
	public Position (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Distance between 2 positions
	 * @param otherPosition => the position calcul the distance with
	 * @return the distance
	 */
	public int distanceWith (Position otherPosition) {
		if (otherPosition != null) {
			int distX = Math.abs(this.x - otherPosition.getX());
			int distY = Math.abs(this.y - otherPosition.getY());
			
			return (int) Math.sqrt(distX * distX + distY * distY);
		} else
			return -1;
	}
	
	// Getters and Setters //
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}