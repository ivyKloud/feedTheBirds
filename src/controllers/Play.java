package controllers;

import simulation.Simulation;
import simulation.world.Position;
import view.TheView;

/**
 * Created by Leelo on 29/10/2015.
 */
public class Play {

    public static void main(String args[]){

		int wMap = 500;
		int hMap = 500;
		int sleepDuration = 50;
		int nbBirds = 5;
		Simulation sim = new Simulation(wMap,hMap);
		TheView view = new TheView(wMap,hMap,sim);

		sim.setBirds(nbBirds);

//		sim.addFood(new Position(50,50));
//		sim.addFood(new Position(250,375));
//		sim.addFood(new Position(375,400));


		while (true) {
			//System.out.println("Tour "+i++);
			sim.nextStep();
			view.paint();

			try {
				Thread.sleep(sleepDuration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
}


