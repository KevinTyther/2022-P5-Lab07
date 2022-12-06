import java.awt.*;
import java.applet.*;
import java.util.*;

public class River
{
    public static void waterFall(Graphics g)
    {
        g.setColor(new Color(48, 173, 222));
        Polygon poly = new Polygon();
        poly.addPoint(350,175);
        poly.addPoint(350,325);
        poly.addPoint(400,325);
        poly.addPoint(400,125);
        poly.addPoint(350,175);
        g.fillPolygon(poly);
    }
    public static void drawRiver(Graphics g)
    {
        g.setColor(new Color(48, 173, 222));
        Polygon poly = new Polygon();
        poly.addPoint(400,325);
        poly.addPoint(350,325);
        poly.addPoint(400,375);
        poly.addPoint(475,425);
        poly.addPoint(550,500);
        poly.addPoint(625,575);
        poly.addPoint(650,625);
        poly.addPoint(675,650);
        poly.addPoint(725,650);
        poly.addPoint(700,575);
        poly.addPoint(675,550);
        poly.addPoint(600,475);
        poly.addPoint(525,400);
        poly.addPoint(475,375);
        poly.addPoint(425,350);
        poly.addPoint(400,325);
        g.fillPolygon(poly);
    }
}
