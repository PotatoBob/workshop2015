import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelsandFonts
{
	// Field Variables
	JFrame window;
	JPanel panel;
	JLabel label;
	Font font;

	public static void main(String[] args)
	{
		new JLabelsandFonts();
	}

	JLabelsandFonts()
	{
		window = new JFrame("Window");
		window.pack();
		window.setSize(1024, 768);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		window.add(panel);
		label = new JLabel("text");
		panel.add(label);
		font = new Font("Papyrus", Font.PLAIN, 500);
		label.setFont(font);
		label.setForeground(Color.BLUE);
	}

}
