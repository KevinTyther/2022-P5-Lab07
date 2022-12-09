import java.awt.*;
import java.applet.*;
import java.util.*;


public class Final extends Applet
{
    public void paint (Graphics g)
    {
        Background.ground(g);
        Background.sky(g);

        Mountain.far(g);
        Mountain.middle(g);
        Mountain.close(g);

        River.waterFall(g);
        River.drawRiver(g);

        Forest.firTree(g);
        Forest.rock(g);
        Forest.pineTree(g);
    }
}


