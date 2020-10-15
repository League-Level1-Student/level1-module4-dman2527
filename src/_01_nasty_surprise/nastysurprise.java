package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener {
	
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
		buttontreat.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		showPictureFromTheInternet("https://i1.wp.com/quadcitiesdaily.com/wp-content/uploads/2015/10/Vampire-bat1.jpg?resize=385%2C232");
	}
}

