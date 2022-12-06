import java.awt.*;
import java.applet.*;
import java.util.*;

public class Forest
{
    public static void firTree(Graphics g)
    {
        g.setColor(new Color(82, 59, 43));
        Polygon poly = new Polygon();
        Polygon poly2 = new Polygon();
        Polygon poly3 = new Polygon();
        Polygon poly4 = new Polygon();
        Polygon poly5 = new Polygon();
        Polygon poly6 = new Polygon();
        poly.addPoint(175,525);
        poly.addPoint(200,525);
        poly.addPoint(200,500);
        poly.addPoint(175,500);
        poly.addPoint(175,525);
        g.fillPolygon(poly);
        g.setColor(new Color(60, 175, 0));
        poly2.addPoint(150,500);
        poly2.addPoint(225,500);
        poly2.addPoint(185,425);
        poly2.addPoint(150,500);
        g.fillPolygon(poly2);
        g.setColor(new Color(82, 59, 43));
        poly3.addPoint(275,500);
        poly3.addPoint(300,500);
        poly3.addPoint(300,450);
        poly3.addPoint(275,450);
        poly3.addPoint(275,500);
        g.fillPolygon(poly3);
        g.setColor(new Color(60, 175, 0));
        poly4.addPoint(250,450);
        poly4.addPoint(325,450);
        poly4.addPoint(285,375);
        poly4.addPoint(250,450);
        g.fillPolygon(poly4);
    }
    public static void rock(Graphics g)
    {

    }
    public static void pineTree(Graphics g)
    {

    }
}
