package views;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import models.Bird;
import models.Food;

public class ViewPanel extends JPanel {
	
	private ArrayList<Bird> birds;
	private ArrayList<Food> foods;
	
	public ViewPanel () {
		
		this.birds = new ArrayList<Bird>();
		this.foods = new ArrayList<Food>();
		
		Bird bird1 = new Bird(20, 20);
		Bird bird2 = new Bird(400, 400);
		birds.add(bird1);
		birds.add(bird2);
		
	}
	
	public void paintComponent (Graphics g) {
		
		for (Bird bird : birds) {
			g.fillOval(bird.getPositionX(), bird.getPositionY(), bird.getDimensions(), bird.getDimensions());
		}
		
	}

}
