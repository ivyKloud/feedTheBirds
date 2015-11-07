package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.Timer;

import models.Model;

public class View extends JFrame implements Observer {
	
	public ViewPanel panel;
	private Model model;
	
	public View (Model model) {
		
		this.model = model;
		model.addObserver(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Feed the birds");
		this.setSize(800, 800);
		this.setResizable(false);
		
		this.panel = new ViewPanel(this.model);
		this.setContentPane(panel);
		
		this.setVisible(true);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
		
		panel.repaint();
		
	}

}
