import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
if(randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "You have great cheekbones");
}
else if(randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "You're gorgeous");
}
else if(randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "You're great");
}
else if(randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "You are amazing");
}
else if(randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "You are such a nice person");
}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}


}


