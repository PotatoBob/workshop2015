// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args)
	{
	// 1. Set the passcode in a String variable
	String passcode = "kvr3mfjorhfr3endjwn";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
	String message = JOptionPane.showInputDialog("Gimme a secret message");
	// 3. Ask your friend for the passcode and store it in a variable
	String answer = JOptionPane.showInputDialog("What's the passcode?");
	// 4. If the passcode matches, show the secret message
	if(passcode.equals(answer)) {
		JOptionPane.showMessageDialog(null, message);
	}
	// 5. If the passcode does not match, pop-up "INTRUDER!!"
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER!!");
	}
	}

}

