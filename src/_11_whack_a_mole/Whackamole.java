package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import jdk.nashorn.internal.scripts.JO;
public class Whackamole implements ActionListener {
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
int times = 0;
int timeswrong = 0;
static Date time = new Date();
public static void setup() {
frame.add(panel);
frame.setVisible(true);
frame.setPreferredSize(new Dimension(200,200));
frame.pack();
Random random = new Random();
int random1 = random.nextInt(24);
Whackamole whack = new Whackamole();
whack.drawButtons(random1);
int time1 = time.getDate();
}

public void drawButtons(int randomnumber) {
panel.removeAll();
	for (int i = 0; i < 24; i++) {
	JButton button = new JButton();
	button.addActionListener(this);
	if(i == randomnumber) {
		button.setText("Mole");
	}
	panel.add(button);
}
frame.add(panel);
frame.setVisible(true);
frame.setPreferredSize(new Dimension(200,200));
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton button = (JButton) e.getSource();
	if(button.getText() .equals("Mole")) {
		frame.dispose();
		times = times + 1;
		if(times == 10) {
			endGame(time,times);
		}
		Random random = new Random();
		int random1 = random.nextInt(24);
		drawButtons(random1);
		
	}
	else {
		frame.dispose();
		Random random = new Random();
		int random1 = random.nextInt(24);
		timeswrong = timeswrong + 1;
		JOptionPane.showMessageDialog(null, "WRONG!");
		if(timeswrong == 5) {
			JOptionPane.showMessageDialog(null, "Cya you lose!");
			System.exit(0);
		}
		drawButtons(random1);
		
		
	}
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
    System.exit(0);
}
}
