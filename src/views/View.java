package views;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import controllers.Controller;
import models.Model;

/**
 * Class representing the View (MVC)
 * It is a JFrame containing the JPanel ViewPanel
 * @author major
 * 
 */
public class View extends JFrame implements Observer {

	private Model model;
	private ViewPanel panel;
	
	public View (Model model) {
		
		this.model = model;
		
		this.panel = new ViewPanel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Feed the birds");
		this.setContentPane(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}

	/**
	 * Method called when the Model is changed and notify its observers
	 * @param arg0
	 * @param arg1 : passed by the method notifyObserver form the model
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		
		panel.animate();
		
	}

	/**
	 * Tell the controller to listen for the clicks in this view
	 * @param controller
	 */
	public void addController(Controller controller) {
		
		this.addMouseListener(controller);
		
	}
	
}
