package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Typingtutor implements KeyListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
int counter = 0;
static char currentLetter;
public static void main(String[] args) {
	Typingtutor tutor = new Typingtutor();
	tutor.setup(); 
}
static char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
public void setup() {

	label.setText(currentLetter + "");
	currentLetter = generateRandomLetter();
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	panel.add(label);
	frame.add(panel);
	frame.addKeyListener(this);
	frame.pack();
	frame.setVisible(true);
	
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println(arg0.getKeyChar());
	if(arg0.getKeyChar() == currentLetter) {
		System.out.println("Correct!");
		panel.setBackground(Color.green);
		counter = counter + 1;
		if(counter==15) {
			showTypingSpeed(15);
		}
	}
	else {
		panel.setBackground(Color.red);
	}
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
Date timeAtStart = new Date();

private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date();
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
} 
}
