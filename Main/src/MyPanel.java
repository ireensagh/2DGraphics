import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	Image image;
	MyPanel() {
		
		image = new ImageIcon("o.jpeg").getImage();
		this.setPreferredSize(new Dimension (500,500));
	}
		
	public void paint(Graphics g) {
			Graphics2D g2D = (Graphics2D) g;
			
			g2D.drawImage(image,0,0,null);
			g2D.setStroke(new BasicStroke(5));
			//g2D.drawLine(0, 0, 500, 500);
			//g2D.drawRect(0, 100, 300, 200);
			//g2D.fillRect(0, 100, 300, 200);
			//anything that is more recently created id going to overlap 
			//the previous items or graphics
			//g2D.setPaint(Color.orange);
			//g2D.fillOval(0, 0, 100, 100);
			//g2D.setPaint(Color.red);
			//g2D.fillArc(0,0,100,100,0,180);
			//g2D.setPaint(Color.white);
			//g2D.fillArc(0,0,100,100,180,180);
			
			
			/*int[] xPoints = {150,250,350};
			int[] yPoints = {300,150,300};
			g2D.drawPolygon(xPoints,yPoints,3);
			
			g2D.setPaint(Color.MAGENTA);
			g2D.setFont(new Font("Ink Free",Font.BOLD,50));
			g2D.drawString("u are a winner",50,50);
			*/
			
		
			
		}
}
