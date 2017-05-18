import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MeuJPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Image img = null;
		
		try {
			img = ImageIO.read(new File("src/Images/pintura.jpg"));
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		super.paintComponents(g);
		
		g.drawImage(img, this.getX(), this.getY(), this.getWidth(), this.getHeight(), null);
	}
}
