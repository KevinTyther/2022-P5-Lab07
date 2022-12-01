import java.awt.*;
import java.applet.*;
import java.util.*;

public class Background
{
    public static void ground(Graphics g)
    {
        g.setColor(new Color(15, 128, 15));
        g.fillRect(0,325,1000,325);
    }
    public static void sky(Graphics g)
    {
        g.setColor(new Color(93, 223, 239));
        g.fillRect(0,0,1000,325);
    }
}