package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import models.Bird;
import models.BirdState;
import models.Food;
import models.Model;

/**
 * Panel inside the main JFrame
 * Contains the birds and foods
 *
 */
public class ViewPanel extends JPanel {
	
	private Model model;
	
	/**
	 * Initialize the view with the model to get the infos
	 * Size 800*800px
	 * @param model
	 */
	public ViewPanel (Model model) {
		
		this.model = model;
		
		this.setPreferredSize(new Dimension(800, 800));
		this.setOpaque(true);
		
	}
	
	/**
	 * Animation handling
	 */
	public void animate () {
		
		int speed = 50;
		
		final Bird test = model.getBirds().get(0);
		
		// Swing Timer to handle the animation thread
		Timer timer = new Timer(speed, null);
		
		timer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				final long now = System.currentTimeMillis();

				// Update the food freshness
				for (Food food: model.getFoods())
					if (food.isFresh())
						if (food.getTimeEndFreshness() < now)
							food.setFresh(false);
							
				// for bird in birds
				// Here it's done for 1 bird : test
				Food targetFood = null;
				int distance = 10_000;
				
				// Determine the food to target, i.e. the closest (it has to be fresh)
				for (Food food: model.getFoods()) {
					int newDistance = test.getPosition().distanceWith(food.getPosition());
					
					if (newDistance < distance && food.isFresh()) {
						distance = newDistance;
						targetFood = food;
					}
				}
				
				if (targetFood != null) {
					// Set target food for the bird
					test.setFoodLocked(targetFood);
					test.setTargetPosition(targetFood.getPosition());
					
					// If it has arrived on the food, it eats it
					if (distance == 0) {
						if (test.getState() != BirdState.EAT)
							test.setState(BirdState.EAT);
						
						// It takes TIME_EATING ms to eat
						if (now > (test.getBeginEating() + Bird.TIME_EATING)) {
							test.setFoodLocked(null);
							test.setTargetPosition(null);
							model.removeFood(targetFood);
						}
					} else {
						// If the bird is not on the food, it keeps moving
						test.setState(BirdState.MOVE);
						test.moveToTarget();
					}
					
				}
				// End for
				
				repaint();
				
			}
			
		});
		timer.start();
		
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		 
        for (Bird bird: this.model.getBirds()) {
        	bird.draw(g2d);
        }
        
        for (Food food: this.model.getFoods()) {
        	food.draw(g2d);
        }
        
	}
	
	
	
}
