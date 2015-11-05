package views;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class View extends JFrame implements Observer {

	public View () {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Feed the birds");
		this.setSize(800, 800);
		this.setResizable(false);
		
		ViewPanel panel = new ViewPanel();
		this.setContentPane(panel);
		
		this.setVisible(true);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
