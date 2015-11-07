package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import models.Model;
import views.View;

public class Controller implements MouseListener {
	
	private Model model;
	private View view;
	
	public Controller (Model model, View view) {
		
		this.model = model;
		this.view = view;
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		int positionX = arg0.getX();
		int positionY = arg0.getY();
		
		// Move the birds to the point we clicked on
		this.model.moveBirds(positionX, positionY);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
