package view;

import javax.swing.*;

/**
 * Created by Leelo on 10/11/2015.
 */
public class MainFrame extends JFrame {

    private JPanel panel;
    public final int marginBottom = 40,marginLeft = 17;

    public MainFrame(int width, int height){
        super("FeedTheBirds");
        this.setSize(width+marginLeft, height+marginBottom);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.panel = new JPanel();

        this.add(panel);
    }

    public JPanel getPanel() { return this.panel; }
};
