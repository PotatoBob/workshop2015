import javax.swing.JOptionPane;


public class CanHeRide
{
public static void main(String[] args)
{
	String height = JOptionPane.showInputDialog(null, "What is your height in inches?");
	int heightinch = Integer.parseInt(height);
	if(heightinch >= 50) {
		JOptionPane.showMessageDialog(null, "You may enter the ride.");
	}
	else {
		JOptionPane.showMessageDialog(null, "GO");
	}
}
}
