import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel
{
	BufferedImage BI;

	ImagePanel(String f)
	{
		try
		{
			BI = ImageIO.read(this.getClass().getResourceAsStream(f));
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(BI, 500, 200, 255, 255, null);
	}
}
