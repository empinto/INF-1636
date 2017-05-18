import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MeuJPanel extends JPanel {
	
	private Graphics2D g2d;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g2d = (Graphics2D)g;
		
		Line2D lnv = new Line2D.Double(115.0, 0.0, 115.0, 130.0);
		Line2D lnh = new Line2D.Double(300.0, 115.0, 90.0, 115.0);
		
		g.drawString("Número de Títulos", 10, 10);
		g.drawString("Brasil", 130, 130);
		g.drawString("Argentina", 175, 130);
		g.drawString("Uruguai", 240, 130);
		
		g2d.draw(lnv);
		g2d.draw(lnh);
		
		Rectangle2D rtBrasil = new Rectangle2D.Double(127, 45, 35, 70);
		Rectangle2D rtArgentina = new Rectangle2D.Double(182, 85, 35, 30);
		Rectangle2D rtUruguai = new Rectangle2D.Double(243, 85, 35, 30);
		
		pintaRetangulo(rtBrasil, new Color(0, 176, 80));
		pintaRetangulo(rtArgentina, new Color(0, 112, 192));
		pintaRetangulo(rtUruguai, new Color(254, 254, 0));
		
		g.drawString("5", 140, 40);
		g.drawString("2", 195, 80);
		g.drawString("2", 257, 80);
	}
	
	private void pintaRetangulo(Rectangle2D retangulo, Color cor) {
		g2d.setPaint(cor);
		g2d.fill(retangulo);
		g2d.setStroke(new BasicStroke(1));
		g2d.setPaint(Color.BLACK);
		g2d.draw(retangulo);
	}
}