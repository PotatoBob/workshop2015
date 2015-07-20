import javax.swing.JOptionPane;


public class ThreeNumbersPart2
{
public static void main(String[] args)
{
	String x = JOptionPane.showInputDialog("Gimme a number");
	String y = JOptionPane.showInputDialog("Gimme a number");
	String z = JOptionPane.showInputDialog("Gimme a number");
	int n1 = Integer.parseInt(x);
	int n2 = Integer.parseInt(y);
	int n3 = Integer.parseInt(z);
	if(n3>=n2 && n2>=n1) {
		JOptionPane.showMessageDialog(null, n3+", "+n2+", "+n1);
	}
	else if(n3>=n1 && n1>=n2) {
		JOptionPane.showMessageDialog(null, n3+", "+n1+", "+n2);
	}
	else if(n2>=n3 && n3>=n1) {
		JOptionPane.showMessageDialog(null, n2+", "+n3+", "+n1);
	}
	else if(n2>=n1 && n1>=n3) {
		JOptionPane.showMessageDialog(null, n2+", "+n1+", "+n3);
	}
	else if(n1>=n3 && n3>=n2) {
		JOptionPane.showMessageDialog(null, n1+", "+n3+", "+n2);
	}
	else if(n1>=n2 && n2>=n3) {
		JOptionPane.showMessageDialog(null, n1+", "+n2+", "+n3);
	}
}
}
