

import java.applet.Applet;
import java.awt.*;

/*
<applet code="BasicApplet" width="500" height="500">
</applet>
*/

@SuppressWarnings("removal")
public class BasicApplet extends Applet {



    public void paint(Graphics g){
        g.drawString("Hello world", 50, 50);
    }

}
