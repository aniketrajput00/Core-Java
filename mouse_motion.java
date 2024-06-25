import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouse_motion extends Applet implements MouseMotionListener
{
  int x,y;
  public void init()
  {
     addMouseMotionListener(this);
  }
  public void update(Graphics g)
  {
    g.fillOval(x,y,5,5);
  }
 public void mouseMoved(MouseEvent me){}
 public void mouseDragged(MouseEvent me)
 {
   x=me.getX();
   y=me.getY();
   repaint();
 }
}
/*<applet code="mouse_motion" width="500" height="500">
    </applet> 
*/