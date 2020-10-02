package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttontrick = new JButton();
	JButton buttontreat = new JButton();
	JLabel labeltrick = new JLabel("Trick");
	JLabel labeltreat = new JLabel("Treat");
	public void create() {
		frame.add(panel);
		buttontrick.add(labeltrick);
		buttontreat.add(labeltreat);
		panel.add(buttontrick);
		panel.add(buttontreat);
		frame.pack();
		frame.setVisible(true);
	}
}

