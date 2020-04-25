package Exam2017;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class DrawingFrame extends JFrame implements ActionListener, MouseListener {
	
	JButton quit = new JButton("Quit");
	JButton clear = new JButton("Clear");
	
//	Canvas is the drawing canvas of the app.
	Canvas panel = new Canvas();
	JToolBar panel2 = new JToolBar();
	
	JRadioButton red = new JRadioButton("Red");
	JRadioButton blue = new JRadioButton("Blue");
	JRadioButton black = new JRadioButton("Black");
	JRadioButton green = new JRadioButton("Green");
	
// 	Previous mouse coordinates selection
	private int x = 0;
	private int y = 0;

//	Method for creating the frame
	public DrawingFrame() {
		
		this.setVisible(true);
		this.setSize(500, 250);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.addMouseListener(this);
		this.add(panel, BorderLayout.CENTER);
		
		quit.addActionListener(this);
		clear.addActionListener(this);
		
		panel2.add(quit, BorderLayout.EAST);
		panel2.setLayout(new GridLayout(0, 1));
		
		panel2.add(clear);
		
		red.addActionListener(this);
		green.addActionListener(this);
		black.addActionListener(this);
		blue.addActionListener(this);
		
		panel2.add(red);
		panel2.add(green);
		panel2.add(black);
		panel2.add(blue);
		
		black.setSelected(true);
		
		panel2.setFloatable(false);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.addSeparator();
		
		this.add(panel2, BorderLayout.EAST);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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
	
//	These two Mouse Listeners check the coordinates pressed by the user
//	and once the mouse has been released, the coordinates are sent to 
//	canvas in order to draw the line.
	
	@Override
	public void mousePressed(MouseEvent e) {
		x  = e.getX();
		y = e.getY();
		System.out.println("Pressed at: " + x + " " + y);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		panel.draw(x, y, e.getX(), e.getY());
		System.out.println("Realised at: " + x + " " + y);
	}

	
	
//	The ActionListener is within this class. Nonetheless, it could be in its own class
//	as a Controller following the MVC pattern. However, the exercise does not really
//	specify that, and since it was easier to leave this in this class I did not overhead.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		Checks if the we press "Clear" or "Quit"
		if (e.getSource() instanceof JButton) {
			
			JButton pressedButton = (JButton) e.getSource();
			
			if (pressedButton.getText().equals("Quit")) {
				this.dispose();
				
			} else if (pressedButton.getText().equals("Clear")) {
				panel.clear();
			}

//		Check if we click any radio button and changes the colour of the graphics
//		in the Canvas class.
		} else if (e.getSource() instanceof JRadioButton) {
			
			JRadioButton radioButton = (JRadioButton) e.getSource();
			
			if(radioButton.getText().equals("Red")) {
				
				panel.setColor(Color.red);
				green.setSelected(false);
				black.setSelected(false);
				blue.setSelected(false);
				
			} else if(radioButton.getText().equals("Green")) {
				
				panel.setColor(Color.green.darker());
				red.setSelected(false);
				black.setSelected(false);
				blue.setSelected(false);
				
			} else if(radioButton.getText().equals("Black")) {
				
				panel.setColor(Color.black);
				green.setSelected(false);
				red.setSelected(false);
				blue.setSelected(false);
				
			} else if(radioButton.getText().equals("Blue")) {
				
				panel.setColor(Color.blue);
				green.setSelected(false);
				black.setSelected(false);
				red.setSelected(false);
			}
		}
	}
	
//	Just the main method
	public static void main(String[] args) {
		DrawingFrame frame = new DrawingFrame();
	}
}

