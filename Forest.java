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
        g.setColor(new Color(82, 59, 43));
        poly5.addPoint(75,475);
        poly5.addPoint(100,475);
        poly5.addPoint(100,450);
        poly5.addPoint(75,450);
        poly5.addPoint(75,475);
        g.fillPolygon(poly5);
        g.setColor(new Color(60, 175, 0));
        poly6.addPoint(125,450);
        poly6.addPoint(85,375);
        poly6.addPoint(50,450);
        poly6.addPoint(125,450);
        g.fillPolygon(poly6);
    }
    public static void rock(Graphics g)
    {
        g.setColor(new Color(100, 100, 100));
        Polygon poly = new Polygon();
        Polygon poly2 = new Polygon();
        poly.addPoint(50,575);
        poly.addPoint(100,575);
        poly.addPoint(75,535);
        poly.addPoint(50,575);
        g.fillPolygon(poly);
        poly2.addPoint(325,550);
        poly2.addPoint(375,550);
        poly2.addPoint(350,500);
        poly2.addPoint(325,550);
        g.fillPolygon(poly2);
    }
    public static void pineTree(Graphics g)
    {
        g.setColor(new Color(82, 59, 43));
        Polygon poly = new Polygon();
        Polygon poly2 = new Polygon();
        Polygon poly3 = new Polygon();
        Polygon poly4 = new Polygon();
        poly.addPoint(825,575);
        poly.addPoint(875,575);
        poly.addPoint(875,525);
        poly.addPoint(825,525);
        poly.addPoint(825,575);
        g.fillPolygon(poly);
        g.setColor(new Color(50, 70, 17));
        poly2.addPoint(950,525);
        poly2.addPoint(875,450);
        poly2.addPoint(925,450);
        poly2.addPoint(875,400);
        poly2.addPoint(900,400);
        poly2.addPoint(850,350);
        poly2.addPoint(800,400);
        poly2.addPoint(825,400);
        poly2.addPoint(775,450);
        poly2.addPoint(825,450);
        poly2.addPoint(750,525);
        poly2.addPoint(950,525);
        g.fillPolygon(poly2);
    }
}
