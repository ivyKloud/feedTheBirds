package main;

import controllers.Controller;
import models.Model;
import views.View;

/**
 * Created by Leelo on 29/10/2015.
 */
public class Play {

	public static void main(String[] args) {

		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		
		model.addObserver(view); // View updates when Models notify its observers
		view.addController(controller); // The controller handles Mouse events on the view
		
	}

}
