package views;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import models.Bird;
import models.Food;
import models.Model;

public class ViewPanel extends JPanel {
	
	private Model model;
	
	public ViewPanel (Model model) {
		
		this.model = model;		
		this.setBackground(Color.WHITE);
		
	}
	
	public void paintComponent (Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		ArrayList<Food> foods = this.model.getFoods();
		ArrayList<Bird> birds = this.model.getBirds();
		
		g.setColor(Food.getColor());
		for (Food food : foods) {
			g.fillRect(food.getPositionX(), food.getPositionY(), food.getDimensions(), food.getDimensions());
		}
		
		g.setColor(Bird.getColor());
		for (Bird bird : birds) {
			int centerX = bird.getPositionX() - (bird.getDimensions() / 2);
			int centerY = bird.getPositionY() - (bird.getDimensions() / 2);
			
			g.fillOval(centerX, centerY, bird.getDimensions(), bird.getDimensions());
		}
		
	}
	
	public void setModel (Model model) {
		this.model = model;		
	}

}
