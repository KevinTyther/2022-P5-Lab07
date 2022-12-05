import java.awt.*;
import java.applet.*;
import java.util.*;

public class Mountain
{
    public static void close(Graphics g)
    {
        g.setColor(Color.lightGray);
        Polygon poly = new Polygon();
        Polygon poly2 = new Polygon();
        Polygon poly3 = new Polygon();
        poly.addPoint(125,325);
        poly.addPoint(225,225);
        poly.addPoint(325,325);
        poly.addPoint(125,325);
        g.fillPolygon(poly);
        poly2.addPoint(425,325);
        poly2.addPoint(550,200);
        poly2.addPoint(675,325);
        poly2.addPoint(425,325);
        g.fillPolygon(poly2);
        poly3.addPoint(775,325);
        poly3.addPoint(875,225);
        poly3.addPoint(975,325);
        poly3.addPoint(775,325);
        g.fillPolygon(poly3);
    }
    public static void middle(Graphics g)
    {
        g.setColor(Color.gray);
        Polygon poly = new Polygon();
        Polygon poly2 = new Polygon();
        poly.addPoint(0,325);
        poly.addPoint(175,175);
        poly.addPoint(325,325);
        g.fillPolygon(poly);
        poly2.addPoint(600,325);
        poly2.addPoint(750,175);
        poly2.addPoint(900,325);
        poly2.addPoint(600,325);
        g.fillPolygon(poly2);
    }
    public static void far(Graphics g)
    {
        g.setColor(Color.darkGray);
        Polygon poly = new Polygon();
        Polygon poly2 = new Polygon();
        Polygon poly3 = new Polygon();
        poly.addPoint(0,325);
        poly.addPoint(0,225);
        poly.addPoint(150,100);
        poly.addPoint(375,325);
        poly.addPoint(0,325);
        g.fillPolygon(poly);
        poly2.addPoint(275,250);
        poly2.addPoint(450,75);
        poly2.addPoint(700,325);
        poly2.addPoint(275,325);
        g.fillPolygon(poly2);
        poly3.addPoint(800,225);
        poly3.addPoint(950,75);
        poly3.addPoint(1000,325);
        poly3.addPoint(700,325);
        g.fillPolygon(poly3);
    }

}