import java.awt.Graphics;
import java.applet.Applet;

public class TicTacToe extends Applet {
    public void paint(Graphics g) {
        g.drawLine(300, 0, 300, 1000);
        g.drawLine(150,0,150,1000);
        g.drawLine(0,100,450,100);
        g.drawLine(0,200,450,200);
        g.drawLine(0,150,450,150);
        g.drawOval(50,25,50,50);
        g.drawOval(200,25,50,50);
        g.drawOval(50,225,50,50);
        g.drawOval(325,225,50,50);
        g.drawLine(25,125,100,175);
        g.drawLine(100,125,25,175);
        g.drawLine(175,125,225,175);
        g.drawLine(225,125,175,175);
        g.drawLine(325,125,375,175);
        g.drawLine(375,125,325,175);
        g.drawLine(175,225,225,275);
        g.drawLine(225,225,175,275);
        g.drawLine(375,25,325,75);
        g.drawLine(325,25,375,75);
    }
}