package _08_calculator;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	public static void addition(int number1, int number2){
	int	result = number1 + number2;
	}
	public static void multiplication(int number1, int number2){
		int	result = number1 * number2;
	}
	public static void division(int number1, int number2){
		int	result = number1 / number2;
	}
	public static void subtraction(int number1, int number2){
		int	result = number1 - number2;
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addition = new JButton("Addition");
	JButton subtraction = new JButton("Subtraction");
	JButton multiplication = new JButton("Multiplication");
	JButton division = new JButton("Division");
	JTextField input1 = new JTextField(10);
	JTextField input2 = new JTextField(10);
	public void Setup(){
		frame.add(panel);
		frame.setPreferredSize(new Dimension(300,130));
		panel.add(input1);
		panel.add(input2);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		frame.pack();
		frame.setVisible(true);
	}
}
