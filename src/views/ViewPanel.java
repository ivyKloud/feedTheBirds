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
		final Timer timer = new Timer(speed, null);
		// Swing Timer to handle the animation thread
		timer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean stopAnimation = true;
				
				final long now = System.currentTimeMillis();

				// Update the food freshness
				for (Food food: model.getFoods()) {
					if (food.isFresh()) {
						// If there is at least one fresh food, we won't stop the animation
						stopAnimation = false;
						
						if (food.getTimeEndFreshness() < now)
							food.setFresh(false);
					}
				}
				
				if (model.getFoods().isEmpty())
					stopAnimation = true;
							
				for (Bird bird: model.getBirds()) {
					Food targetFood = null;						
					
					int distance = 10_000;
					
					// Determine the food to target, i.e. the closest (it has to be fresh)
					for (Food food: model.getFoods()) {
						int newDistance = bird.getPosition().distanceWith(food.getPosition());
						
						if (newDistance < distance && food.isFresh() && (!food.isLocked() || bird.getState() == BirdState.EAT)) {
							distance = newDistance;
							targetFood = food;
						}
					}
															
					if (targetFood != null) {
						// Set target food for the bird
						bird.setFoodLocked(targetFood);
						bird.setTargetPosition(targetFood.getPosition());
						
						// If it has arrived on the food, it eats it
						if (distance == 0) {
							if (bird.getState() != BirdState.EAT && !targetFood.isLocked()) {
								bird.setState(BirdState.EAT);
								targetFood.setLocked(true);
							}
							
							// It takes TIME_EATING ms to eat
							if (now > (bird.getBeginEating() + Bird.TIME_EATING)) {
								bird.setFoodLocked(null);
								bird.setTargetPosition(null);
								bird.setState(BirdState.IMMOBILE);
								model.removeFood(targetFood);
							}
						} else {
							// If the bird is not on the food, it keeps moving
							bird.setState(BirdState.MOVE);
							bird.moveToTarget();
						}
						
					} 
				
				}
				
				repaint();
				
				if (stopAnimation) {
					timer.stop();
				}
					
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
