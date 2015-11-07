import controllers.Controller;
import models.Model;
import views.View;

/**
 * Created by Leelo on 29/10/2015.
 */
public class Play {

    public static void main(String args[]){

    	Model model = new Model();
    	View view = new View(model);
    	Controller controller = new Controller(model, view);
    	
    	view.panel.addMouseListener(controller);

    }
}


