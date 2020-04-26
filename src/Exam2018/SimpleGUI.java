package Exam2018;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame implements ActionListener {
	
	private JTextField inputField;
	private JTextField outputField;
	private JButton copyButton;

	public SimpleGUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		JPanel contentPanel = new JPanel();
		this.add(contentPanel);
		inputField = new JTextField("some text");
		contentPanel.add(inputField);
		outputField = new JTextField(10);
		contentPanel.add(outputField);
		copyButton = new JButton("copy");
		
// 		What is missing is assigning the event listener to the button.
//		As this class implements the ActionListener, we just need to
//		add "this" as the method content in ".addActionListener()".
// part A
		copyButton.addActionListener(this);
		contentPanel.add(copyButton);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
// part B
		
//		first checking that the button is an instance of JButton
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			
//			then checking that the button is the "copy" button - this makes sense 
//			when there are several buttons. If it is the copy button, change texts.
			if (button.getText().equals("copy")) {
				
				outputField.setText(inputField.getText());
				inputField.setText("");
			}
		}
	}

	public static void main(String[] args) {
		new SimpleGUI();
	}
}
