import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UpDownLeftRight implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton up;
	JButton down;
	JButton left;
	JButton right;
	int direction = -1;

	public static void main(String[] args) {
		UpDownLeftRight UDLR = new UpDownLeftRight();
	}

	UpDownLeftRight() {
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		up = new JButton();
		up.setText("Up");
		up.addActionListener(this);
		panel.add(up);

		down = new JButton();
		down.setText("Down");
		down.addActionListener(this);
		panel.add(down);

		left = new JButton();
		left.setText("Left");
		left.addActionListener(this);
		panel.add(left);

		right = new JButton();
		right.setText("Right");
		right.addActionListener(this);
		panel.add(right);

		window.add(panel);
		window.setSize(600, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == up) {
			if (direction != 0) {
				System.out.println("up");
				direction = 0;
			}
		}
		if (e.getSource() == down) {
			if (direction != 1) {
				System.out.println("down");
				direction = 1;
			}
		}
		if (e.getSource() == left) {
			if (direction != 2) {
				System.out.println("left");
				direction = 2;
			}
		}
		if (e.getSource() == right) {
			if (direction != 3) {
				System.out.println("right");
				direction = 3;
			}
		}

	}

}
