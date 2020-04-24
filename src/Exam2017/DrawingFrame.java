package Exam2017;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DrawingFrame extends JFrame implements ActionListener, MouseListener {
	
	JButton quit = new JButton("Quit");
	JButton clear = new JButton("Clear");
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JRadioButton red = new JRadioButton("Red");
	JRadioButton blue = new JRadioButton("Blue");
	JRadioButton black = new JRadioButton("Black");
	JRadioButton green = new JRadioButton("Green");

	
	public DrawingFrame() {
		
		this.setVisible(true);
		this.setSize(500, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel.setBackground(Color.lightGray);
		panel.setSize(400, 100);
		this.add(panel, BorderLayout.CENTER);
		
		quit.addActionListener(this);
		clear.addActionListener(this);
		
		panel2.add(quit, BorderLayout.EAST);
		panel2.setLayout(new GridLayout(0, 1));
		panel2.add(clear);
		panel2.add(red);
		panel2.add(green);
		panel2.add(black);
		panel2.add(blue);
		this.add(panel2, BorderLayout.EAST);
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JButton) {
			
			JButton pressedButton = (JButton) e.getSource();
			
			if (pressedButton.getText().equals("Quit")) {
				this.dispose();
			}
	
		}
	}
	
//	Just the main method
	public static void main(String[] args) {
		DrawingFrame frame = new DrawingFrame();
	}
}

