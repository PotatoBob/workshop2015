import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons implements ActionListener
{
	private static final String NUM = null;
	JFrame window;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JLabel label;
	Font font;
	int y;
	int size;
	Random r = new Random();

	public static void main(String[] args)
	{
		Buttons B = new Buttons();
	}

	public Buttons()
	{
		window = new JFrame();
		window.pack();
		window.setSize(1024, 768);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		window.add(panel);
		button1 = new JButton();
		button1.addActionListener(this);
		button1.setText("Up");
		panel.add(button1);
		button2 = new JButton();
		button2.addActionListener(this);
		button2.setText("Down");
		panel.add(button2);
		button3 = new JButton();
		button3.addActionListener(this);
		button3.setText("Color");
		panel.add(button3);
		button4 = new JButton();
		button4.addActionListener(this);
		button4.setText("Size Up");
		panel.add(button4);
		button5 = new JButton();
		button5.addActionListener(this);
		button5.setText("Size Down");
		panel.add(button5);
		label = new JLabel(y + "");
		font = new Font("Arial", Font.PLAIN, 50 + size);
		label.setFont(font);
		label.setForeground(new Color(0, 0, 0));
		panel.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button1)
		{
			y++;
			label.setText(y + "");
		} else if (e.getSource() == button2)
		{
			y--;
			label.setText(y + "");
		} else if (e.getSource() == button3)
		{
			label.setForeground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
		} else if (e.getSource() == button4)
		{
			size += 10;
			font = new Font("Arial", Font.PLAIN, 50 + size);
			label.setFont(font);
		} else if (e.getSource() == button5)
		{
			size -= 10;
			font = new Font("Arial", Font.PLAIN, 50 + size);
			label.setFont(font);
		}
	}

}
