import javax.swing.JOptionPane;

public class StringFun
{
	String word;
	int wl;

	public static void main(String[] args)
	{
		StringFun SF = new StringFun();
	}

	StringFun()
	{
		word = JOptionPane.showInputDialog("Give me a word");
		wl = word.length();
		for (int i = wl; i > 0; i--)
		{
			System.out.print(word.charAt(i - 1));
		}
	}
}
