package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import models.Model;
import views.View;

/**
 * Handle the clicks on the Window to update the model
 * @author Major
 *
 */
public class Controller implements MouseListener {

	private Model model;
	private View view;
	
	public Controller (Model model, View view) {
		
		this.model = model;
		this.view = view;
		
	}
	
	// Mouse events //
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		int clicX = arg0.getX() - 3;
		int clicY = arg0.getY() - 25;
		
		this.model.newFood(clicX, clicY);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
