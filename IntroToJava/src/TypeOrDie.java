import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypeOrDie
{
	JFrame window;
	JPanel panel;
	JLabel label;

	char currentLetter;

	public static void main(String[] args)
	{
		TypeOrDie TOD = new TypeOrDie();
	}

	TypeOrDie()
	{
		JFrame window = new JFrame("Type OR Die");
		window.setVisible(true);
		window.setSize(600, 400);
		JPanel panel = new JPanel();

		JLabel label = new JLabel();

		window.add(panel);
	}

	char currentLetter()
	{
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
}
