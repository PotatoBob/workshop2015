import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIintro implements ActionListener {
	//Field Variables
	JFrame window;
	JPanel panel;
	JButton button;
	JTextField jtf;
	public GUIintro() {
		jtf = new JTextField(10);
		panel = new JPanel();
		button = new JButton("Click for surprise");
		panel.add(jtf);
		panel.add(button);
		window = new JFrame("Test");
		window.setVisible(true);
		window.setSize(500, 500); //sets size of thing
		window.add(panel);
		button.addActionListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program as soon as a window is closed
		window.pack(); //makes it the minimum size
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Keep clicking for surprise...");
		}
	}
}
