import java.io.FileReader;

public class ReadFromFile
{
	int x;

	public static void main(String[] args)
	{
		ReadFromFile RFF = new ReadFromFile();
	}

	ReadFromFile()
	{
		try
		{
			FileReader fr = new FileReader("Hi my name is Bob.txt");

			while (x != -1)
			{
				System.out.print((char) x);
				x = fr.read();
			}
			for (int i = -45; i > -95; i--)
			{
				System.out.print(i + " : ");
				System.out.println((char) i);
			}
			// System.out.println((char) 73);
			// System.out.println((char) 36);
			// System.out.println((char) );
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
