package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Translate");
	JTextField textfield = new JTextField();
	JTextField textfield1 = new JTextField();
public void setup(){
	frame.add(panel);
	panel.add(textfield);
	panel.add(button);
	panel.add(textfield1);
	button.setPreferredSize(new Dimension(300,30));
	textfield.setPreferredSize(new Dimension(250,30));
	textfield1.setPreferredSize(new Dimension(250,30));
	button.setPreferredSize(new Dimension(100,30));
	button.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
}

PigLatinTranslator piglatintranslator = new PigLatinTranslator();
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String Input = textfield.getText();
	String result = piglatintranslator.translate(Input);
	textfield1.setText(result);
}
}
