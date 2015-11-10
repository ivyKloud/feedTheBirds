package models;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Class representing a Food
 * @author major
 *
 */
public class Food extends Entity {
	
	private boolean isFresh;
	private long timeEndFreshness;
	
	private static final long TIME_FRESHNESS = 10_000;
	
	/**
	 * Initializing with a dimension of (Will be square)
	 * Color = blue when fresh, green otherwise
	 * isFresh when initializated
	 * @param positionX
	 * @param positionY
	 */
	public Food (int positionX, int positionY) {
		super(4, positionX, positionY, Color.BLUE);
		
		this.timeEndFreshness = System.currentTimeMillis() + TIME_FRESHNESS;
		this.isFresh = true;
	}
	
	/**
	 * Method for drawinf a food :
	 * Small square with a size of 4 pixels
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.position.getX(), this.position.getY(), this.dimension, this.dimension);
	}

	// Getters and Setters //
	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		if (isFresh)
			this.setColor(Color.BLUE);
		else
			this.setColor(Color.GREEN);
		
		this.isFresh = isFresh;
	}

	public long getTimeEndFreshness() {
		return timeEndFreshness;
	}

}
