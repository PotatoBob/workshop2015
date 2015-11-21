import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WackaPole implements ActionListener {
	JFrame window;
	JPanel panel;
	int count;

	public static void main(String[] args) {
		WackaPole WP = new WackaPole();
	}

	WackaPole() {

		drawButtons(new Random().nextInt(24));
	}

	void drawButtons(int x) {

		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1400, 400);

		panel = new JPanel();

		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			if (i == x) {
				b.setText("mole!");
			}
			panel.add(b);
		}

		window.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton) e.getSource();
		if (j.getText().equals("mole!")) {
			window.dispose();
			count++;
			System.out.println(count);
			if (count < 10) {
				drawButtons(new Random().nextInt(24));
			} else {
				System.exit(0);
			}
		} else {
			speak("Waste of atoms");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
