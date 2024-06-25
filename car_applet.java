import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class car_applet extends Applet implements ActionListener
{
  int i;
  Button b1,b2;
  public void init()
  {
    setLayout(new FlowLayout());
    b1=new Button("Forward");
    b2=new Button("Backward");
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
 public void paint(Graphics g)
 {
   g.drawRect(100+i,100,100,50);
   g.fillOval(110+i,150,30,50);
   g.fillOval(160+i,150,30,50);
   g.drawLine(00,200,700,200);
 }
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
     i=i+10;
     repaint();
  }
 if(ae.getSource()==b2)
 {
   i=i-10;
   repaint();
 }
}
}
/*<applet code="car_applet" width="500" height="700">
</applet>*/