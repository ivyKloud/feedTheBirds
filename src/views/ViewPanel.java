package views;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import models.Bird;
import models.Food;

public class ViewPanel extends JPanel {
	
	private ArrayList<Food> foods;
	private ArrayList<Bird> birds;
	
	public ViewPanel () {
		
		this.setBackground(Color.WHITE);
		
		this.foods = new ArrayList<Food>();
		this.birds = new ArrayList<Bird>();
		
		Food food = new Food(150, 150);
		foods.add(food);
		
		Bird bird1 = new Bird(20, 20);
		Bird bird2 = new Bird(400, 400);
		birds.add(bird1);
		birds.add(bird2);
		
	}
	
	public void paintComponent (Graphics g) {
		
		g.setColor(Food.getColor());
		for (Food food : foods) {
			g.fillRect(food.getPositionX(), food.getPositionY(), food.getDimensions(), food.getDimensions());
		}
		
		g.setColor(Bird.getColor());
		for (Bird bird : birds) {
			g.fillOval(bird.getPositionX(), bird.getPositionY(), bird.getDimensions(), bird.getDimensions());
		}
		
	}

}
